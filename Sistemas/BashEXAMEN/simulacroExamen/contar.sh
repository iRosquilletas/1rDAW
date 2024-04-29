#!/bin/bash

#b=`cut -d "$" -f3 /NOTICIAS/noticia1.txt | tr "$" ","`


#a=`cut -d "$" -f5 /NOTICIAS/noticia1.txt  | wc -c`

#d=`cut -d "$" -f4 /NOTICIAS/noticia1.txt | tr "$" ","`


#echo -n $d >> contar.txt
#echo -n ","$b >> contar.txt
#echo ",""$a" >> contar.txt

# Obtén el mes actual
MES=$(date +%B)

# Verifico si paso el archivo
if [ ! -f "$1" ]; then
	echo "No pasaste el dolar1"
	exit 1
fi

#Lee el archivo de noticias
while IFS="$" read -r ID FECHA TITULO AUTOR TEXTO
do
	# Cuenta las palabras en el texto de la noticia
	PALABRAS=$(echo $TEXTO | wc -w)

	# Escribe el autor, el título y el número de palabras en el archivo palabras-MES.txt
	echo "$AUTOR,$TITULO,$PALABRAS" >> "palabras-$MES.txt"
done < "$1"

# MEJORAS
 # VER COMO HACER QUE NO PONGA LINEAS TODO EL RATO EN EL FICHERO, se puede hacer con uniq. 

cat palabras-$MES.txt | sort | uniq > temp.txt
mv temp.txt palabras-$MES.txt
