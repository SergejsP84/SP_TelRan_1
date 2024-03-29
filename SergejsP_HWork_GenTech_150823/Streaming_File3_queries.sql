-- 3. Вывести данные о стримах (проекция: названиестрима, имяавтора_стрима)

SELECT
    streams.Title,
    users.UserName
FROM streams 
JOIN users ON streams.AuthorID = users.UserID;

-- 4. Вывести юзеров, у которых отсутствуют стримы.

SELECT UserName AS UsersWithNoStreams

FROM users

LEFT JOIN streams ON users.UserID=streams.AuthorID

WHERE streams.AuthorID IS NULL;