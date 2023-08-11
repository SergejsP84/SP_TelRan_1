-- ������ 1. 
-- ������� ��-�� ����������� �� �� UK � �� �� China
SELECT
Count(*) AS RelevantSuppliers
FROM suppliers
WHERE NOT Country IN ('UK', 'China')

-- ������ 2. 
-- ������� �������/MAX/MIN ��������� � ��-�� ������� �� ��������� 3 � 5

SELECT
Count(*) AS Number_of_Products,
ROUND(AVG (Price), 2) AS Average_Price,
MIN (Price) AS Minimum_Price,
MAX (Price) AS Maximum_Price
FROM Products
WHERE CategoryID IN (3, 5)

-- ������ 3. 
-- ������� ����� ����� ��������� �������

SELECT
SUM(Products.Price * Quantity) AS TotalSalesValue
FROM [OrderDetails]
JOIN Products on OrderDetails.ProductID=Products.ProductID

-- ������ 4. 
-- ������� ��-�� �����, ������� ���������� �������

SELECT 
Count(DISTINCT Suppliers.Country)
FROM Suppliers
JOIN Categories on Products.CategoryID=Categories.CategoryID
JOIN Products on Suppliers.SupplierID=Products.SupplierID
WHERE Categories.CategoryName='Beverages'

-- ������ 5. 
-- ������� �����, �� ������� ���� ���������� ������� �������� � USA

SELECT 
ROUND(SUM(Products.price * OrderDetails.quantity))
from Orders
inner join OrderDetails on Orders.OrderID = OrderDetails.OrderID
inner join Customers on Customers.CustomerID = Orders.CustomerID
inner joint Products on OrderDetails.ProductID = Product.ProductID
WHERE Customers.Country = 'USA'
