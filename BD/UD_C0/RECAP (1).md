# Unidad C0: Recapitulación

Samuel Borrás.

Introducción a las bases de datos y SQL.

## Concepto y origen de las bases de datos

**¿Qué son las bases de datos? ¿Qué problemas tratan de resolver? Definición de base de datos.**

Las bases de datos son conjuntos organizados de información que permiten almacenar, gestionar y recuperar datos de manera eficiente.
Resuelven problemas de almacenamiento, acceso y manipulación de datos, facilitando la gestión y la consulta de información.

## Sistemas de gestión de bases de datos

**¿Qué es un sistema de gestión de bases de datos (DBMS)? ¿Qué características de acceso a los datos debería proporcionar? Definición de DBMS.**

Un DBMS es un software diseñado para crear, manipular y administrar bases de datos de manera eficiente y segura.
Debería proporcionar características como seguridad, integridad, concurrencia, recuperación de fallos y eficiencia en la gestión de datos.

### Ejemplos de sistemas de gestión de bases de datos

**¿Qué DBMS se usan a día de hoy? ¿Cuáles de ellos son software libre? ¿Cuáles de ellos siguen el modelo cliente-servidor?**

- Oracle DB -> No es Software Libre
- IMB Db2 -> No es Software Libre
- SQLite -> Si es Software Libre
- MariaDB -> Si es Software Libre
- SQL Server -> No es Software Libre
- PostgreSQL -> Si es Software Libre
- mySQL -> Si es Software Libre
- Mongo DB -> Si es Software Libre
- Microsoft Access -> No es Software Libre

Casi todos son cliente-servidor

## Modelo cliente-servidor

**¿Por qué es interesante que el DBMS se encuentre en un servidor? ¿Qué ventajas tiene desacoplar al DBMS del cliente? ¿En qué se basa el modelo cliente-servidor?**

Colocar el DBMS en un servidor centralizado permite un acceso seguro y centralizado a la base de datos, lo que mejora la seguridad y la gestión de los datos.
En este modelo, el cliente envía solicitudes al servidor a través de una red. El servidor procesa estas solicitudes y envía las respuestas de vuelta al cliente

- **Cliente**: Dispositivo o aplicación que solicita servicios o recursos al servidor.
- **Servidor**: Equipo o software que proporciona servicios, como el acceso a una base de datos, a los clientes.
- **Red**: Medio de comunicación que permite la transferencia de datos entre el cliente y el servidor.
- **Puerto de escucha**: Número de identificación asociado a un servicio en el servidor para recibir solicitudes.
- **Petición**: Mensaje que envia el cliente
- **Respuesta**: Mensaje que devuelve el servidor ante una peticion

## SQL

**¿Qué es SQL? ¿Qué tipo de lenguaje es?**
SQL (Lenguaje de consulta estructurada) es un lenguaje de programación utilizado para administrar y manipular bases de datos relacionales.

### Instrucciones de SQL

#### DDL -> Define y modifica la estructura de la base de datos (CREATE, ALTER, DROP).

#### DML -> Manipula los datos dentro de la base de datos (INSERT, UPDATE, DELETE).

#### DCL -> Controla los permisos y accesos a los datos (GRANT, REVOKE).

#### TCL -> Maneja las transacciones dentro de la base de datos (COMMIT, ROLLBACK).

## Bases de datos relacionales

**¿Qué es una base de datos relacional? ¿Qué ventajas tiene? ¿Qué elementos la conforman?**
La base de datos relacional es un tipo de base de datos que organiza los datos en tablas relacionadas entre sí a través de claves primarias y extranjeras.
Tiene de ventaja la flexibilidad, integridad de datos, eficiencia en la consulta y escalabilidad.

- **Relación (tabla)**: Conjunto de datos organizados en filas y columnas.
- **Atributo/Campo (columna)**: Categoría de información en una tabla.
- **Registro/Tupla (fila)**: Entrada individual que contiene información específica en una tabla.

## Referencias

[1](https://www.google.com)
