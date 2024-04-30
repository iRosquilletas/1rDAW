#!/bin/bash


# Comprobar si el script se ejecuta con permisos de administracion

if [ "$EUID" -ne 0 ]
then
	echo "Por favor, ejecuta este script como root"
	exit 1
fi

# Creo/inicializo el array que guardará el listado de los usuarios reparados

usuarios_reparados=()

# Función que repara usuarios

reparar_usuario() {
	usuario=$1
	pass_inicial=$2

	# Primero busco el nombre del grupo en /etc/group
	grupo=$(grep "^$usuario:" /etc/group | cut -d: -f1)

	# Creo el directorio home del usuario, si no existe
	if [ ! -d "/home/$usuarioi" ]
	then
		mkdir "/home/$usuario"
		chown $usuario:$grupo "/home/$usuario"
		chmod 750 "/home/$usuario"

		# Compruebo si hubo algún error al crear el directorio
		if [ $? -ne 0 ]
		then
			echo "Hubo un error inesperado al intentar crear el HOME del usuario $usuario"
			return 2
		fi
	fi

	# Configuro la contraseña que hemos solicitado
	# y fuerzo el cambio en el próximo inicio de sesión

	echo "$usuario:$pass_inicial" | chpasswd
	chage -d 0 $usuario

	# Compruebo si hubo algún error al configurar la contraseña inicial

	if [ $? -ne 0 ]
	then
		echo "Hubo un error inesperado al intentar fijar la contraseña inicial del usuario $usuario"
		return 3
	fi

	# Añado el usuario que hemos reparado al array de usuarios reparados 
	usuarios_reparados+=($usuario)
}


# Pido la contraseña inicial que vamos a poner a los usuarios reparados 
read -p "Introduce la contraseña inicial para los usuarios reparados: " pass_inicial

# Validamos la contraseña inicial suministrada

if [ ${#pass_inicial} -lt 8 ] || ! [[ "$pass_inicial" =~ [0-9] ]] || ! [[ "$pass_inicial" =~ [a-z] ]] || ! [[ "$pass_inicial" =~ [A-Z] ]] || ! [[ "$pass_inicial" =~ [^a-zA-Z0-9] ]]
then
	echo "La contraseña inicial no cumple con los criterios de seguridad.
	Debe tener al menos 8 caracteres, incluyendo al menos un número, una letra minúscula, una letra mayúscula y un carácter especial."
	exit 1
fi

# Recorremos /etc/passwd en busca de usuarios a los que les falte el home
# y llamaos a la funcion de reparar usuarios

while IFS=: read -r usuario _ uid _ _ home _
do
	# excluyo de la creación del HOME a los usuarios del sistema
	# también evito que cree usuarios con id muy alto como por ejemplo nobody
	if [ "$uid" -ge 1000 ] && [ "$uid" -lt 2000 ]
	then
		if [ ! -d "$home" ]; then
			reparar_usuario $usuario $pass_inicial
		fi
	fi

done < /etc/passwd

# Listamos los usuarios reparados

echo "Los usuarios que han sido reparados son: ${usuarios_reparados[@]}"
echo "La contraseña inicial de estos usuarios es $pass_inicial"
echo "Se ha forzado un cambio de contraseña en el primer inicio de sesión"




