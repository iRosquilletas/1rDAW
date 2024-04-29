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

<<-COMENTARIO
Generación de números aleatorios:

Utiliza un bucle for para iterar seis veces (una vez por cada número que debe contener la jugada).
Dentro del bucle, se genera un número aleatorio entre 1 y 49 (inclusive) utilizando la expresión $(( RANDOM % 49 + 1 )).
Antes de agregar el número generado a la jugada, se verifica si ya existe en la jugada actual. Si ya existe, se genera otro número.
Ordenación de la salida:

Después de generar los números aleatorios, se ordenan utilizando el comando sort -n. Esto ordena los números de menor a mayor.
Impresión de la jugada:

Finalmente, se imprime la jugada ordenada utilizando echo.
<<COMENTARIO
