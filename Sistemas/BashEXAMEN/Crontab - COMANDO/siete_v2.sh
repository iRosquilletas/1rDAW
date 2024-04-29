#!/bin/bash

a=`systemctl status apache2 | grep "Active: active (running)"`

if [ -n  "$a" ]; then
	echo "El servicio está activo"
else
	echo "El servicio no está activo"

	read -p "Quieres activar el servicio?" a
	case $a in
		[sS]*)
			echo "Activando el apache"
			systemctl start apache2
			echo "Apache2 activado"
			;;
		[nN]*)
			echo "Vale, no lo activamos puto"
			;;
		*)
			echo "No valido"
			;;
		esac
fi
