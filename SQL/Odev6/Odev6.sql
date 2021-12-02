--Task1
SELECT ROUND(AVG(rental_rate),2) FROM film;

--Task2
SELECT COUNT(*) FROM film
WHERE title LIKE 'C%';

--Task3
SELECT MAX(length) FROM film
WHERE rental_rate=0.99;

--Task4
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;
