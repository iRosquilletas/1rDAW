#!/bin/bash

# Solicitar un número al usuario
read -p "Introduce un número: " num

# Imprimir el cuadrado con asteriscos
for ((i = 1; i <= num; i++)); do
    for ((j = 1; j <= num; j++)); do
        echo -n "*"
    done
    echo
done

