#!/bin/bash
triangulo_normal() {

read -p "Dime el número de filas: " n
                
for (( i=1; i<=$n; i++ ))
              do
                        espacio=$((n-i))
                        for (( j=1; j<=$espacio; j++ ))
                        do
                                echo -n " " >> piramide.txt
			 	echo -n " "      
                        done
                        a=$((i*2-1))
                        for ((j=1; j<=a; j++))
                        do
                               echo -n  "*" >> piramide.txt
			       echo -n "*" 
			       
                        done
                        echo >> piramide.txt
			echo
                done
		echo "Piramide guardada en el fichero piramide.txt"
}

triangulo_invertido() {
read -p "Dime el número de filas: " n

                for (( i=$n; i>=1; i-- )); do
                    espacio=$((n-i))
                    for (( j=1; j<=$espacio; j++ )); do
                        echo -n " " >> piramide.txt
			echo -n " "
                    done
                    a=$((i*2-1))
                    for (( j=1; j<=a; j++ )); do
                        echo -n "*" >> piramide.txt
			echo -n "*"
                    done
                    echo >> piramide.txt
		    echo
                done
		echo	"Pasando piramide al archivo piramide.txt"
}

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
#       cp $FICH old_rot/$FICH.rot1
#       gzip old_rot/$FICH.rot1
        tail -n 30 $FICH > TEMP.txt
        cat TEMP.txt > $FICH
        rm -r TEMP.txt
        > $FICH
}

while true; do
clear
echo " --------- MENU ---------- "
echo "1. Dibujar piramide en piramide.txt"
echo "2. Mostrar piramide.txt"
echo "3. Rotar piramide.txt"
echo "4. Contar asteriscos"
echo "5. Sustituir ^"
echo "6. Salir"

read -p "Introduce la opción que desees: " pregunta
case $pregunta in 
	"1")
		triangulo_invertido
		read -p "Pulsa Enter para continuar "
		;;
	"2")
		cat piramide.txt
		read -p "Pulsa Enter para continuar " 
		;;
	"3")
		
		;;
	"4")
	#	mkdir old_rot 2> /dev/null
	#	for FICH in `ls piramide.txt`
#                        echo "$FICH tiene $LINEAS -> Lo voy a rotar"
  
#                        echo "$FICH tiene $LINEAS"

		;;
	"5")
		cat piramide.txt | tr '*' '^'

		read -p "Pulsa enter para continuar " 

		;;
	"6")
		echo "Saliendo del programa... "
		exit 0
		;;
	*)
		echo "Opción no válida"
		;;
esac
done





