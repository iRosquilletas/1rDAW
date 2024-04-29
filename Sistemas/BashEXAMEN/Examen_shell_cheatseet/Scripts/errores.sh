for usuario in $*
	do
		TEST=`who | grep $usuario`
		if [ ! -z "$TEST" ]
			then
				echo "$usuario Si está conectado"
			else
				echo "$usuario No está conectado"
			fi
		done

