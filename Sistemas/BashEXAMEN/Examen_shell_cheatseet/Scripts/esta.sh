read -p "Introduce tu nombre: " NOMBRE
if `who | grep -wq $NOMBRE` 
then 
	echo "si está"
else 
	echo "no está"
fi
