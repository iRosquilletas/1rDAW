USE chinook;
SELECT c.Country AS Pais, COUNT(c.CustomerId) AS TotalClientes
FROM Customer c
GROUP BY c.Country
HAVING COUNT(c.CustomerId) >= 5;