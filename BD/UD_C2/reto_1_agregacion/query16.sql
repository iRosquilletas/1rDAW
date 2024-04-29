USE chinook;
SELECT g.Name AS Genero, COUNT(t.TrackId) AS NumeroCanciones
FROM Genre g
LEFT JOIN Track t ON g.GenreId = t.GenreId
GROUP BY g.Name;