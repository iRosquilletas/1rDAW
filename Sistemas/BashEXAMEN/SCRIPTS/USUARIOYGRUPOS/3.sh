#!/bin/bash

# Cambiar a la cuenta de estudiante1
sudo su - estudiante1 <<EOF

# Intentar leer archivo_clase.txt
echo "Intentando leer archivo_clase.txt..."
cat archivo_clase.txt 2>/dev/null || echo "No se puede leer el archivo."

# Intentar escribir en archivo_clase.txt
echo "Intentando escribir en archivo_clase.txt..."
echo "Contenido agregado por estudiante1" >> archivo_clase.txt && echo "Escritura exitosa." || echo "No se puede escribir en el archivo."

EOF


