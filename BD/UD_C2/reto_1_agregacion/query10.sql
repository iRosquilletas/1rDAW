USE chinook;
SELECT playlist.Name AS PlaylistName, track.Name AS TrackName, album.Title AS AlbumTitle, Track.Milliseconds
FROM playlist
JOIN PlaylistTrack ON Playlist.PlaylistId = PlaylistTrack.PlaylistId
JOIN Track ON PlaylistTrack.TrackId = Track.TrackId
JOIN Album ON Track.AlbumId = Album.AlbumId
WHERE Playlist.Name LIKE 'C%'
ORDER BY PlaylistName, AlbumTitle, Track.Milliseconds;