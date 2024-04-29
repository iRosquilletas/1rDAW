#!/bin/bash
#while true; do
echo "1- Guarda"
echo "2- Salir"

read -p "Introduce una opción: " pregunta

case $pregunta in 	
	1)
		echo "Bienvenido al programa Guarda"
		if [ ! -d $HOME/seguridad ]
		then
			echo "No existía el directorio voy a crearlo"
			mkdir $HOME/seguridad
		fi
		cp * $HOME/seguridad
		echo "Se han guardado los ficheros"
		
		echo
		;;
	2)
		echo "Saliendo del programa"
		exit 0
		;;
	*) 
		echo "Caracter invalido"
		;;

	esac
