#!/bin/bash

read -p "Dime el número dei filas: " n

for (( i=1; i<=$n; i++ ))
do      
	espacio=$((n-i))
        for (( j=1; j<=$espacio; j++ ))
        do
		echo -n " "
        done
	a=$((i*2-1))
	for ((j=1; j<=a; j++))
	do
		echo -n "*" #El espacio crea el triangulo
	done
#	for ((j=1;j<=i;j++))
#	do
#		echo -n "*"
#	done
        
	echo
done    





