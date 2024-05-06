# Reto 2.3: Consultas con subconsultas II
**[Bases de Datos] Unidad Didáctica 2: DML - Consultas Avanzadas**

Para este reto, volveremos a usar la base de datos Chinook (más información en el Reto 2.1).

![Diagrama relacional de Chinook (fuente: github.com/lerocha/chinook-database).](https://github.com/lerocha/chinook-database/assets/135025/cea7a05a-5c36-40cd-84c7-488307a123f4)

Tras cargar esta base de datos en tu SGBD, realiza las siguientes consultas:

## Subconsultas Escalares (Scalar Subqueries)
Estas subconsultas devuelven un solo valor, por lo general, se utilizan en contextos donde se espera un solo valor, como parte de una condición `WHERE`, `SELECT`, `HAVING`, etc.
Ejemplo:

_Obtener una lista de empleados que ganan más que el salario medio de la empresa. [1]_

```sql
SELECT
  lastname,
  firstname,
  salary
FROM employee
WHERE salary > (SELECT avg(salary)
                FROM employee)
```

### Consulta 1
Obtener las canciones con una duración superior a la media.

```sql
USE Chinook;
SELECT *
FROM Track
WHERE Milliseconds > (SELECT avg(Milliseconds)
                FROM Track)
```

### Consulta 2
Listar las 5 últimas facturas del cliente cuyo email es "emma_jones@hotmail.com".

```sql
USE Chinook;
SELECT *
FROM Invoice
WHERE CustomerId IN (SELECT CustomerId
FROM Customer
WHERE Email = "emma_jones@hotmail.com"
LIMIT 5
);
```


## Subconsultas de varias filas

Diferenciamos dos tipos:

1. Subconsultas que devuelven una columna con múltiples filas (es decir, una lista de valores). Suelen incluirse en la cláusula `WHERE` para filtrar los resultados de la consulta principal. En este caso, suelen utilizarse con operadores como `IN`, `NOT IN`, `ANY`, `ALL`, `EXISTS` o `NOT EXISTS`.
2. Subconsultas que devuelven múltiples columnas con múltiples filas (es decir, tablas). Se comportan como una tabla temporal y se utilizan en lugares donde se espera una tabla, como en una cláusula `FROM`. [2]

### Consulta 3
Mostrar las listas de reproducción en las que hay canciones de reggae.

```sql
USE Chinook;
SELECT Name 
FROM Playlist 
WHERE PlaylistId in (SELECT PlaylistId
	FROM PlaylistTrack
		Where TrackId in (SELECT TrackId
			FROM Track
				Where GenreId in (select GenreId
					FROM Genre
						where name like "Reggae"
								)
						)
					);
```


### Consulta 4
Obtener la información de los clientes que han realizado compras superiores a 20€.






### Consulta 5
Álbumes que tienen más de 15 canciones, junto a su artista.

```sql
USE Chinook;
SELECT * FROM Album JOIN Artist USING (ArtistId)
WHERE AlbumId IN (
	SELECT AlbumId
    FROM Track
    GROUP BY AlbumId
    HAVING COUNT(*) > 15
);
```

### Consulta 6
Obtener los álbumes con un número de canciones superiores a la media.

```sql
USE Chinook;

-- ID Y N canciones de cada álbym
SELECT AlbumId, COUNT(*) AS N_Canciones
FROM Track
GROUP BY AlbumId;

-- Media de canciones en todos los álbumes
SELECT AVG(N_Canciones) FROM
(
	SELECT AlbumId, COUNT(*) AS N_Canciones
	FROM Track
	GROUP BY AlbumId
) AS Album_NCanciones;

-- AlbumId, junto al número de canciones
SELECT AlbumId, COUNT(*) AS N_Canciones
FROM Track
GROUP BY AlbumId
HAVING N_Canciones > (SELECT AVG(N_Canciones) FROM
(
	SELECT AlbumId, COUNT(*) AS N_Canciones
	FROM Track
	GROUP BY AlbumId
) AS Album_NCanciones

);

-- info de los albumes con más canciones
SELECT * FROM Album
WHERE Albumid in 
(
select Albumid
from Track
group by AlbumId
having count(*)> (
select avg(N_canciones) FROM ( select AlbumId, count(*) as N_canciones
from Track
group by AlbumId
) as album_canciones
)
);
```


### Consulta 7
Obtener los álbumes con una duración total superior a la media.

### Consulta 8
Canciones del género con más canciones.

### Consulta 9
Canciones de la _playlist_ con más canciones.


## Subconsultas Correlacionadas (Correlated Subqueries):
Son subconsultas en las que la subconsulta interna depende de la consulta externa. Esto significa que la subconsulta se ejecuta una vez por cada fila devuelta por la consulta externa, suponiendo una gran carga computacional.
Ejemplo:

_Supongamos que queremos encontrar a todos los empleados con un salario superior al promedio de su departamento. [1]_

```sql
SELECT
  lastname,
  firstname,
  salary
FROM employee e1
WHERE e1.salary > (SELECT avg(salary)
                   FROM employee e2
                   WHERE e2.dept_id = e1.dept_id)
```

La principal diferencia entre una subconsulta correlacionada en SQL y una subconsulta simple es que las subconsultas correlacionadas hacen referencia a columnas de la tabla externa. En el ejemplo anterior, `e1.dept_id` es una referencia a la tabla de la subconsulta externa. [1]

### Consulta 10
Muestra los clientes junto con la cantidad total de dinero gastado por cada uno en compras.



### Consulta 11
Obtener empleados y el número de clientes a los que sirve cada uno de ellos.

```sql
-- Obtener empleados y el número de clientes a los que sirve cada uno de ellos.

DESCRIBE Customer;

-- Empleado con Número de clientes asociados

SELECT SupportRepId, COUNT(*) AS N_Customers
FROM Customer
GROUP BY SupportRepId;


-- Sacar info de cada empleado (usando JOIN)
SELECT EmployeeId, FirstName, LastName, N_Customers
FROM Employee
JOIN (
SELECT SupportRepId, COUNT(*) AS N_Customers
FROM Customer
GROUP BY SupportRepId
) AS Empleado_NCustomers
ON Employee.EmployeeId = Empleado_NCustomers.SupportRepId;

-- Sacar info de cada empleado (usando subconsultas correlacionadas)
SELECT EmployeeId, FirstName, LastName, (
	SELECT COUNT(*) AS N_Customers
    FROM Customer
    WHERE Customer.SupportRepId = Employee.EmployeeId
    ) AS N_Customers
FROM Employee;
```


### Consulta 12
Ventas totales de cada empleado.

### Consulta 13
Álbumes junto al número de canciones en cada uno.

### Consulta 14
Obtener el nombre del álbum más reciente de cada artista. Pista: los álbumes más antiguos tienen un ID más bajo.


## Referencias
- [1] https://learnsql.es/blog/subconsulta-correlacionada-en-sql-una-guia-para-principiantes/
- [2] https://learnsql.es/blog/cuales-son-los-diferentes-tipos-de-subconsultas-sql/


<!--
HAVING ??
GROUP BY ??
-->
