--Task1
SELECT DISTINCT replacement_cost FROM film;

--Task2
SELECT COUNT(DISTINCT replacement_cost) FROM film;

--Task3
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%' AND rating = 'G'; 

--Task4
SELECT COUNT(*) FROM country
WHERE country LIKE '_____';

--Task5
SELECT COUNT(*) FROM city
WHERE city ILIKE '%R';
