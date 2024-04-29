#!/bin/bash

read -p "Introduce un número: " n

# Dibujar el cuadrado
for ((i=1; i<=n; i++))
do
    for ((j=1; j<=n; j++))
    do
        echo -n "$i "
    done
    echo
done

