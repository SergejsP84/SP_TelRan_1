-- Задача 1. 
-- Вывести ко-во поставщиков не из UK и не из China
SELECT
Count(*) AS RelevantSuppliers
FROM suppliers
WHERE NOT Country IN ('UK', 'China')

-- Задача 2. 
-- Вывести среднюю/MAX/MIN стоимости и ко-во товаров из категорий 3 и 5

SELECT
Count(*) AS Number_of_Products,
ROUND(AVG (Price), 2) AS Average_Price,
MIN (Price) AS Minimum_Price,
MAX (Price) AS Maximum_Price
FROM Products
WHERE CategoryID IN (3, 5)

-- Задача 3. 
-- Вывести общую сумму проданных товаров

SELECT
SUM(Products.Price * Quantity) AS TotalSalesValue
FROM [OrderDetails]
JOIN Products on OrderDetails.ProductID=Products.ProductID

-- Задача 4. 
-- Вывести ко-во стран, которые поставляют напитки

SELECT 
Count(DISTINCT Suppliers.Country)
FROM Suppliers
JOIN Categories on Products.CategoryID=Categories.CategoryID
JOIN Products on Suppliers.SupplierID=Products.SupplierID
WHERE Categories.CategoryName='Beverages'

-- Задача 5. 
-- Вывести сумму, на которую было отправлено товаров клиентам в USA

SELECT 
ROUND(SUM(Products.price * OrderDetails.quantity))
from Orders
inner join OrderDetails on Orders.OrderID = OrderDetails.OrderID
inner join Customers on Customers.CustomerID = Orders.CustomerID
inner joint Products on OrderDetails.ProductID = Product.ProductID
WHERE Customers.Country = 'USA'
