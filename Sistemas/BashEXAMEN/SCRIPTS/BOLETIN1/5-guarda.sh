
if [ ! -d $HOME/seguridad ]
then
	echo "No existía el directorio voy a crearlo"
	mkdir $HOME/seguridad
fi
cp * $HOME/seguridad
echo "Se han guardado los ficheros"
echo
