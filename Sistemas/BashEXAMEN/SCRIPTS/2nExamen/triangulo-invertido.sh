#!/bin/bash

# Solicitar al usuario la altura del triángulo
read -p "Introduce la altura del triángulo: " altura

letra="A"
for ((i = altura; i >= 1; i--)); do
    for ((j = 1; j <= i; j++)); do
        echo -n "$letra"
    done
    echo ""
    if [ "$letra" == "A" ]; then
        letra="B"
    else
        letra="A"
    fi
done

