#!/bin/bash

# Mostrar el menú
while true; do
    echo "Menu:"
    echo "A. Crear directorio"
    echo "B. Copiar directorio"
    echo "C. Borrar directorio"
    echo "D. Mover directorio"
    echo "E. Salir"
    read -p "Elige una opción: " opcion

    case $opcion in
        A)
            # Crear directorio
            read -p "Introduce el nombre del directorio a crear: " nombre
            mkdir "$nombre"
            echo "Directorio '$nombre' creado."
            ;;
        B)
            # Copiar directorio
            read -p "Introduce la ubicación del directorio original: " origen
            read -p "Introduce la ubicación del directorio final: " destino
            cp -r "$origen" "$destino"
            echo "Directorio copiado de '$origen' a '$destino'."
            ;;
        C)
            # Borrar directorio
            read -p "Introduce la ubicación del directorio a borrar: " directorio
            rm -r "$directorio"
            echo "Directorio '$directorio' borrado."
            ;;
        D)
            # Mover directorio
            read -p "Introduce la ubicación del directorio original: " origen
            read -p "Introduce la ubicación del directorio final: " destino
            mv "$origen" "$destino"
            echo "Directorio movido de '$origen' a '$destino'."
            ;;
        E)
            # Salir
            echo "¡Hasta luego!"
            exit 0
            ;;
        *)
            echo "Opción no válida. Por favor, selecciona una opción válida."
            ;;
    esac
done

