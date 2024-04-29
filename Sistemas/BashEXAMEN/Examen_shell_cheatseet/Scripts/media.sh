#!/bin/bash


I=0
MEDIA=0
for num in $*
do
	let MEDIA+=$num
	let I+=1
done
let MEDIA/=$I
echo "La media es $MEDIA"









