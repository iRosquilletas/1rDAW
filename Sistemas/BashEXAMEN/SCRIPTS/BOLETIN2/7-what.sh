#!/bin/bash

# Comprobar si el script se ejecuta como superusuario
if [ $EUID -ne 0 ]
then
    echo "Este script debe ser ejecutado con permisos de superUsuario"
    exit 1
fi

# Obtener la ubicación del archivo
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

# Leer el archivo y crear grupos
while IFS=';' read -r login password grupo
do
    # Verificar si es la primera línea (encabezados de columna)
    if [[ "$login" == "login" && "$password" == "password" && "$grupo" == "grupo" ]]
    then
        continue  # Saltar la primera línea
    fi

    # Crear el grupo si no existe
    if ! grep -q "^$grupo:" /etc/group
    then
        echo "voy a crear el grupo $grupo porque no existe"
        groupadd "$grupo"
    fi

done < "$fichero"

# Leer el archivo y crear usuarios
while IFS=';' read -r login password grupo
do
    # Verificar si es la primera línea (encabezados de columna)
    if [[ "$login" == "login" && "$password" == "password" && "$grupo" == "grupo" ]]
    then
        continue  # Saltar la primera línea
    fi

    echo "login vale $login, password vale $password y grupo vale $grupo"
    if [[ $login != "LOGIN" ]]
    then
        # Crear el usuario con su grupo y contraseña
        # Faltaría verificar con anterioridad si el usuario existe previamente
        useradd -m -g "$grupo" "$login"
        echo -e "$login:$password" | chpasswd
    fi
done < "$fichero"

