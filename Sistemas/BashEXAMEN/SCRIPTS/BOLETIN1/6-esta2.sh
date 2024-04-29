#read -p "Introduce tu nombre: " NOMBRE
if `who | grep -wq $1`
then
        echo "si está"
else
        echo "no está"
fi

