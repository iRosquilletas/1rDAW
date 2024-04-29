#!/bin/bash
clear

read -p "num1: " n1
read -p "num2: " n2
read -p "operador(+,-,/,*): " operador

case $operador in
	+)
		echo $(( $n1 + $n2 ))
		;;
	-)
		echo $(( $n1 - $n2 ))
		;;
	/)
		echo $(( $n1 / $n2 ))
		;;
	x)
		echo $(( $n1 * $n2 ))
		;;
	*)
		echo "Valor incorrecto"
esac
















