-- 1. Удалить всех клиентов из China и Brazil

DELETE FROM Customers
WHERE Country IN ('China', 'Brazil')


-- 2. Вывести название категории, где самая высокая средняя стоимость товаров



SELECT
Categories.CategoryName
FROM Products
JOIN Categories ON Products.CategoryID=Categories.CategoryID
GROUP BY Products.CategoryID
ORDER BY ROUND(AVG(Price), 2) DESC
LIMIT 1


-- 3. Вывести названия трех товаров, которые продаются хуже всего

SELECT Products.ProductName
FROM [OrderDetails]
JOIN Products on OrderDetails.ProductID=Products.ProductID
GROUP BY OrderDetails.ProductID
ORDER BY SUM(Quantity)
LIMIT 3


-- 4. Вывести название одного перевозчика, у которого меньше всего заказов

SELECT Shippers.ShipperName
FROM [Orders]
JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID
GROUP BY Shippers.ShipperName
ORDER BY COUNT(*) ASC
LIMIT 1


-- 5. Вывести товары, добавив поле "цена со скидкой" (на англ.) в 15.5%

SELECT *,
ROUND(Price * 0.845, 2) AS DiscountedPrice
FROM [Products]
