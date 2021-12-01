--Task1
SELECT * FROM country
WHERE country LIKE 'A%a';

--Task2
SELECT * FROM country
WHERE country LIKE '%_____n';

--Task3
SELECT title FROM film
WHERE title ILIKE '%T%T%T%T%';

--Task4
SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND  rental_rate = 2.99;