--Task1
SELECT rating,COUNT(*) FROM film
GROUP BY rating
ORDER BY COUNT(*);

--Task2
SELECT replacement_cost,COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50
ORDER BY COUNT(*) DESC;

