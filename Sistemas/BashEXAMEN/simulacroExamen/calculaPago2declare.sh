#!/bin/bash

# Para calcular el pago de los periodistas
# si el periodista sólo escribe un artículo al mes
# rm -f pagar-$(date +%B).txt

# Leer el archivo pasado como argumento
archivo="$1"

# Comprobar si se pasó un archivo como argumento
if [ ! -f "$archivo" ]; then
    echo "No se pasó un archivo como argumento."
    exit 1
fi

declare -A articulos_por_autor

while IFS=',' read autor titulo palabras
do
((articulos_por_autor[$autor]++))

    # Calcular el pago
    pago=$(echo "scale=2; $palabras * 0.10" | bc)
    



    echo "$autor $palabras palabras  ${pago}€"
done < "$archivo" > pagar-$(date +%B).txt

for autor in "${!articulos_por_autor[@]}"; do
	echo "$autor ${articulos_por_autor[$autor]} artículos"
done >> pagar-$(date +%B).txt

