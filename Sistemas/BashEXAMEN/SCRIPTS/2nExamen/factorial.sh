#!/bin/bash

while true; do
    # Solicitar al usuario un número
    read -p "Introduce un número para calcular su factorial: " numero

    factorial=1
    # Calcular el factorial
    for ((i = 1; i <= $numero; i++)); do
        factorial=$((factorial * i))
    done

    # Mostrar el resultado
    echo "El factorial de $numero es: $factorial"

    # Preguntar al usuario si desea calcular otro factorial
    read -p "¿Deseas calcular el factorial de otro número? (s/n): " respuesta

    # Salir del bucle si la respuesta es 'n' o 'N'
    if [ "$respuesta" != "s" ]; then
        break
    fi
done

echo "¡Hasta luego!"

