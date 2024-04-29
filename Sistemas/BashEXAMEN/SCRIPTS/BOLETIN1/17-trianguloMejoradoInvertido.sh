#!/bin/bash

read -p "Dime el número de filas: " n

for (( i=$n; i>=1; i-- )); do
    espacio=$((n-i))
    for (( j=1; j<=$espacio; j++ )); do
        echo -n " "
    done
    a=$((i*2-1))
    for (( j=1; j<=a; j++ )); do
        echo -n "*"
    done
    echo
done

