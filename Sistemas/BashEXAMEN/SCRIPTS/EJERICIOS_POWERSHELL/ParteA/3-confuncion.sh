#!/bin/bash

# Funciones
ListarFicheros() {
    ls
}

ContarFicheros() {
    numFicheros=$(ls | wc -l)
    echo "El directorio contiene $numFicheros ficheros."
}

ContarFicherosSubdirectorios() {
    numFicheros=$(find . -type f | wc -l)
    echo "El directorio y sus subdirectorios contienen $numFicheros ficheros."
}

ContarFicherosGrandes() {
    find . -type f -size +1G | wc -l
    echo "El directorio contiene $numFicheros ficheros que ocupan más de 1GB."
}

MostrarDiaHora() {
    date
}

# Menú
while true; do
    echo "=== MENÚ ==="
    echo "A. Listar los ficheros de un directorio"
    echo "B. Contar los ficheros que contiene un directorio"
    echo "C. Contra los ficheros que contiene un directorio y sus subdirectorios"
    echo "D. Contar los ficheros del directorio que ocupen más de 1GB"
    echo "E. Mostrar DIA y HORA"
    echo "F. Salir"
    read -p "Elige una opción (A-F): " opcion

    case $opcion in
        A) ListarFicheros ;;
        B) ContarFicheros ;;
        C) ContarFicherosSubdirectorios ;;
        D) ContarFicherosGrandes ;;
        E) MostrarDiaHora ;;
        F) echo "¡Hasta luego!"; break ;;
        *) echo "Opción no válida." ;;
    esac
done

