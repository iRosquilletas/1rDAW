## Tipos de datos en SQL:

1. ¿Cuáles son algunos de los tipos de datos más comunes utilizados en SQL? Proporciona ejemplos de al menos tres tipos diferentes y explica en qué situaciones se utilizarían.

Respuesta:
Algunos tipos de datos comunes en SQL son:
VARCHAR: utilizado para almacenar cadenas de caracteres de longitud variable, como nombres o direcciones.
INTEGER: utilizado para almacenar números enteros, como identificadores únicos o contadores.
DATE: utilizado para almacenar fechas, como fechas de nacimiento o fechas de registro

## Integridad referencial en bases de datos relacionales:

2. ¿Qué es la integridad referencial en el contexto de las bases de datos relacionales? ¿Por qué es importante mantenerla? Proporciona un ejemplo de cómo se implementa la integridad referencial en una base de datos.

Respuesta:
La integridad referencial garantiza que las relaciones entre las tablas de una base de datos se mantengan consistentes. Es importante porque ayuda a mantener la coherencia de los datos y evita inconsistencias o errores en la base de datos.
Por ejemplo, supongamos que tenemos dos tablas: "Clientes" y "Pedidos". Para mantener la integridad referencial, podríamos configurar una clave externa en la tabla "Pedidos" que haga referencia a la clave primaria en la tabla "Clientes". Esto garantizaría que cada pedido esté asociado con un cliente válido en la base de datos.

## Transacciones en SQL:

3. Explica qué es una transacción en SQL y por qué son importantes. Describe al menos dos comandos SQL que se utilizan para administrar transacciones y proporciona ejemplos de cómo se usarían.

Respuesta:
Una transacción en SQL es una secuencia de operaciones que se ejecutan como una sola unidad de trabajo. Son importantes porque garantizan la consistencia y la integridad de los datos, especialmente en entornos donde varias operaciones deben completarse juntas o ninguna de ellas.
Algunos comandos SQL utilizados para administrar transacciones son:
BEGIN TRANSACTION: Inicia una nueva transacción.
COMMIT: Confirma la transacción y guarda los cambios realizados en la base de datos.
ROLLBACK: Cancela la transacción y deshace todos los cambios realizados desde el último COMMIT.

1. Conceptos Básicos de Bases de Datos:

1.1. ¿Qué es una entidad en el contexto de las bases de datos?

1.2. Define el término "atributo" en el contexto de las bases de datos.

1.3. Explica qué es una clave primaria y por qué es importante en una base de datos.

1.4. ¿Qué función cumple una clave foránea en una base de datos?

Respuestas:

1.1. Una entidad es un objeto o concepto del mundo real que puede ser claramente identificado, como un cliente, producto o empleado.

1.2. Un atributo es una característica o propiedad de una entidad, como el nombre, edad o dirección de un cliente.

1.3. Una clave primaria es un atributo o conjunto de atributos que identifica de forma única a cada entidad en una tabla. Es importante porque garantiza la integridad de los datos y facilita la referencia a registros específicos.

1.4. Una clave foránea es un atributo que establece una relación entre dos tablas, apuntando a la clave primaria de otra tabla. Se utiliza para mantener la integridad referencial entre las tablas relacionadas.

2. Sistema de Gestión de Bases de Datos:
   2.1. ¿Cuáles son algunas ventajas de utilizar un DBMS?
   2.2. ¿Cuáles son algunas desventajas de utilizar un DBMS?
   2.3. ¿Qué es la normalización en el contexto de las bases de datos?
   2.4. Explica la diferencia entre un DBMS centralizado y uno distribuido.

Respuestas:
2.1. Algunas ventajas de utilizar un DBMS incluyen el control de redundancia, el control de acceso concurrente, y la seguridad de los datos.

2.2. Algunas desventajas de utilizar un DBMS son el costo inicial, la complejidad de administración y la dependencia de un sistema externo.

2.3. La normalización es el proceso de organizar los datos en tablas relacionales para minimizar la redundancia y la dependencia, lo que ayuda a mantener la consistencia y la integridad de los datos.

2.4. Un DBMS centralizado tiene un único servidor que gestiona la base de datos, mientras que un DBMS distribuido distribuye los datos en múltiples servidores para mejorar la escalabilidad y la disponibilidad.

3. SQL:

3.1. Escribe una consulta SQL que seleccione todos los clientes cuyo nombre comience con "A".
3.2. Explica la diferencia entre las cláusulas WHERE y HAVING en SQL.
3.3. ¿Qué es una transacción en SQL y por qué es importante?

Respuestas:
3.1. SELECT \* FROM Clientes WHERE Nombre LIKE 'A%'.

3.2. La cláusula WHERE se utiliza para filtrar filas antes de la agregación, mientras que la cláusula HAVING se utiliza para filtrar grupos después de la agregación.

3.3. Una transacción en SQL es una secuencia de operaciones SQL que se ejecutan como una unidad lógica, garantizando la atomicidad, consistencia, aislamiento y durabilidad de las operaciones.

4. Modelado de Datos:

4.1. ¿Qué es un modelo entidad-relación y qué elementos lo componen?
4.2. Explica el concepto de herencia y generalización en el modelado de datos.
4.3. Menciona al menos tres tipos de relaciones que pueden existir entre entidades.

Respuestas:
4.1.Un modelo entidad-relación es un modelo conceptual que representa las entidades, atributos y relaciones entre entidades. Sus elementos principales son las entidades, atributos y relaciones.

4.2. La herencia es un concepto en el que una entidad puede heredar atributos y relaciones de otra entidad, mientras que la generalización es un proceso para abstraer entidades comunes en una superentidad.

4.3. Algunos tipos de relaciones son uno a uno, uno a muchos y muchos a muchos.

5. Administración de Bases de Datos:

5.1. Menciona tres estrategias de copia de seguridad de bases de datos.
5.2. ¿Qué es la optimización de consultas en una base de datos?
5.3. ¿Cuál es el propósito de los índices en una base de datos?

Respuestas:
5.1. Algunas estrategias de copia de seguridad incluyen copia de seguridad completa, copia de seguridad incremental y copia de seguridad diferencial.

5.2. La optimización de consultas es el proceso de mejorar el rendimiento de las consultas SQL mediante la optimización de la estructura de la consulta y el diseño de índices.

5.3. Los índices en una base de datos son estructuras auxiliares que mejoran la velocidad de búsqueda y recuperación de datos en una tabla.
