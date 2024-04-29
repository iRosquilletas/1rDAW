#!/bin/bash

for file in noticias*.txt
do
	while IFS="$" read -r ID FECHA TITULO AUTOR TEXTO
	do
		TITULOM=$(echo "$TITULO" | tr 'a-z' 'A-Z')
		#TITULOM=$(echo "$TITULO" | tr '[:lower:]' '[:upper:]')
		echo "$ID"\$"$FECHA"\$"$TITULOM"\$"$AUTOR"\$"$TEXTO" > $file
	done < "$file"
done

# OTRA FORMA

#a=`cut -d "$" -f3 /NOTICIAS/discoNoticias/noticia1.txt | tr '[:lower:]' '[:upper:]'`

#echo $a >> mayusculas.txt

