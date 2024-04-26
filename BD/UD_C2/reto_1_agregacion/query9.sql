USE chinook;
SELECT invoice.InvoiceDate, invoice.BillingAddress, invoice.BillingCountry, invoice.Total, invoice.CustomerId, customer.FirstName, customer.LastName
FROM chinook.invoice
JOIN chinook.customer ON invoice.CustomerId = customer.CustomerId
WHERE invoice.BillingCountry = 'Germany' AND customer.City = 'Berlin';