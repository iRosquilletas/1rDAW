USE chinook;
SELECT InvoiceId,
       AVG(Total) AS medio,
       MIN(Total) AS minimo,
       MAX(Total) AS maximo
FROM Invoice
GROUP BY InvoiceId;