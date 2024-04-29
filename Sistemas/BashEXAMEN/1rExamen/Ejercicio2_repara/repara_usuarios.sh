#!/bin/bash

read -p "Introduce el usuario el cual quieres recuperar" user

echo "Creando directorio de trabajo para el usuario $user"

mkdir /home/$user

echo "Ahora deberá introducir la contraseña para el usuario: "
passwd $user


read -p "Introduce el grupo principal al que pertenece: " group

echo "Cambiando los permisos de la carpeta propietaria del usuario $user"
chown $user:$group /home/$user









