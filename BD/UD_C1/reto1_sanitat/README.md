# Reto 1: Consultas básicas

Samuel Borrás.

En este reto trabajamos con la base de datos `sanitat`, que nos viene dada en el fichero `sanitat.sql`. A continuación realizamos una serie de consultas para extraer la información pedida en cada uno de los enunciados.

El código fuente correspondiente a este reto puede consultarse en: https://gitlab.com/la-senia-db-2024/db/

## Query 1

Para seleccionar el número, nombre y teléfono de todos los hospitales existentes, seleccionaremos estos tres atributos, que se corresponden con las columnas `HOSPITAL_COD`, `NOM`, y `TELEFON`, respectivamente, de la tabla `HOSPITAL`. Lo llevaremos a cabo con la siguiente sentencia SQL:

```sql
SELECT HOSPITAL_COD AS "código",NOM AS "nombre",TELEFON AS "telefono"
FROM HOSPITAL;
```

## Query 2

Para mostrar los hospitales existente con una letra A en la segunda posicion del nombre, seleccionaremos los tres atributos `HOSPITAL_COD`, `NOM`, y `TELEFON`. Lo llevaremos a cabo con la siguiente sentencia SQL:

```sql
USE sanitat;
SELECT HOSPITAL_COD, NOM, TELEFON
FROM HOSPITAL
WHERE SUBSTRING(NOM, 2, 1) = 'A';
-- WHERE HOSPITAL.NOM LIKE "_a%" También sirve
```

## Query 3

Para mostrar los trabajadores existentes, seleccionaremos los cuatro atributos `HOSPITAL_COD`, `SALA_COD`, `EMPLEAT_NO`, `COGNOM`. Lo llevaremos a cabo con la siguiente sentencia SQL:

```sql
USE sanitat;
SELECT HOSPITAL_COD, SALA_COD, EMPLEAT_NO, COGNOM
FROM PLANTILLA AS P;
```

## Query 4

Para mostrar los trabajadores que no sean del turno de noche, seleccionaremos los cuatro atributos `HOSPITAL_COD`, `SALA_COD`, `EMPLEAT_NO`, `COGNOM`. Lo llevaremos a cabo con la siguiente sentencia SQL:

```sql
USE sanitat;
SELECT HOSPITAL_COD, SALA_COD, EMPLEAT_NO, COGNOM
FROM PLANTILLA AS P
WHERE TORN != 'N';
-- WHERE TORN IN ("M", "T"); También sirve
-- WHERE TORN <> "N"; También sirve
-- WHERE NOT TORN = "N"; También sirve
-- WHERE TORN = "M" OR TORN = "T"; También sirve
```

## Query 5

Para mostrar los enfermos nacidos en 1960, seleccionaremos todos los atributos de la tabla MALALT y solo cogeremos el atributo `DATA_NAIX`.
Lo llevaremos a cabo con la siguiente sentencia SQL:

```sql
USE sanitat;
SELECT *
FROM MALALT
WHERE YEAR(DATA_NAIX) = 1960;
```

## Query 6

Para mostrar los enfermos nacidos a partir de 1960, seleccionaremos todos los atributos de la tabla MALALT y solo cogeremos el atributo `DATA_NAIX`.
Lo llevaremos a cabo con la siguiente sentencia SQL:

```sql
USE sanitat;
SELECT *
FROM MALALT
WHERE YEAR(DATA_NAIX) >= 1960;
```

## QUERY RANDOM

Función SUBSTR():
Encuentra todos los empleados cuyo apellido comienza con la letra "B".

```sql
SELECT *
FROM sanitat.PLANTILLA
WHERE SUBSTR(COGNOM, 1, 1) = 'B';
```

Operador LIKE y Comodines de SQL:
Encuentra todos los empleados cuyo apellido contiene la letra "a" en cualquier posición.

```sql

SELECT *
FROM sanitat.PLANTILLA
WHERE COGNOM LIKE '%a%';
```

Función YEAR():
Encuentra todos los pacientes nacidos en el año 1960.

```sql

SELECT *
FROM sanitat.MALALT
WHERE YEAR(DATA_NAIX) = 1960;
```

Operador IN:
Encuentra todos los doctores especializados en Cardiología o Pediatria.

```sql

SELECT *
FROM sanitat.DOCTOR
WHERE ESPECIALITAT IN ('Cardiologia', 'Pediatria');
```

Operador BETWEEN:
Encuentra todos los ingresos de pacientes realizados entre el 1 de enero de 2022 y el 31 de diciembre de 2022.

```sql

SELECT *
FROM sanitat.INGRESSOS
WHERE DATA_INGRESS BETWEEN '2022-01-01' AND '2022-12-31';
```

Operadores lógicos (AND, OR, NOT):
Encuentra todos los ingresos de pacientes en el Hospital con el código 22 que no estén en la Sala con el código 6.

```sql
SELECT *
FROM sanitat.INGRESSOS
WHERE HOSPITAL_COD = 22 AND SALA_COD != 6;
```

Operador OR:
Encuentra todos los empleados cuyo turno de trabajo sea "M" o "N".

```sql
SELECT *
FROM sanitat.PLANTILLA
WHERE TORN = 'M' OR TORN = 'N';
```

Operador NOT:
Encuentra todos los doctores que NO están especializados en Cardiología.

```sql
SELECT *
FROM sanitat.DOCTOR
WHERE ESPECIALITAT != 'Cardiologia';
```
