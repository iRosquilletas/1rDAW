#!/bin/bash

read -p "Introduce cuantas veces quiere que aparezca 'Hola Mundo': " a

for ((i=0; i<a; i++))
do
	echo "Hola mundo"
done
