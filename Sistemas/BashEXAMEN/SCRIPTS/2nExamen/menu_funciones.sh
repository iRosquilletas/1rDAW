#!/bin/bash

# Función para crear directorio
crear_directorio() {
    read -p "Introduce el nombre del directorio a crear: " nombre
    mkdir "$nombre"
    echo "Directorio '$nombre' creado."
}

# Función para copiar directorio
copiar_directorio() {
    read -p "Introduce la ubicación del directorio original: " origen
    read -p "Introduce la ubicación del directorio final: " destino
    cp -r "$origen" "$destino"
    echo "Directorio copiado de '$origen' a '$destino'."
}

# Función para borrar directorio
borrar_directorio() {
    read -p "Introduce la ubicación del directorio a borrar: " directorio
    rm -r "$directorio"
    echo "Directorio '$directorio' borrado."
}

# Función para mover directorio
mover_directorio() {
    read -p "Introduce la ubicación del directorio original: " origen
    read -p "Introduce la ubicación del directorio final: " destino
    mv "$origen" "$destino"
    echo "Directorio movido de '$origen' a '$destino'."
}

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
            crear_directorio
            ;;
        B)
            copiar_directorio
            ;;
        C)
            borrar_directorio
            ;;
        D)
            mover_directorio
            ;;
        E)
            echo "¡Hasta luego!"
            exit 0
            ;;
        *)
            echo "Opción no válida. Por favor, selecciona una opción válida."
            ;;
    esac
done

