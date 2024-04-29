#!/bin/bash

echo -n "Introduzca su nombre: "
read a
b=`grep -c $a /etc/passwd`

if [ $b -gt 0 ]
then
	echo "El usuario está en el fichero"
else
	echo "No está el usuario"
fi



