#!/bin/bash

read -p "Dime el número de filas" n

for (( i=n; i>=0; i-- ))
do
	echo 
	for (( j=1; j<=i; j++ ))
	do

	echo -n  "*"

	done
	

done
echo

