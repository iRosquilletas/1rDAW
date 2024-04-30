archivo="$1"

# Comprobar si se pasó un archivo como argumento
if [ ! -f "$archivo" ]; then
    echo "No se pasó un archivo como argumento."
    exit 1
fi

declare -A articulos_por_autor  # Aquí almacenaremos el número de artículos por autor
declare -A palabras_por_autor   # Aquí almacenaremos la cantidad de palabras por autor

# Leer el archivo y contar el número de artículos y sumar las palabras por autor
while IFS=',' read autor titulo palabras; do
    ((articulos_por_autor[$autor]++))      # Incrementar el contador de artículos para el autor actual
    ((palabras_por_autor[$autor]+=$palabras))  # Sumar las palabras para el autor actual
done < "$archivo"

# Calcular el precio por palabra (0.10€)
precio_palabra=0.10

# Calcular el pago total por autor y mostrar el resultado
for autor in "${!articulos_por_autor[@]}"; do
    # Obtener la cantidad de artículos y palabras del autor actual
    articulos="${articulos_por_autor[$autor]}"
    palabras="${palabras_por_autor[$autor]}"
    # Calcular el pago para el autor actual
    pago=$(echo "scale=2; $palabras * $precio_palabra" | bc)
    # Mostrar el resultado
    echo "$autor $articulos artículos $palabras palabras ${pago}€"
done > pagar-$(date +%B).txt

