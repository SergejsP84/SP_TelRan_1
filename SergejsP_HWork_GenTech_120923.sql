-- 1. Описать таблицу shippers с исп. механизма Constraints

CREATE TABLE IF NOT EXISTS Shippers (
	ShipperID int primary key AUTO_INCREMENT,
  	ShipperName varchar (128) NOT NULL,
  	Phone varchar (14) CHECK (Phone LIKE ('(%) %-%'));

INSERT INTO Shippers (ShipperName, Phone)
	VALUES
	('Speedy Express', '(503) 555-9831'),
	('United Package', '(503) 555-3199'),
	('Federal Shipping', '(503) 555-9931');


-- 2. Вывести заказы, сделанные с 1 мая 2022 по 20 мая 2022

SELECT *
FROM Orders
WHERE
created_at BETWEEN '2022-05-01' AND '2022-05-20'




-- 3. Описать схему БД "онлайн-тестирование" с помощью инструмента онлайн-проектирования БД.
-- Необходимо предусмотреть регистрацию пользователя и выбор им тем для прохождения тестирования.

-- https://dbdiagram.io/d/6500100c02bd1c4a5e65e328
