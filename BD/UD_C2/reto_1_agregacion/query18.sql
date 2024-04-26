USE chinook;
SELECT g.Name AS Genero, SUM(i.Total) AS TotalComprado
FROM Genre g
JOIN Track t ON g.GenreId = t.GenreId
JOIN InvoiceLine il ON t.TrackId = il.TrackId
JOIN Invoice i ON il.InvoiceId = i.InvoiceId
GROUP BY g.Name
ORDER BY TotalComprado DESC;