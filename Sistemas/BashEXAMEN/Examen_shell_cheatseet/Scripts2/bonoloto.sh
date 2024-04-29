#!/bin/bash

bonoloto=()

for i in {1..6}
do
	existe=1
	while [ $existe -eq 1 ]
	do
		num=$(( RANDOM % 49 + 1 ))
		existe=0
		for val in "${bonoloto[@]}"
		do
			if [ $val -eq $num ]
			then 
				existe=1
				echo "El número $num ya existia"
				break
			fi
		done
	done
	bonoloto+=($num)
done

#Ordena la salida
bonoloto_ordenada=($(for i in "${bonoloto[@]}"; do echo $i; done | sort -n))

#Imprimir
echo "Tu jugada de la Bonoloto es: ${bonoloto_ordenada[@]}"


