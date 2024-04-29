#!/bin/bash

#read -p "Introduce el nombre de alumnos a los que premiar" premio

#a=`wc -c /home/samuel/Desktop/alumnos.csv | sort | uniq -c | cut -d';' -f1`
#echo $a 


cut -d';' -f2,3,4 /home/samuel/Desktop/alumnos.csv | sort -t';' -k2 | tr ';' ' '

echo "Copia realizada en el archivo FP_AÑO.txt"

echo -n `cut -d';' -f2,3,4 /home/samuel/Desktop/alumnos.csv | sort -t';' -k2 | tr ';' ' '` >> FP_AÑO.txt


