#!/bin/bash

# Verificar si se proporcionó un argumento
if [ $# -ne 1 ]; then
    echo "Uso: $0 <archivo>"
    exit 1
fi

archivo=$1

# Verificar si el archivo existe
if [ ! -f "$archivo" ]; then
    echo "El archivo '$archivo' no existe."
    exit 1
fi

# Contar las vocales en el archivo
a=$(grep -o -i 'a' "$archivo" | wc -l)
e=$(grep -o -i 'e' "$archivo" | wc -l)
i=$(grep -o -i 'i' "$archivo" | wc -l)
o=$(grep -o -i 'o' "$archivo" | wc -l)
u=$(grep -o -i 'u' "$archivo" | wc -l)

total=$((a + e + i + o + u))

# Mostrar el resultado
echo "El archivo '$archivo' contiene:"
echo " - $a 'a' vocales"
echo " - $e 'e' vocales"
echo " - $i 'i' vocales"
echo " - $o 'o' vocales"
echo " - $u 'u' vocales"
echo "Total de vocales: $total"

