USE chinook;
SELECT album.Title, artist.Name, album.ArtistId FROM album
JOIN artist ON album.ArtistId  = artist.ArtistId
WHERE artist.Name = "AC/DC";