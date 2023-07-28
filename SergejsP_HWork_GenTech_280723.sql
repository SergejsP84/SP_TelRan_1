== Task 1: Вывести информацию о заказах клиентов не из Germany и не из China

SELECT Orders.*,
       Customers.Country
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID
WHERE Customers.Country NOT IN ('Germany', 'China');

== Task 2: 
Вывести два самых дорогих товара из категории Beverages

SELECT Products.*, Categories.CategoryName
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE Categories.CategoryName = 'Beverages'
ORDER BY Products.Price DESC
LIMIT 2;

== Task 3: Удалить поставщиков из China

DELETE FROM [Suppliers]
WHERE Country = 'China'

== Task 4: Вывести все заказы клиента 10, которые повезет Federal Shipping

SELECT Orders.*, Shippers.ShipperName
FROM Orders
JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID
WHERE CustomerID = 10 AND Shippers.ShipperName = 'Federal Shipping';

== Task 5: Вывести два самых дорогих напитка из UK

SELECT Products.*,
       Categories.CategoryID,
       Suppliers.Country
FROM [Products]
JOIN Categories ON Products.CategoryID = Categories.CategoryID
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE Products.CategoryID = 1 AND Suppliers.Country = 'UK'
ORDER BY Products.Price DESC
LIMIT 2;

== Task 6: Вывести страны-поставщики напитков

SELECT DISTINCT Country
FROM Suppliers
WHERE SupplierID IN (
    SELECT SupplierID
    FROM Products
    WHERE CategoryID = 1
);