-- 1. Найти мин/стоимость товаров для каждой категории

SELECT Categories.CategoryName, MIN(Price) AS Minimum_Price
FROM Products
JOIN Categories on Products.CategoryID=Categories.CategoryID
GROUP BY Products.CategoryID


-- 2. Вывести ТОП-3 стран по количеству доставленных заказов

SELECT Customers.Country,
Count(*) AS Number_of_orders_delivered
FROM Orders
JOIN Customers on Orders.CustomerID=Customers.CustomerID 
GROUP BY Customers.Country
ORDER BY Number_of_orders_delivered DESC
LIMIT 3

  
-- 3. Вывести названия категорий, в которых более 10 товаров

SELECT Categories.CategoryName, COUNT(*) AS NumberOfProducts
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
GROUP BY Categories.CategoryName
HAVING COUNT(*) > 10;


-- 3a. Очистить тел/номер поставщикам из USA

UPDATE Suppliers
SET Phone = NULL
WHERE Country='USA'


-- 4. Вывести имена и фамилии (и ко-во заказов) менеджеров, у которых ко-во заказов менее 15

SELECT Employees.EmployeeID, Employees.FirstName, Employees.LastName, COUNT(*) AS NumberOfOrders
FROM Orders
JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
GROUP BY Orders.EmployeeID
HAVING COUNT(*) < 15;


-- 5. Вывести товар, который находится на втором месте по ко-ву заказов

SELECT Products.ProductName,
COUNT(*) AS SecondPlace
FROM OrderDetails
JOIN Products on Orderdetails.ProductID=Products.ProductID
GROUP BY Products.ProductID
ORDER BY SecondPlace DESC
LIMIT 1 OFFSET 1;

