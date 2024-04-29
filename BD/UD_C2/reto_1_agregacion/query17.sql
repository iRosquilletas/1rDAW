USE chinook;
SELECT a.Title AS Album, COUNT(t.TrackId) AS NumeroDeCanciones
FROM Album a
LEFT JOIN Track t ON a.AlbumId = t.AlbumId
GROUP BY a.Title
ORDER BY NumeroDeCanciones DESC;