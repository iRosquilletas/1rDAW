#!/bin/bash

# Nombre del archivo CSV
archivo="usuarios.txt"

# Columna por la que se va a ordenar
columna=1

# Ordenar el archivo por la columna especificada y mostrar las primeras 10 líneas
sort -t',' -k$columna $archivo | head -n 10
