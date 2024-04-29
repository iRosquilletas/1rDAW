#!bin/bash

MEDIA=0
for num in $@
do
        let MEDIA+=$num
done
let MEDIA/$#
echo "La media es $MEDIA"

