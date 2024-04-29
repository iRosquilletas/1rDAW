#!/bin/bash

read -p "Introduce tu año de nacimiento: " year

# Calcular el signo del horóscopo chino
case $((year % 12)) in
    0) signo="Mono" ;;
    1) signo="Gallo" ;;
    2) signo="Perro" ;;
    3) signo="Cerdo" ;;
    4) signo="Rata" ;;
    5) signo="Buey" ;;
    6) signo="Tigre" ;;
    7) signo="Conejo" ;;
    8) signo="Dragón" ;;
    9) signo="Serpiente" ;;
    10) signo="Caballo" ;;
    11) signo="Cabra" ;;
esac

# Mostrar el resultado
echo "Tu signo del horóscopo chino es: $signo"

