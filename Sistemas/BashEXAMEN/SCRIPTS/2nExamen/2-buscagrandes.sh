#!/bin/bash

# Solicitar al usuario el tamaño mínimo de los archivos que desea buscar
read -p "Introduce el tamaño mínimo de los archivos (en bytes): " tamano_minimo

# Directorio de búsqueda
read -p "Introduce la ruta de la carpeta de la cual quieras buscar: " ruta
directorio="$ruta"

# Directorio donde se guardará el archivo borrar.txt
directorio_destino="$HOME/Desktop"

# Crear el archivo borrar.txt o vaciarlo si ya existe
> "$directorio_destino/borrar.txt"

# Buscar archivos en el directorio con tamaño mayor que el tamaño indicado
archivos=$(find "$directorio" -type f -size +"$tamano_minimo"c)

# Iterar sobre los archivos encontrados y escribir sus nombres y rutas en borrar.txt
for archivo in $archivos; do
    echo "$archivo" >> "$directorio_destino/borrar.txt"
done

echo "Se han encontrado archivos con tamaño mayor que $tamano_minimo bytes."
echo "Se han guardado los nombres y rutas en $directorio_destino/borrar.txt"

