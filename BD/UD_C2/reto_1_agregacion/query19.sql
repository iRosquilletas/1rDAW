USE chinook;
SELECT a.Title AS Album, COUNT(il.InvoiceLineId) AS TotalCompras
FROM Album a
JOIN Track t ON a.AlbumId = t.AlbumId
JOIN InvoiceLine il ON t.TrackId = il.TrackId
GROUP BY a.Title
ORDER BY TotalCompras DESC
LIMIT 6;