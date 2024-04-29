#!bin/bash

# Comprobar si el script se ejecuta como superusuario
if [ $EUID -ne 0 ]
then
	echo "Este script debe ser ejecutado con permisos de superUsuario"
	exit 1
fi


#Obtener la ubicación del archivo
while :
do
	read -p "Escribe la ruta del archivo: " fichero
	if [[ -r "$fichero" ]]

	then
		break
	else
	echo "Error: el archivo no existe. Introduce la ubicación nuevamente"
	fi
done



while IFS=';' read login password grupo
do
	if [[ "$login" == "login" && "$password" == "password" && "$grupo" == "grupo" ]]
	then
        continue  # Saltar la primera línea
	fi
	echo "login vale $login, password vale $password y grupo vale $grupo"
	if [[ $login != "LOGIN" ]]
	then
		# Crear el grupo si no existe
		EXISTE=`grep "$grupo" /etc/group`
		if  [ -z "$EXISTE" ]
	##if ! grep -q "^$grupo:" /etc/group
	then
		echo "Cree el grupo y ya existe, denada. $EXISTE"
	else
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



<<-COMENTARIO
Comprueba si se está ejecutando como superusuario:

Utiliza la variable $EUID para verificar si el ID de usuario efectivo es 0, que es el ID del superusuario (root).
Si el ID de usuario efectivo no es 0, muestra un mensaje de error y sale del script con un código de salida 1, lo que indica un error.
Solicita al usuario la ubicación del archivo:

Utiliza un bucle while para solicitar continuamente al usuario que introduzca la ruta del archivo hasta que se proporcione una ubicación válida.
Verifica si el archivo es legible (-r) utilizando la expresión condicional [[ -r "$fichero" ]].
Si el archivo no es legible, muestra un mensaje de error y solicita al usuario que vuelva a introducir la ubicación.
Lee el archivo línea por línea y extrae los campos login, password y grupo:

Utiliza un bucle while con la estructura while IFS=';' read login password grupo para leer el archivo y separar los campos utilizando el delimitador ";".
Ignora la primera línea del archivo, que suele ser una cabecera, utilizando una condición if para comparar los valores de los campos con "login", "password" y "grupo".
Si el campo login no es "LOGIN", el script procede a crear el grupo y el usuario correspondientes.
Verifica si el grupo ya existe en /etc/group utilizando grep.
Si el grupo no existe, muestra un mensaje indicando que se creó el grupo.
Si el grupo no existe, utiliza el comando groupadd para crear el grupo.
Utiliza el comando useradd para crear el usuario con el grupo especificado y el directorio de inicio predeterminado (-m).
Utiliza el comando chpasswd para establecer la contraseña del usuario.

En resumen, este script solicita al usuario la ubicación de un archivo CSV, lee el archivo línea por línea, crea grupos y usuarios basados en los datos del archivo y establece las contraseñas 
para los usuarios. Además, verifica si se ejecuta con permisos de superusuario antes de continuar.
COMENTARIO


