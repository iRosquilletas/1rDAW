#!/bin/bash
# Para calcular el pago de los periodistas
# si el periodista sólo escribe un artículo al mes
rm -f pagar-$(date +%B).txt
declare -A palabras_por_autor



while IFS=',' read autor _palabras
do
	((palabras_por_autor[$autor]
	##pago=$[$palabras/10]
	##pago=$(($palabras/10))
	let pago=palabras/10
	##pago=$(echo "$palabras * 0.10" | bc)
	echo "$autor,$palabras,$pago" >> pagar-$(date +%B).txt
done < palabras-$(date +%B).txt

sort -t ',' -k3 -nr pagar-$(date +%B).txt > pagar-$(date +%B).txt

#-nr  r -> reverse(los ordena)  n -> representa números 

echo "El fichero ordenado por coste de mayor a menos vale: 
cat pagar-$(date +%B).txt


