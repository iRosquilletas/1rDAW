
clear
DATA=`date +%y-%m-%d`
echo
read -p "Introduce con PATH absoluto el directorio donde están los ficheros a guardar:" DIRORI
read -p "Introduce con PATH absoluto el directorio donde quieres guardarlos: " DIRDEST
read -p "Se va a comprimir en un tar los ficheros, indica el nombre del tar: " NOM
if [ -d $DIRORI ]
then 
	if [ ! -d $DIRDEST ]
	then
		echo "No existia el directorio destino, voy a crearla"
		mkdir $DIRDEST
	fi
	tar cvf $DIRDEST/$NOM-$DATA.tar $DIRORI
	echo "Se han guardado los ficheros"
else
	echo "!ATENCIÓN: no se ha podido realizar la operacion porque el directorio origen no existe!"
fi
echo
