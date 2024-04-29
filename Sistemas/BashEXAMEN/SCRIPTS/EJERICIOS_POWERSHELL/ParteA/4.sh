#!/bin/bash

# Buscar ficheros de una extensión concreta y moverlos al directorio descargas

# Solicitar al usuario la extensión de los ficheros
read -p "Introduce la extensión de los ficheros que quieres mover (ejemplo: .txt): " extension

# Buscar los ficheros con la extensión especificada
ficheros=$(find . -name "*$extension")

if [ -z "$ficheros" ]; then
    echo "No se encontraron ficheros con la extensión $extension."
    exit
fi

# Mostrar los ficheros encontrados
echo "Se encontraron los siguientes ficheros con la extensión $extension:"
echo "$ficheros"

# Mover los ficheros al directorio de descargas
descargas="/home/user/Descargas"  # Ruta del directorio de descargas
for fichero in $ficheros; do
    mv "$fichero" "$descargas"
done

echo "Se han movido los ficheros al directorio de descargas: $descargas"

# Preguntar al usuario si desea borrar los ficheros definitivamente
read -p "¿Quieres borrar los ficheros definitivamente? (Sí/No): " borrar
if [ "$borrar" = "Sí" ]; then
    for fichero in $ficheros; do
        rm -f "$fichero"
        echo "Se ha borrado el fichero: $fichero"
    done
else
    echo "Operación cancelada."
fi

