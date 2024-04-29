#!bin/bash

# Comprobar si el script se ejecuta como superusuario
if [$EUID -ne 0 ]
then
	echo "Este script debe ser ejecutado con permisos de superUsuario"
	exit 1
fi


#Obtener la ubicación del archivo
while :
	read -p "Escribe la ruta del archivo: " fichero
	if [[ -r $fichero ]]

	then
		break
	else
	echo "Error: el archivo no existe. Introduce la ubicación nuevamente"
	fi
done



while IFS=';' read login password grupo
do
	echo "login vale $login, password vale $password y grupo vale $grupo"
	if [[ $login != "LOGIN" ]]
	then
		# Crear el grupo si no existe
		EXISTE=`grep "$grupo" /etc/group`
		if  [ -z $EXISTE ]
	##if ! grep -q "^$grupo:" /etc/group
	then
		echo "EXISTE vale $EXISTE"
		echo "voy a crear el grupo $grupo porque no exite"
		groupadd "$grupo"
	fi
# Crear el usuario con su grupo y contraseña
# Faltaría verificar con anterioridad si el usuario existe previamente
# Useradd -m -p "$(openssl passwd -1 "$password")" -g "$grupo" "$login"
	useradd -m -g "$grupo" "$login"
	echo -e "$login:$password" | chpasswd
	fi
done < $fichero





