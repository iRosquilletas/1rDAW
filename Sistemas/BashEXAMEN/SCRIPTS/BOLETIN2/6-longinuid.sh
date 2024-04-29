#!/bin/bash
cat /etc/passwd | cut -d':' -f1,3 --output-delimiter=";" | sort -t';' -k2 -n > users.txt
<<-COMENTARIO
cat /etc/passwd: Este comando imprime el contenido del archivo "/etc/passwd" en la salida estándar. El archivo "/etc/passwd" contiene información sobre los usuarios del sistema en sistemas Unix y Linux.

cut -d':' -f1,3 --output-delimiter=";": Utiliza el comando cut para extraer campos específicos de cada línea del archivo de entrada.

-d':': Especifica que el delimitador de campos es el carácter ":". En el archivo "/etc/passwd", los campos están separados por ":".
-f1,3: Indica que se extraerán el primer y el tercer campo de cada línea. Estos campos contienen el nombre de usuario y el ID de usuario (UID) respectivamente.
--output-delimiter=";": Establece el delimitador de salida como ";" en lugar del predeterminado. Esto significa que el resultado tendrá campos separados por ";" en lugar de ":".
sort -t';' -k2 -n: Ordena las líneas del resultado en función del segundo campo (el UID) de manera numérica.

-t';': Indica que el delimitador de campos es el carácter ";", que se estableció previamente con --output-delimiter.
-k2: Especifica que se utilizará el segundo campo para ordenar las líneas.
-n: Indica que la ordenación se realizará de manera numérica en lugar de alfabética.
> users.txt: Redirige la salida ordenada al archivo "users.txt". En lugar de mostrar la salida en la pantalla, la salida se guarda en un archivo llamado "users.txt".

En resumen, este comando extrae el nombre de usuario y el UID del archivo "/etc/passwd", los separa por ";", los ordena por UID de manera numérica y luego guarda el resultado en un archivo llamado "users.txt".
COMENTARIO
