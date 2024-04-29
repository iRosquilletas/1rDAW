#!/bin/bash
clear
echo "Número de variables pasadas como parámetros: $#"
echo "Estas son las variables: $*"
echo "Nombre del script: $0"

j=1
for i in $*
do
	echo "Parámetro $j:$i"
	#j=$(($j + 1))
	((j ++))
done
