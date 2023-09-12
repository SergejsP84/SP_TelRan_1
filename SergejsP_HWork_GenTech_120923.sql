-- 1. ������� ������� shippers � ���. ��������� Constraints

CREATE TABLE IF NOT EXISTS Shippers (
	ShipperID int primary key AUTO_INCREMENT,
  	ShipperName varchar (128) NOT NULL,
  	Phone varchar (14) CHECK (Phone LIKE ('(%) %-%'));

INSERT INTO Shippers (ShipperName, Phone)
	VALUES
	('Speedy Express', '(503) 555-9831'),
	('United Package', '(503) 555-3199'),
	('Federal Shipping', '(503) 555-9931');


-- 2. ������� ������, ��������� � 1 ��� 2022 �� 20 ��� 2022

SELECT *
FROM Orders
WHERE
created_at BETWEEN '2022-05-01' AND '2022-05-20'




-- 3. ������� ����� �� "������-������������" � ������� ����������� ������-�������������� ��.
-- ���������� ������������� ����������� ������������ � ����� �� ��� ��� ����������� ������������.

-- https://dbdiagram.io/d/6500100c02bd1c4a5e65e328
