#!/bin/bash
#sort -t',' -k2 usuarios.csv | head -n 3
# NO FUNCIONA BIEN sort -t',' -k"$columna" usuarios.csv | head -n 10

#tail -n +2 usuarios.csv | sort -t',' -k"$columna" | head -n 10
#IFS=',' sort -k"$columna" usuarios.csv | head -n 10
#awk -F ',' 'NR == 1 { print; next } { print | "sort -t, -k'"$columna"'" }' usuarios.csv | head -n 10

read -p "Introduce el número de la columna por la cual ordenar (1, 2, 3, ...): " columna

# Ordenar el archivo CSV por la columna especificada y mostrar las primeras 10 líneas
awk -F ',' 'NR == 1 { print; next } { print }' usuarios.csv | sort -t',' -k"$columna" | head -n 10

<<-COMENTARIO
sort: Comando utilizado para ordenar líneas de texto.
-t',': Especifica que el delimitador a utilizar es la coma (','), lo que significa que el comando considerará que los campos están separados por comas.
-k2: Indica que el campo (columna) a utilizar para la ordenación es el segundo campo de cada línea.
usuarios.csv: Especifica el archivo de entrada que se va a ordenar.
head -n 3: Muestra las primeras 3 líneas del resultado. El comando head se utiliza para mostrar las primeras líneas de un archivo, y la opción -n 3 especifica que se mostrarán las primeras 3 líneas.
COMENTARIO
