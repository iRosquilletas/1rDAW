# Reto 1: Consultas básicas

# Reto 1: Consultas básicas

Samuel Borrás.

En este reto trabajamos con la base de datos `empresa` y `videoclub`. A continuación realizamos una serie de consultas para extraer la información pedida en cada uno de los enunciados.

El código fuente correspondiente a este reto puede consultarse en: https://gitlab.com/la-senia-db-2024/db/

## Query 1

```sql
SELECT codigo, descripcion
FROM Productos;
```

## Query 2

```sql
SELECT codigo, descripcion
FROM Productos
WHERE descripcion LIKE '%tenis%';
```

## Query 3

```sql
SELECT codigo, nombre, area, telefono
FROM Clientes;
```

## Query 4

```sql
SELECT codigo, nombre, ciudad
FROM Clientes
WHERE area <> 636;
```

## Query 5

```sql
SELECT codigo_orden, fecha_orden, fecha_envio
FROM Pedidos;
```

## Query 6

```sql
SELECT Nom, Telefon
FROM CLIENT;
```

## Query 7

```sql
SELECT Data, Import
FROM FACTURA;
```

## Query 8

```sql
SELECT Descripcio
FROM DETALLFACTURA
WHERE CodiFactura = 3;
```

## Query 9

```sql
SELECT * FROM FACTURA
ORDER BY Import DESC; -- ASC de menor a mayor
```

## Query 10

```sql
SELECT *
FROM ACTOR
WHERE Nom LIKE 'X%';
```

## QUERY RANDOM

Uso de IN:
Encuentra todas las películas del género "Terror" o "Drama".

```sql
SELECT * FROM PELICULA WHERE CodiGenere IN (1, 3);
```

Uso de ORDER BY:
Lista todas las películas ordenadas alfabéticamente por título.

```sql
Copy code
SELECT * FROM PELICULA ORDER BY Titol;
```

Uso de SELECT DISTINCT:
Muestra todos los géneros distintos presentes en la tabla PELICULA.

```sql
SELECT DISTINCT CodiGenere FROM PELICULA;
```

Uso de LIMIT:
Muestra solo las primeras 5 películas en orden alfabético.

```sql
SELECT * FROM PELICULA ORDER BY Titol LIMIT 5;
```

Uso de IS NULL:
Encuentra todas las películas que no tienen asignado un actor principal.

```sql
SELECT * FROM PELICULA WHERE CodiActor IS NULL;
```

Uso de IS NOT NULL:
Encuentra todas las películas que tienen asignado un actor principal.

```sql
SELECT * FROM PELICULA WHERE CodiActor IS NOT NULL;
```

Utilizando IN:

```sql
-- Mostrar las películas cuyo género sea "Terror" o "Drama"
SELECT *
FROM PELICULA
WHERE CodiGenere IN (SELECT CodiGenere FROM GENERE WHERE Descripcio IN ('Terror', 'Drama'));
```

Utilizando ORDER BY:

```sql
-- Mostrar las películas ordenadas por título de forma ascendente
SELECT *
FROM PELICULA
ORDER BY Titol ASC;
```

Utilizando SELECT DISTINCT:

```sql
Copy code
-- Mostrar los géneros distintos presentes en la tabla PELICULA
SELECT DISTINCT Descripcio
FROM GENERE
JOIN PELICULA ON GENERE.CodiGenere = PELICULA.CodiGenere;
```

Utilizando LIMIT:

```sql
-- Mostrar las primeras 5 películas ordenadas por título
SELECT *
FROM PELICULA
ORDER BY Titol ASC
LIMIT 5;
```

Utilizando IS NULL:

```sql
-- Mostrar las películas que no tienen asignado un código de actor (SegonaPart IS NULL)
SELECT *
FROM PELICULA
WHERE SegonaPart IS NULL;
```

Utilizando IS NOT NULL:

```sql
Copy code
-- Mostrar las películas que tienen asignado un código de actor (SegonaPart IS NOT NULL)
SELECT *
FROM PELICULA
WHERE SegonaPart IS NOT NULL;
```

