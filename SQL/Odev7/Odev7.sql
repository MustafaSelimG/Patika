--Task1
SELECT rating,COUNT(*) FROM film
GROUP BY rating
ORDER BY COUNT(*);

--Task2
SELECT replacement_cost,COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY COUNT(*) DESC;

--Task3
SELECT store_id,COUNT(*) FROM customer
GROUP BY store_id;

--Task4
SELECT country_id,COUNT(*) FROM city
GROUP BY country_id
HAVING COUNT(*) > 55;
