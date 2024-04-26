USE chinook;
SELECT COUNT(TrackId) AS CancionesOutOfTime
FROM Track
WHERE AlbumId = (
    SELECT AlbumId
    FROM Album
    WHERE Title = 'Out Of Time'