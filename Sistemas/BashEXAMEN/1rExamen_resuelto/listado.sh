#!/bin/bash



read -p "Ingrese cuantos alumnos pueden ganar" ganar

alumnos_totales=`tail -n +2 alumnos.csv | wc -l`

if [ $ganar -gt $alumnos_totales ]; then
	echo "Hay un error, hay más premiados que alumnos"
	exit 1
fi

echo `cut -d ';' -f2,3,4 alumnos.csv | tail -n +2 | sort -t';' -k1 | tr ';' ' ' >test.txt`

head -n 10 test.txt >> FP_`date +%d%b%y`.txt



