#!/bin/bash

echo "Introduce las notas parciales del examen de hardware:"
read -p "Test (aciertos errores blancos): " aciertos_test errores_test blancos_test
read -p "Preguntas (nota parte1 nota parte2 nota parte3): " nota_parte1 nota_parte2 nota_parte3

# Calcular la nota del test
puntaje_test=$((aciertos_test - errores_test / 3))

# La nota del test no puede ser menor que 0
if [ $puntaje_test -lt 0 ]; then
    puntaje_test=0
fi

# Calcular la nota de la parte 1
nota_parcial1=$((nota_parte1 * 60 / 100))

# Calcular la nota de la parte 2
nota_parcial2=$((nota_parte2 * 40 / 100))

# La nota de la parte 3 ya está dada

# Calcular la nota final sumando todas las notas parciales
nota_final=$((puntaje_test + nota_parcial1 + nota_parcial2 + nota_parte3))

echo "La nota final del examen de hardware es: $nota_final"

