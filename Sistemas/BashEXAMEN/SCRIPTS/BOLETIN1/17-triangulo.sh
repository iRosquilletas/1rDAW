#!/bin/bash

read -p "Dime el número de filas" n

for (( i=1; i<=n; i++ ))
do
	echo
	for (( j=1; j<=i; j++ ))
	do

	echo -n -e "*"

	done
	

done
echo

