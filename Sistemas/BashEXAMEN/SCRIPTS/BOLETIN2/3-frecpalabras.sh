#!/bin/bash

read -p "Dime el nombre del archivo: " archivo
if [ -f $archivo ]
then
	grep -o -E "\w+" $archivo | sort | uniq -c
else
	echo archivo no encontrado
fi

<<-COMENTARIO
grep -o -E "\w+" $archivo:
grep: Comando utilizado para buscar patrones en archivos.
-o: Esta opción indica a grep que solo imprima las partes de la línea que coincidan con el patrón especificado, en lugar de la línea completa.
-E: Esta opción activa el uso de expresiones regulares extendidas (ERE).
"\w+": Es el patrón utilizado en la expresión regular. \w+ coincide con una o más ocurrencias de cualquier carácter de palabra (letras, números o guiones bajos).
$archivo: Es el archivo en el que se buscarán los patrones.
Por lo tanto, grep -o -E "\w+" $archivo buscará todas las palabras en el archivo $archivo y las imprimirá una por línea.

sort:
sort: Comando utilizado para ordenar líneas de texto.
En este caso, sort ordenará las palabras encontradas por grep de forma alfabética.

uniq -c:
uniq: Comando utilizado para filtrar o informar sobre líneas de texto únicas.
-c: Esta opción hace que uniq cuente el número de ocurrencias de cada línea y las muestre precedidas por su recuento.
Por lo tanto, uniq -c contará las palabras únicas encontradas después de que hayan sido ordenadas por sort y mostrará cada palabra junto con el número de veces que aparece en el archivo.
COMENTARIO



