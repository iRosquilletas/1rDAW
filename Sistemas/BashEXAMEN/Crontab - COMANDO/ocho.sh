#!/bin/bash


memory_log="$HOME/Desktop/memory_usage.log"

error_log="$HOME/Desktop/memory_error.log"

free -m > "$memory_log" 2> "$error_log"

if [ -s "$error_log" ]; then
	echo "Se produjeron errores durante la ejecución del script."
fi
