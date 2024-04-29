#!/bin/bash

cut -d':' -f4 /etc/passwd | sort | uniq -c | sort -nr
<<-COMENTARIO
cut -d':' -f4 /etc/passwd:
cut: Comando utilizado para extraer secciones de cada línea de un archivo.
-d':': Especifica que el delimitador de campo es ':', lo que significa que cut dividirá cada línea en campos usando ':' como separador.
-f4: Indica que se debe extraer el cuarto campo de cada línea.
/etc/passwd: Es el archivo del que se extraerán los datos.
Por lo tanto, esta parte del comando extraerá el cuarto campo (que generalmente corresponde al campo GID o grupo) de cada línea en el archivo /etc/passwd.

sort:
sort: Ordena las líneas de texto.
Esta parte ordenará los GID extraídos del archivo /etc/passwd de forma alfabética.

uniq -c:
uniq: Filtra o informa sobre líneas de texto únicas.
-c: Hace que uniq cuente el número de ocurrencias de cada línea y las muestre precedidas por su recuento.
Esta parte contará las ocurrencias de cada GID único y mostrará el número de usuarios que tienen ese GID.

sort -nr:
sort: Ordena las líneas de texto.
-n: Realiza una ordenación numérica en lugar de una ordenación alfabética.
-r: Ordena en orden inverso, es decir, de mayor a menor. / Si lo quiero de menor a mayor no le pongo -r y ya
Esta parte ordenará los recuentos de GID de mayor a menor, lo que mostrará los GID más comunes primero.
COMENTARIO