## INSERTAR

INSERT:
Inserta un nuevo género con el código 4 y la descripción "Comedia".

```sql
INSERT INTO GENERE VALUES (4, 'Comedia');
```

ELIMINAR UN REGISTRO DE UNA TABLA:
Elimina la película con el código 5 de la tabla PELICULA.

```sql
DELETE FROM PELICULA WHERE CodiPeli = 5;
```

ACTUALIZAR TABLA:
Actualiza el título de la película con el código 1 a "NUEVO TITULO".

```sql
UPDATE PELICULA SET Titol = 'NUEVO TITULO' WHERE CodiPeli = 1;
```

BORRAR BASE DE DATOS:
Elimina la base de datos videoclub completamente.

```sql
DROP DATABASE IF EXISTS videoclub;
```

INSERT:
Inserta un nuevo cliente con DNI '033333333X', nombre 'Juan Pérez', dirección 'Calle Mayor 123', y teléfono '666777888'.

```sql
Copy code
INSERT INTO CLIENT VALUES ('033333333X', 'Juan Pérez', 'Calle Mayor 123', '666777888');
```

ELIMINAR UN REGISTRO DE UNA TABLA:
Elimina todas las películas del género "Terror" (código de género 1) de la tabla PELICULA.

```sql
DELETE FROM PELICULA WHERE CodiGenere = 1;
ACTUALIZAR TABLA:
```

Actualiza el precio unitario de todas las películas de terror en la tabla DETALLFACTURA a 7.50.

```sql
UPDATE DETALLFACTURA
SET PreuUnitari = 7.50
WHERE CodiFactura IN (SELECT CodiFactura FROM FACTURA WHERE DNI = '011111111Z') AND Descripcio IN (SELECT Titol FROM PELICULA WHERE CodiGenere = 1);
```

BORRAR BASE DE DATOS:
Elimina todas las tablas de la base de datos videoclub sin eliminar la base de datos en sí.

```sql
DROP TABLE IF EXISTS DETALLFACTURA, FACTURA, PRESTEC, CLIENT, COPIA, INTERPRETADA, PELICULA, ACTOR, GENERE;
```

INSERT
Insertar una nueva película con sus respectivos detalles de interpretación:

```sql
INSERT INTO PELICULA (CodiPeli, Titol, CodiGenere, SegonaPart, CodiActor) VALUES (6, 'FFFFFFF', 1, NULL, 2);
INSERT INTO INTERPRETADA VALUES (6, 2);
```

DELETE
Eliminar una película y sus detalles de interpretación asociados:

```sql
DELETE FROM INTERPRETADA WHERE CodiPeli = 6;
DELETE FROM PELICULA WHERE CodiPeli = 6;
UPDATE
```

Actualizar el título de una película existente:

```sql
UPDATE PELICULA SET Titol = 'GGGGGGG' WHERE CodiPeli = 5;
```

## JOIN JOIN

PELICULAS + TODOS SUS ACTORES

```sql
use videoclub;
SELECT *
FROM PELICULA AS P
JOIN INTERPRETADA AS I
JOIN ACTOR AS A
ON P.CodiPeli = I.CodiPeli
AND I.CodiActor = A.CodiActor;
```

PELICULAS + ACTOR PRINCIPA

```sql
use videoclub;
SELECT *
FROM PELICULA AS P
JOIN ACTOR AS A
ON P.CodiActor = A.CodiActor;
```

```sql
use videoclub;
SELECT PELICULA.Titol, GENERE.Descripcio
FROM PELICULA
JOIN GENERE
ON PELICULA.CodiGenere = GENERE.CodiGenere;
```

Mostrar el título de las películas y sus géneros correspondientes:

```sql
SELECT PELICULA.Titol, GENERE.Descripcio
FROM PELICULA
JOIN GENERE ON PELICULA.CodiGenere = GENERE.CodiGenere;
```

Mostrar el nombre de los actores y las películas en las que han participado:

