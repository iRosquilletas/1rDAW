#!/bin/bash

# Solicitar al usuario el ancho y alto del rectángulo
read -p "Introduce el ancho del rectángulo: " ancho
read -p "Introduce el alto del rectángulo: " alto

# Iterar sobre cada fila del rectángulo
for ((i = 1; i <= alto; i++)); do
    # Imprimir una fila de asteriscos
    for ((j = 1; j <= ancho; j++)); do
        echo -n "*"
    done
    
    # Cambiar de línea para la siguiente fila
    echo ""
done

