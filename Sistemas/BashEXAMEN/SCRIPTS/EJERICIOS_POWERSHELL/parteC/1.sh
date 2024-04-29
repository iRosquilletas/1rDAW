#!/bin/bash

read -p "Introduce una cadena: " cadena

# Convertir la cadena a minúsculas para contar las vocales de forma insensible a mayúsculas
cadena_lowercase=$(echo "$cadena" | tr '[:upper:]' '[:lower:]')

# Contar las vocales en la cadena
a=$(echo "$cadena_lowercase" | tr -cd 'a' | wc -c)
e=$(echo "$cadena_lowercase" | tr -cd 'e' | wc -c)
i=$(echo "$cadena_lowercase" | tr -cd 'i' | wc -c)
o=$(echo "$cadena_lowercase" | tr -cd 'o' | wc -c)
u=$(echo "$cadena_lowercase" | tr -cd 'u' | wc -c)

# Mostrar el resultado
echo "Número de 'a': $a"
echo "Número de 'e': $e"
echo "Número de 'i': $i"
echo "Número de 'o': $o"
echo "Número de 'u': $u"

