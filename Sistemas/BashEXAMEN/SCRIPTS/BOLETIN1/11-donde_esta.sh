#!bin/bash
for i in `echo $PATH | tr ":" " "`
do
	if [ -x $i/$i ]; then
		echo localizado en $i
		whatis $1
	fi
done
