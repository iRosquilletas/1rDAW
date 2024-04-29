#!/bin/bash

read -p "Introduce el nombre del archivo: " archivo
read -p "Introduce la cadena a buscar: " cadena_buscar
read -p "Introduce la cadena de reemplazo: " cadena_reemplazo

# Realizar la sustitución en el archivo
sed -i "s/$cadena_buscar/$cadena_reemplazo/g" "$archivo"

echo "La sustitución se ha realizado correctamente."