```sql
SELECT ACTOR.Nom, PELICULA.Titol
FROM ACTOR
JOIN INTERPRETADA ON ACTOR.CodiActor = INTERPRETADA.CodiActor
JOIN PELICULA ON INTERPRETADA.CodiPeli = PELICULA.CodiPeli;
```

Mostrar las películas prestadas por cada cliente:

```sql
SELECT CLIENT.Nom, PELICULA.Titol
FROM CLIENT
JOIN PRESTEC ON CLIENT.DNI = PRESTEC.DNI
JOIN PELICULA ON PRESTEC.CodiPeli = PELICULA.CodiPeli;
```

Mostrar el detalle de las facturas de los clientes, incluyendo los nombres de las películas compradas:

```sql
SELECT FACTURA.CodiFactura, CLIENT.Nom, DETALLFACTURA.Descripcio, DETALLFACTURA.PreuUnitari, DETALLFACTURA.NumeroUnitats
FROM FACTURA
JOIN CLIENT ON FACTURA.DNI = CLIENT.DNI
JOIN DETALLFACTURA ON FACTURA.CodiFactura = DETALLFACTURA.CodiFactura;
```

Mostrar el nombre de los actores que han participado en películas del género "Terror":

```sql
SELECT ACTOR.Nom
FROM ACTOR
JOIN INTERPRETADA ON ACTOR.CodiActor = INTERPRETADA.CodiActor
JOIN PELICULA ON INTERPRETADA.CodiPeli = PELICULA.CodiPeli
JOIN GENERE ON PELICULA.CodiGenere = GENERE.CodiGenere
WHERE GENERE.Descripcio = 'Terror';
```

Mostrar el título de las películas prestadas por cada cliente junto con el nombre del cliente y la fecha del préstamo:

```sql
Copy code
SELECT CLIENT.Nom, PELICULA.Titol, PRESTEC.Data
FROM CLIENT
JOIN PRESTEC ON CLIENT.DNI = PRESTEC.DNI
JOIN PELICULA ON PRESTEC.CodiPeli = PELICULA.CodiPeli;
```

Mostrar el título de las películas que no han sido prestadas por ningún cliente:

```sql
Copy code
SELECT PELICULA.Titol
FROM PELICULA
LEFT JOIN PRESTEC ON PELICULA.CodiPeli = PRESTEC.CodiPeli
WHERE PRESTEC.CodiPeli IS NULL;
```

Mostrar el nombre de los actores que han participado en películas del género "Terror" y que también hayan interpretado en películas del género "Drama":

```sql
Copy code
SELECT DISTINCT ACTOR.Nom
FROM ACTOR
JOIN INTERPRETADA ON ACTOR.CodiActor = INTERPRETADA.CodiActor
JOIN PELICULA ON INTERPRETADA.CodiPeli = PELICULA.CodiPeli
JOIN GENERE ON PELICULA.CodiGenere = GENERE.CodiGenere
WHERE GENERE.Descripcio IN ('Terror', 'Drama');
```

Mostrar el título de las películas junto con el nombre del actor principal y el nombre del género, ordenadas por el nombre del género de forma ascendente:

```sql
Copy code
SELECT PELICULA.Titol, ACTOR.Nom AS 'Actor Principal', GENERE.Descripcio AS 'Género'
FROM PELICULA
JOIN ACTOR ON PELICULA.CodiActor = ACTOR.CodiActor
JOIN GENERE ON PELICULA.CodiGenere = GENERE.CodiGenere
ORDER BY GENERE.Descripcio ASC;
```

Mostrar el nombre de los clientes que han alquilado más de una película y el número total de películas alquiladas por cada cliente:

```sql
Copy code
SELECT CLIENT.Nom, COUNT(*) AS 'Total Películas Alquiladas'
FROM CLIENT
JOIN PRESTEC ON CLIENT.DNI = PRESTEC.DNI
GROUP BY CLIENT.Nom
HAVING COUNT(*) > 1;
```
