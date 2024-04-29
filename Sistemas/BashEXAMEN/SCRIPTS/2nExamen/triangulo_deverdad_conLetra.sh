#!/bin/bash

# Solicitar al usuario la altura del triángulo
read -p "Introduce la altura del triángulo: " altura

# Inicializar la letra a imprimir
letra="A"

# Iterar sobre cada fila del triángulo
for ((i = 1; i <= altura; i++)); do
    # Imprimir espacios en blanco para alinear las letras
    for ((espacios = altura - i; espacios > 0; espacios--)); do
        echo -n " "
    done
    
    # Determinar la letra a imprimir en la fila actual
    if [ $((i % 2)) -eq 0 ]; then
        letra="B"
    else
        letra="A"
    fi

    # Imprimir las letras en la fila actual
    for ((j = 1; j <= i; j++)); do
        echo -n "$letra "
    done
    
    # Cambiar de línea para la siguiente fila
    echo ""
done

