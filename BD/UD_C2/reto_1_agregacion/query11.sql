USE chinook;
SELECT Customer.LastName, Customer.FirstName, SUM(Invoice.Total) AS TotalGastado
FROM Customer
JOIN Invoice ON Customer.CustomerId = Invoice.CustomerId
GROUP BY Customer.CustomerId
HAVING TotalGastado > 10
ORDER BY Customer.LastName;