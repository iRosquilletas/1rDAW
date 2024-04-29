#!/bin/bash

# Solicitar al usuario el ancho y alto del rectángulo
read -p "Introduce el ancho del rectángulo: " ancho
read -p "Introduce el alto del rectángulo: " alto

# Inicializar la letra a imprimir
letra="A"

# Iterar sobre cada fila del rectángulo
for ((i = 1; i <= alto; i++)); do
    # Determinar la letra a imprimir en la fila actual
    if [ $((i % 2)) -eq 0 ]; then
        letra="B"
    else
        letra="A"
    fi

    # Imprimir las letras en la fila actual
    for ((j = 1; j <= ancho; j++)); do
        echo -n "$letra"
    done
    
    # Cambiar de línea para la siguiente fila
    echo ""
done

