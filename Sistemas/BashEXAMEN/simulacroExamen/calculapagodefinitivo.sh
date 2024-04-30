#!/bin/bash

archivo="$1"

# Comprobar si se pasó un archivo como argumento
if [ ! -f "$archivo" ]; then
    echo "No se pasó un archivo como argumento."
    exit 1
fi

# Declarar arrays asociativos para almacenar el número de artículos, palabras y pago por autor
declare -A articulos_por_autor
declare -A palabras_por_autor
declare -A pago_por_autor

while IFS=',' read autor titulo palabras; do
    # Incrementar el contador de artículos para este autor
    ((articulos_por_autor[$autor]++))
    # Sumar el número de palabras para este autor
    ((palabras_por_autor[$autor]+=$palabras))
    # Calcular el pago por este artículo y sumarlo al total para este autor
    pago=$(echo "scale=2; $palabras * 0.10" | bc)
    pago_por_autor[$autor]=$(echo "scale=2; ${pago_por_autor[$autor]} + $pago" | bc)
done < "$archivo" > pagar-$(date +%B).txt

# Mostrar el número total de artículos, palabras y pago por autor
for autor in "${!articulos_por_autor[@]}"; do
    echo "$autor ${articulos_por_autor[$autor]} artículos ${palabras_por_autor[$autor]} palabras ${pago_por_autor[$autor]}€"
done >> pagar-$(date +%B).txt

