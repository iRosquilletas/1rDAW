#!/bin/bash

read -p "Dime el nombre del archivo: " archivo
if [ -f $archivo ]
then
	grep -o -E "\w+" $archivho | sort | uniq -c
else
	echo archivo no encontrado
fi



