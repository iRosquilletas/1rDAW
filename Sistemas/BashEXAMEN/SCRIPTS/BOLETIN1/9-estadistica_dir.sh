#!/bin/bash
if [ $# -ne 1]
then
	echo "Uso del programa ha de ser: $0 <directorio>"
	exit 1
fi

lectura=0
escritura=0
ejecucion=0
perm_lectura=0
perm_escritura=0
perm_ejecucion=0
for i in `find $1 2>/dev/null` # que no muestre errores por pantalla
do 
	if [ -r $i ]
	then
		let lectura=1
	else
		let perm_lectura+=1
	fi
	if [ -w $i ]
	then
		let escritura+=1
	else
		let sin_escritura+=1
	fi
	if [ -x $i ]
	then
		let ejecucion+=1
	else
		let sin_ejecucion+=1
	fi
done

echo "Número de archivos con permiso de lectura: $lectura"
echo "Número de archivos con permiso de escritura: $escritura"
echo "Número de archivos con permisos


