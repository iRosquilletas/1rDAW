#!/bin/bash
suma=0
num=0
for num in "$*"
do
	let suma+=$num
done
echo $suma




