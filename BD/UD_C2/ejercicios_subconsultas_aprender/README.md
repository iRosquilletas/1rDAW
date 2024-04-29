# Consulta 1

## Obtener las canciones con una duración superior a la media.

```sql
USE Chinook;
SELECT * FROM Track
WHERE Milliseconds > ( SELECT AVG(Milliseconds)
FROM Track);
```


# Consulta 2

## Obtener los álbumes con un número de canciones superiores a la media

```sql
USE Chinook;

SELECT AlbumId, count(*) as canciones
FROM Track
GROUP BY AlbumId
HAVING canciones > (
		SELECT AVG(canci)
        from (
			select Track.AlbumId, COUNT(Track.TrackId) as canci
            from Track
            group by AlbumId
        ) as Ntrack
        
    );
```


# Consulta 3

## Obtener los álbumes con una duración total superior a la media.


# Consulta 4

## Obtener el número de canciones en cada álbum
