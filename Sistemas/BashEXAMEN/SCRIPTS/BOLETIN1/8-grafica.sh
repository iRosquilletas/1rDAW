#!/bin/bash
for num in $*
do
	if [ $num -gt 75 ] || [ $num -lt 1 ]
	then
		echo "No está en el rango"
	else
		CONT=$num
		while [ $CONT -gt 0 ]
		do
			#echo -n "*"
			echo -e "*\c"
			#let CONT=$CONT-1
			CONT=`expr $CONT - 1`
		done
		echo
	fi
done
