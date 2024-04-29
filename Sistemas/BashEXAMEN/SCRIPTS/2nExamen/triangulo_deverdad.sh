#!/bin/bash

# Solicitar al usuario la altura del triángulo
read -p "Introduce la altura del triángulo: " altura

# Iterar sobre cada fila del triángulo
for ((i = 1; i <= altura; i++)); do
    # Imprimir espacios en blanco para alinear los asteriscos
    for ((espacios = altura - i; espacios > 0; espacios--)); do
        echo -n " "
    done
    
    # Imprimir asteriscos
    for ((asteriscos = 1; asteriscos <= 2 * i - 1; asteriscos++)); do
        echo -n "*"
    done
    
    # Cambiar de línea para la siguiente fila
    echo ""
done

