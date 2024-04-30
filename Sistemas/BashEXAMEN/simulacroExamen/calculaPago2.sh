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

while IFS=',' read autor titulo palabras
do
    # Calcular el pago
    pago=$(echo "scale=2; $palabras * 0.10" | bc)
    # Mostrar el resultado
    echo "$autor $palabras ${pago}€"
done < "$archivo" > pagar-$(date +%B).txt


