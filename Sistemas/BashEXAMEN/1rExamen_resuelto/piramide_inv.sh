#!/bin/bash

# Función para dibujar la pirámide invertida
dibujar_piramide() {
    altura=$1
    for ((i = altura; i >= 1; i--)); do
        for ((j = 1; j <= altura - i; j++)); do
            echo -n " "
        done
        for ((k = 1; k <= 2 * i - 1; k++)); do
            echo -n "*"
        done
        echo
    done
}

# Función para mantener 3 copias de la pirámide
mantener_copias() {
    cp piramide.txt piramide_cop1.txt
    cp piramide.txt piramide_cop2.txt
    cp piramide.txt piramide_cop3.txt
}

# Función para contar el número de asteriscos en la pirámide
contar_asteriscos() {
    grep -o "*" piramide.txt | wc -l
}

# Función para sustituir los asteriscos por otro carácter
sustituir_asteriscos() {
    read -p "Ingrese el carácter para sustituir los asteriscos: " caracter
    tr '*' "$caracter" <piramide.txt >piramide_sustituido.txt
    mv piramide_sustituido.txt piramide.txt
}

# Función para rotar la pirámide
rotar_piramide() {
    tac piramide.txt >piramide_rotada.txt
    mv piramide_rotada.txt piramide.txt
}

# Función del menú principal
menu_principal() {
    while true; do
        echo "MENÚ PIRÁMIDE INVERTIDA"
        echo "1. Dibujar pirámide en piramide.txt"
        echo "2. Mostrar piramide.txt"
        echo "3. Rotar piramide.txt"
        echo "4. Contar asteriscos"
        echo "5. Sustituir asteriscos"
        echo "6. Salir"
        read -p "Seleccione una opción: " opcion
        case $opcion in
        1)
            read -p "Ingrese la altura de la pirámide: " altura
            dibujar_piramide $altura >piramide.txt
            mantener_copias
            ;;
        2)
            cat piramide.txt
            ;;
        3)
            rotar_piramide
            ;;
        4)
            contar_asteriscos
            ;;
        5)
            sustituir_asteriscos
            ;;
        6)
            exit 0
            ;;
        *)
            echo "Opción no válida."
            ;;
        esac
    done
}

# Ejecutar el menú principal
menu_principal

