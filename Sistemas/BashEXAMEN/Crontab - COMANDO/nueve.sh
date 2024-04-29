#!/bin/bash

# Actualizar los paquetes del sistema y guardar la salida en resultado.log y los errores en error.log
echo "Actualizando los paquetes del sistema..." > resultado.log
sudo apt update >> resultado.log 2> error.log

# Verificar si ocurrieron errores durante la actualización
if [ -s error.log ]; then
    echo "Se produjeron errores durante la actualización. Consulte error.log para obtener más detalles."
else
    echo "La actualización se completó sin errores."
fi
