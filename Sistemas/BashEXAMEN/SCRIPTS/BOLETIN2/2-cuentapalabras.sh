#!/bin/bash

# Solicitar al usuario el nombre del archivo de texto
read -p "Introduce el nombre del archivo de texto: " archivo

# Verificar si el archivo existe
if [ ! -f "$archivo" ]; then
    echo "El archivo '$archivo' no existe."
    exit 1
fi

# Contar la cantidad de palabras en el archivo
cantidad_palabras=$(wc -w < "$archivo")

# Mostrar el resultado al usuario
echo "El archivo '$archivo' contiene $cantidad_palabras palabras."

<<-COMENTARIO
if [ ! -f "$archivo" ]; then: Esta línea verifica si el archivo especificado por el usuario no existe (! -f). Aquí, ! -f significa "no es un archivo regular". Si el archivo no existe, el código dentro del bloque then se ejecutará, mostrando un mensaje de error y saliendo del script.

cantidad_palabras=$(wc -w < "$archivo"): Esta línea cuenta la cantidad de palabras en el archivo utilizando el comando wc -w. El comando wc cuenta las líneas, palabras y bytes de un archivo. Con la opción -w, wc cuenta solo las palabras. El símbolo < redirige la entrada estándar para que provenga del contenido del archivo $archivo, en lugar de requerir la entrada manual del usuario. El resultado se asigna a la variable cantidad_palabras.
COMENTARIO
