#!/bin/bash

# Obtener la fecha y la hora actual
fecha_hora=$(date "+%Y%m%d_%H%M%S")

# Nombre del archivo de respaldo con la fecha/hora
archivo_backup="/home/samy/Desktop/backup_$fecha_hora.tar"

# Crear el respaldo con el nombre único
tar cvzf "$archivo_backup" --listed-incremental=lista-increm.txt /home/samy/Desktop/tarPruebas/

