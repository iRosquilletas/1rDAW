# 1. Conexión a la base de datos con MYSQL CLI

Para conectarnos al mysql desde la terminal, debemos ejecutar el siguiente comando: 
mysql -u root -p -h 127.0.0.1 -P 33006

-u : usuario  
-p    
-h  
-P : puerto

Esto es lo mismo que hacerlo desde el MYSQL Workbench, pero esta vez desde la terminal

## COMANDOS
Ver todas las bases de datos
```sql
SHOW DATABASES;
```
Ver todas las tablas de una base de datos
```sql
SHOW TABLES FROM Chinook;
SHOW FULL TABLES FROM Chinook;
```
Ver todas las columnas de una tabla
```sql
SHOW COLUMS FROM Employee;
DESCRIBE Employee;
```

Seleccionar base de datos para trabajar con ella
```sql
USE Chinook;
```

Como ver con cual base de datos estoy trabajado
```sql
SELECT DATABASE()
```

Como desceleccionar la base de datos con la que estoy trabajando
```sql
CREATE DATABASE xd;
USE xd;
DROP xd;
```


# 2. TCL: Commit, Rollback y Autocommit

### ¿Para qué sirve?



### Qué posibilidad tenemos?


## Comandos
autocommit
```sql
SELECT @@autocommit;
SELECT @@autocommit;
```

Volver a un commit atras
```sql
ROLLBACK
```

Hacer commit
```sql
COMMIT
```


Poner el commit a 0
```sql
SET AUTOCOMMIT=0;
```

Ver que funciona el commit y al hacer rollback para que se quita la tabla que creamos
```sql
SET autocommit=0;
commit; -- hace el commit
INSERT INTO empresa.COMANDA VALUES(630, CURRENT_DATE(), "A", 100, "1987-01-23", 23490.90)
SELECT * FROM COMANDA;
ROLLBACK -- para volver
SELECT @@autocommit; -- ver en cual commit estamos
```


# 3. CREACIÓN DE BASE DE DATOS RALLANÉ

Ahora vamos a crear una base de datos "Rallane" con 3 tablas


### ¿Qué tipos elegimos?

### ¿Qué campos necesitamos?

### ¿Qué restricciones ponemos?

### ¿Por qué?



```sql
CREATE DATABASE Rallane;
```

```sql
CREATE TABLE `Rallane`.`Pasajeros` (
  `idPasajeros` INT NOT NULL,
  `Nombre` VARCHAR(100) NOT NULL,
  `Documento` VARCHAR(45) NOT NULL,
  `TipoDocumento` VARCHAR(15) NOT NULL,
  `FechaNacimiento` DATE NOT NULL,
  `Nacionalidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPasajeros`),
  UNIQUE INDEX `Documento_UNIQUE` (`Documento` ASC) VISIBLE);
```

```sql
CREATE TABLE `Rallane`.`Vuelos` (
  `idVuelos` INT NOT NULL,
  `NPlazas` VARCHAR(45) NULL,
  `Origen` VARCHAR(50) NULL,
  `Destino` VARCHAR(50) NULL,
  `Compañia` VARCHAR(45) NULL,
  `FechaHora` VARCHAR(45) NULL,
  PRIMARY KEY (`idVuelos`));
```

```sql
CREATE TABLE `Rallane`.`Reservas` (
  `idReserva` INT NOT NULL,
  `idPasajero` VARCHAR(45) NOT NULL,
  `idVuelo` VARCHAR(45) NOT NULL,
  `Asiento` CHAR(3) NOT NULL,
  PRIMARY KEY (`idReserva`));
```


# PREGUNTAS

## ¿Por qué necesitamos tres tablas? 

Para que haya una tabla intermediaria que las pueda relaciones, es decir, que es de muchos a muchos.


## ¿Cuáles son las claves primarias y foráneas? 





## ¿Por qué utilizamos las restricciones que hemos definido y no otras?


