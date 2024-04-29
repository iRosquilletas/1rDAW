#!/bin/bash
clear
echo
read -p "Introduce el nombre: " NOMBRE
EXISTE=`grep $NOMBRE /etc/passwd`
echo
if [ -z "$EXISTE" ]
then
	echo "$NOMBRE no tiene un usuario creado"
else
	echo "$NOMBRE tiene un usuario creado"
fi
echo

