#!/bin/bash

if systemctl is-active apache2; then 
	echo "El servicio Apache2 está activo."
else
	echo "El servicio Apache2 no está activo."
	read -p "Quieres activar el servicio?(s/n)" a
	case $a in 
		[Ss]*)
			sudo systemctl start apache2
			echo "El servicio se activó"
			;;
		[Nn]*)
			echo "El servicio Apache2 no fue activado."
			;;
		*)
			echo "Opción no valida."
			;;
		esac
fi
