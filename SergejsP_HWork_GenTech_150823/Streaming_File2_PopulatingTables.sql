INSERT INTO users (UserName, Country) VALUES 
('Chutimon Artrappayut', 'Thailand'),
('Lesczek Bekowsky', 'Poland'),
('Cole Phelps', 'USA'),
('Yekaterina Pavlova', 'Russia'),
('Sergejs Ponomarenko', 'Latvia'),
('Ji Wen Ja', 'China'),
('Gunther Hermann', 'Germany'),
('Nasr-ad-Din al-Kharazmi', 'UAE'),
('Pekka Kwakinnen', 'Finland'),
('Tim Stockton', 'UK');

INSERT INTO authors (AuthorID, UserID, StreamCount, FollowerCount)
VALUES
  (1, 1, 3, 150),
  (3, 3, 5, 320),
  (11, 11, 2, 90),
  (12, 12, 4, 210);

INSERT INTO streams (Title, AuthorID)
VALUES
  ('Exploring Thai Street Food', 1),
  ('Thai Beach Paradise Tour', 3),
  ('Cooking Authentic Thai Curry', 7),
  ('Cultural Insights: Thailand', 9);

INSERT INTO reactions (Value, AuthorID, StreamID)
VALUES
  ('-1', 1, 1),
  ('+1', 3, 2),
  ('-2', 7, 3),
  ('+3', 9, 4);

INSERT INTO donations (AuthorID, StreamID, Amount)
VALUES
  (2, 3, 25.0),
  (4, 3, 18.5),
  (9, 2, 250.0),
  (10, 4, 10.3),
  (1, 1, 130.0),
  (7, 3, 65.8),
  (3, 4, 150.2),
  (6, 2, 3.7);
