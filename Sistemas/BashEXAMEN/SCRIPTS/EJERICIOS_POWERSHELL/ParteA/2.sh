#!/bin/bash

# Mostrar por pantalla un mensaje n veces y numerar las líneas de mayor a menor

# Solicitar al usuario el mensaje y el número de veces que se mostrará
read -p "Introduce el mensaje que quieres mostrar: " mensaje
read -p "Introduce el número de veces que deseas mostrar el mensaje: " numVeces

# Verificar si el usuario está de acuerdo con el mensaje y el número de veces
echo "Mensaje: $mensaje"
echo "Número de veces: $numVeces"
read -p "¿Estás de acuerdo? (Sí/No): " confirmacion
if [ "$confirmacion" != "Sí" ]; then
    echo "Operación cancelada."
    exit
fi

# Mostrar el mensaje n veces numerando las líneas de mayor a menor
for (( i = $numVeces; i > 0; i-- )); do
    echo "$i. $mensaje"
done

