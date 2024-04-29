#!/bin/bash


while true;
do
read -p "Introduce que quieres: " opcion
declare -A diccionario
diccionario=([coche]='20€ / km' [furgoneta]='10€ / km' [bicicleta]='5€ / km')


case $opcion in 
	coche)
		echo ${diccionario[coche]}
		;;
		
	furgoneta)
		echo ${diccionario[furgoneta]}
		;;
	bicicleta)
		echo ${diccionario[bicicleta]}
		;;
	q)
		exit 0
		;;
	*)
		echo "opción invalida"
		;;
esac
done
