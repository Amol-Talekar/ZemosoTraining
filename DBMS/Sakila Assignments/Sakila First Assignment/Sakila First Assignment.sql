create database sakila;
use sakila;

#Find out the number of movies in which “SEAN WILLIAMS” acted.
select count(*) as NumberOfMovies from film_actor 
inner join film on film.film_id=film_actor.film_id
inner join actor on film_actor.actor_id=actor.actor_id
where actor.first_name = 'SEAN' and actor.last_name = 'WILLIAMS';









#Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.
select distinct customer.customer_id, customer.first_name, customer.last_name,country.country, actor.first_name, actor.last_name from
actor inner join film_actor on actor.actor_id = film_actor.actor_id
inner join film on film_actor.film_id = film.film_id
inner join inventory on film.film_id=inventory.film_id 
inner join rental on inventory.inventory_id=rental.inventory_id
inner join customer on rental.customer_id=customer.customer_id
inner join address on customer.address_id=address.address_id
inner join city on address.city_id= city.city_id
inner join country on city.country_id=country.country_id
where country.country="Canada" and actor.first_name="Nick" and actor.last_name = "WAHLBERG";



#Find out the list of customers from India who have rented sports movies.
select distinct customer.customer_id, customer.first_name, customer.last_name,country.country, category.name from
category inner join film_category on category.category_id=film_category.category_id
inner join film on film_category.film_id= film.film_id
inner join inventory on film.film_id=inventory.film_id 
inner join rental on inventory.inventory_id=rental.inventory_id
inner join customer on rental.customer_id=customer.customer_id
inner join address on customer.address_id=address.address_id
inner join city on address.city_id= city.city_id
inner join country on city.country_id=country.country_id
where country.country="India" and category.name="Sports" 
order by customer.first_name;



#Find out the top 3 rented horror movies.
select distinct film.title
from film_category inner join film on film.film_id=film_category.film_id 
inner join category on film_category.category_id=category.category_id 
inner join inventory on film.film_id=inventory.film_id
inner join rental on inventory.inventory_id=rental.inventory_id
where category.name="Horror" group by film.title order by count(film.title) desc limit 3;
 









#Find out the PG-13 rated comedy movies
select title, rating,category.name
from film
inner join category
where rating="PG-13" and category.name="Comedy";


