#!/bin/bash

# Verificar si se proporcionó un archivo como argumento
if [ $# -eq 0 ]; then
    echo "Uso: $0 <archivo.csv>"
    exit 1
fi

# Verificar si el archivo existe
if [ ! -f "$1" ]; then
    echo "El archivo '$1' no existe."
    exit 1
fi

# Pedir al usuario el campo por el que ordenar
read -p "¿Por qué campo quieres ordenarlo? " campo

# Nombre del archivo de entrada
archivo="$1"

# Nombre del archivo de salida
archivo_ordenado="${archivo%.*}_ord.${archivo##*.}"

# Ordenar el archivo por el campo especificado y guardar el resultado en un nuevo archivo
sort -t',' -k"$campo" "$archivo" > "$archivo_ordenado"

echo "El resultado está en el fichero '$archivo_ordenado'."

