#!/bin/bash

rotar()
{
	if [ -s old_rot/$FICH.rot4.gz ]
		then rm old_rot/$FICH.rot4.gz
	fi
	
	if [ -s old_rot/$FICH.rot3.gz ]
		then mv old_rot/$FICH.rot3.gz old_rot/$FICH.rot4.gz
	fi
	
	if [ -s old_rot/$FICH.rot2.gz ]
		then mv old_rot/$FICH.rot2.gz old_rot/$FICH.rot3.gz
	fi

	if [ -s old_rot/$FICH.rot1.gz ]
		then mv old_rot/$FICH.rot1.gz old_rot/$FICH.rot2.gz
	fi
#	cp $FICH old_rot/$FICH.rot1
#	gzip old_rot/$FICH.rot1
	tail -n 30 $FICH > TEMP.txt
	cat TEMP.txt > $FICH
	rm -r TEMP.txt
	> $FICH
}

mkdir old_rot 2> /dev/null
for FICH in `ls *.log`
do
	LINEAS=`cat $FICH | wc -l`
	if [ $LINEAS -gt 50 ]
		then 
			echo "$FICH tiene $LINEAS -> Lo voy a rotar"
			rotar
		else
			echo "$FICH tiene $LINEAS"
	fi
done


