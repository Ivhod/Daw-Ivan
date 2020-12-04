--Calcular el IVA de un producto que cuesta 97.99€

SELECT ROUND(97.99*0.21,2) AS iva;

--A lo anterior le añadimos el importe 

SELECT ROUND(97.99*0.21,2) AS iva, ROUND(97.99*1.21,2) AS importe;

--La funcion FROM extrae los datos de una tabla

SELECT name, area
FROM provinces;

-- El asterisco es el comodin que vale por todos los campos

SELECT *
FROM provinces;

-- La funcion WHERE selecciona las filas que cumplan una condicion
-- Operadores > < <= >= = <> IN
-- Operadores logicos AND OR NOT

SELECT *
FROM provinces
WHERE region_id = 3; 

-- Las provincias de andalucia y aragon

SELECT *
FROM provinces
WHERE region_id=1 OR region_id=2;

--Las provincias de andalucia,aragon y cataluña

SELECT *
FROM provinces
WHERE region_id = 1 OR region_id=2 OR region_id=9;

--Lo mismo usando el operador IN
-- IN es verdadero si el valor de la izquierda pertenece al conjunto de la derecha

SELECT *
FROM provinces
WHERE region_id IN (1,2,9);

--Rios de longitud superior a 500 km

SELECT *
FROM rivers
WHERE river_length > 500;

--Rios con longitud comprendidad entre 500 y 1000

SELECT *
FROM rivers
WHERE river_length >= 500 AND river_length <= 1000;

--Lo mismo pero con el operador BETWEEN
SELECT *
FROM rivers
WHERE river_length BETWEEN 500 AND 1000;

--Rios de menos de 500 km que desemboca en el Mediterraneo

SELECT *
FROM rivers
WHERE river_length < 500 AND sea = 'Mediterranean';

-- Rios que no sean ni el ebro ni el jucar mi tajo

SELECT *
FROM rivers
WHERE name NOT IN ('Ebro','Júcar','Tajo');

--Consultas con mas de una tabla 
--Se utiliza el producto cartesiano de todas las tablas
--de la clausura FROM

--Producto cartesiano  de regiones y provincias

SELECT *
FROM regions,provinces; 

--Equijoin de dos tablas es un producto cartesiano 
--Seleccionando las filas donde la clave primaria de la tabla padre
--es igual a la clave ajena de la tabla hija
--La cardinalidad del equijoin es igual a la de la tabla hija

SELECT *
FROM regions r,provinces p
WHERE r.region_id=p.region_id;

--Equijoin de riv_pro y rivers

SELECT*
FROM riv_pro rp,rivers r
WHERE rp.river_id=r.river_id;

-- Equijoin mou_pro y mountains
SELECT *
FROM mou_pro mp, mountains m
WHERE mp.mountain_id= m.mountain_id;

--Equijoin provinces y riv_pro

SELECT *
FROM provinces p,riv_pro rp
WHERE p.province_id=rp.province_id;

-- Equijoin provinces y mou_pro
SELECT*
FROM provinces p,mou_pro mp
WHERE p.province_id=mp.province_id;

-- Equijoin de provinces, riv_pro y rivers

SELECT *
FROM provinces p, riv_pro rp, rivers r
WHERE p.province_id=rp.province_id
AND rp.river_id=r.river_id;

-- Equijoin de provinces, mou_pro y mountains

SELECT *
FROM provinces p, mou_pro mp, mountains m
WHERE p.province_id=mp.province_id
AND mp.mountain_id=m.mountain_id;

-- La clausula ORDER BY ordena las filas

-- Las provincias por orden alfabético

SELECT *
FROM provinces 
ORDER BY name;

-- Lo mismo en orden descendente

SELECT *
FROM provinces 
ORDER BY name DESC;

-- Cuando hay valores repetidos en un campo de ordenación,
-- se puede indicar una segunda columna, y una tercera, etc.

-- Nombres de regiones y nombres de provincias ordenados

SELECT r.name, p.name
FROM regions r, provinces p
WHERE r.region_id=p.region_id
ORDER BY r.name, p.name;

-- También podemos sustituir los nombres de columnas por 
-- números de orden

SELECT r.name, p.name
FROM regions r, provinces p
WHERE r.region_id=p.region_id
ORDER BY 1,2;

--La capsula GROUP BY agrupa filas por un campo con valor
--Casi siempre se usa acompañada de funciones de agregados
--En SELECT deben aparecer las mismas columnas que en GROUP BY

--Para cada mar ,longitud maxima
SELECT sea, MAX(river_length),MIN(river_length)
FROM rivers
GROUP BY sea;

--Para cada region numero de provincias
SELECT region_id COUNT(province_id)
FROM provinces
GROUP BY region_id;

--Lo mismo pero con el nombre de la region

SELECT r.name,COUNT(province_id)
FROM provinces p,regions r
WHERE r.region_id=p.region_id
GROUP BY r.name

--Para cada identificador de rio,numero de provincias
--por las que discurre 

SELECT river_id,COUNT(*)
FROM riv_pro, rivers
GROUP BY river_id OR name;

--Lo mismo de antes pero con el nombre de rio

SELECT r.name, r.river_id,COUNT(*)
FROM rivers r, riv_pro rp
WHERE r.river_id=rp.river_id
ORDER BY r.name,r.river_id;

-- Para cada identificador de cadena montañosa,numero de provincias

SELECT mountain_id,COUNT(province_id)
FROM mou_pro
GROUP BY mountains_id;

--Lo mismo de antes pero con el nombre

SELECT m.name,m.mountain_id,COUNT(*)
FROM mountains m,mou_pro mp,
WHERE m.mountain_id=mp.mountain_id,
GROUP BY m.name,m.mountain_id;

--Para cada comunidad autonoma,numero de provincias

SELECT r.name,COUNT(*)
FROM regions r,provinces pi
WHERE r.region_id=pi.region_id
GROUP BY r.name;

--Operador LIKE permite comparar una cadena de caracteres
--con un patron donde % es un comodin

--No me acuerdo de los apellidos del mecanico, pero se llamaba Erv

SELECT *
FROM workers
WHERE name LIKE '%Erv'

--Equijoin de customers e incoives

SELECT *
FROM customers c, invoices v
WHERE c.customer_id=v.customer_id;

--Salen todas las facturas en la consulta anterior?
--Si, todas las facturas se emparejan con sus clientes

--Salen todos los clientes en la consulta anterior
--No, solo los que tienen alguna factura

--Para cada cliente, nombre,email y numero de facturas

SELECT c.name,c.email,COUNT(*)
FROM customers c, invoices v
WHERE c.customer_id=v.customer_id
GROUP BY c.name,c.email;

--Equijoin de vehicles e invoice
SELECT *
FROM vehicles v, invoices i
WHERE v.vehicle_id=i.vehicle_id;

-- ¿Salen todas las facturas en la consulta anterior?
-- No, las facturas que tienen la clave ajena NULL no salen

-- Equijoin de invoices y items_part

SELECT *
FROM invoices i, items_part ip
WHERE i.invoice_id=ip.invoice_id;

-- ¿Salen todas las facturas?
-- No, las facturas sin ítems no salen

-- Basándonos en la consulta anterior, calcular el importe
-- de las piezas y el IVA de cada factura

SELECT i.invoice_id, SUM(ip.units*ip.price) AS import,
	ROUND(SUM(ip.units*ip.price*0.21),2) AS iva
FROM invoices i, items_part ip
WHERE i.invoice_id=ip.invoice_id
GROUP BY i.invoice_id;

-- Calcular la suma de importe y la suma de IVA de todas las facturas
-- Queremos un sólo resultado, sin grupos

SELECT SUM(units*price) AS import, ROUND(SUM(units*price*0.21),2) AS iva
FROM items_part;

-- Equijoin de invoices e items_work

SELECT *
FROM invoices i, items_work iw
WHERE i.invoice_id=iw.invoice_id;

-- Basándonos en la consulta anterior, calcula la suma de horas,
-- el precio de la hora, el importe y el IVA de mano de obra 
-- de cada factura

SELECT i.invoice_id, SUM(iw.hours) AS sum_hours, i.price_hour,
	ROUND(SUM(i.price_hour*iw.hours),2) AS import,
	ROUND(SUM(i.price_hour*iw.hours*0.21),2) AS iva
FROM invoices i, items_work iw
WHERE i.invoice_id=iw.invoice_id
GROUP BY i.invoice_id;

-- Calcular la suma de horas, importe e IVA de todas las facturas
-- Queremos un sólo resultado, sin grupos

SELECT SUM(iw.hours) AS sum_hours,
	ROUND(SUM(i.price_hour*iw.hours),2) AS import,
	ROUND(SUM(i.price_hour*iw.hours*0.21),2) AS iva
FROM invoices i, items_work iw
WHERE i.invoice_id=iw.invoice_id;

-- Equijoin de parts e items_part

SELECT *
FROM parts p, items_part ip
WHERE p.part_id=ip.part_id;

-- Para cada pieza, identificador, descripción, suma de unidades,
-- suma de importe y suma de IVA

SELECT p.part_id, p.description, SUM(ip.units) AS sum_units,
	SUM(ip.units*ip.price) AS sum_import,
	ROUND(SUM(ip.units*ip.price*0.21),2) AS sum_iva
FROM parts p, items_part ip
WHERE p.part_id=ip.part_id
GROUP BY p.part_id, p.description;

-- Equijoin de mechanics e itmes_work
SELECT *
FROM mechanics m, items_work i
WHERE m.mechanic_id=i.mechanic_id;

--Para cada mecanico su identificador, nombre,suma de horas y numero de items

SELECT m.mechanic_id, m.name, SUM(i.hours), COUNT(*) 
FROM mechanics m, items_work i
WHERE m.mechanic_id=i.mechanic_id
GROUP BY m.mechanic_id, m.name;

--Equijoin de vehicles invoices e items_work

SELECT *
FROM vehicles v, invoices i, items_work iw
WHERE iw.invoice_id=i.invoice_id
AND v.vehicle_id=i.vehicle_id;

--Para cada vehiculo, identificador, marca ,modelo suma de horas y numero de items de mano de obra

SELECT v.vehicle_id,v.model,v.brand,SUM(i.hours),COUNT(*)
FROM vehicles v, items_work i, invoice_id id
WHERE v.vehicle_id=id.vehicle_id
AND id.invoice_id= v.invoice_id
GROUP BY v.vehicle_id,v.brand,v.model;

--La clausula DISTINCT elimina duplicados en las filas
--Clientes con facturas, sin duplicados

SELECT DISTINCT c.*
FROM customers c,invoices i
WHERE c.customer_id=i.customer_id;

--Piezas con items, sin duplicados
SELECT DISTINCT p.*
FROM parts p,items_part i
WHERE p.part_id=i.part_id;

--Vehiculos con facturas sin duplicados

SELECT DISTINCT v.*
FROM vehicles v, invoices i
WHERE v.vehicle_id=i.vehicle_id;

--Marcas de vehiculos sin duplicados

SELECT DISTINCT brand
FROM vehicles v;

--Tabla LIBRARY--
	
--Todos los datos de los libros de cervantes
SELECT *
FROM boo_aut b, authors a, books ba
WHERE b.author_id=a.author_id
GROUP BY name='Miguel';

--Todos los datos de los libros de informatica

SELECT *
FROM books b,boo_aut bt, themes t
WHERE b.book_id=bt.book_id AND bt.theme_id=t.theme_id
AND t.name='Computing'

--Todos los datos de los libros prestados a Kevin Smith

SELECT *
FROM books b, copies c, loans l, members m
WHERE b.book_id= c.book_id AND c.copy_id=l.copy_id
AND l.member_id=m.member_id
AND m.name='Smith';

--Todos los datos de los socios que han leido el quijote

SELECT m.*
FROM books b, copies c, loans l, members m
WHERE b.book_id= c.book_id AND c.copy_id=l.copy_id
AND l.member_id=m.member_id
AND b.title LIKE'%Quijote%';

--Para cada libro,todos sus datos y numero de copias

SELECT b.book_id,b.title,b.language,b.pages,b.publisher,COUNT(*)
FROM books b,copies c
WHERE b.book_id=c.book_id
GROUP BY b.book_id,b.title,b.language,b.pages,b.publisher;

--Para cada socio, todos sus datos ynumero de prestamos
SELECT m.member_id,m.name,m.email,m.phone,COUNT(*)
FROM members m,loans l
WHERE m.member_id=l.member_id
GROUP BY m.member_id,m.name,m.email,m.phone;

--Para cada autor, todos sus datos y numero de libros
SELECT a.author_id,a.name,a.born_date,a.death_date,a.country,COUNT(*)
FROM authors a,boo_aut bt
WHERE a.author_id= bt.author_id
GROUP BY a.author_id,a.name,a.born_date,a.death_date,a.country;

--Para cada tema,todos sus datos y numero de libros
SELECT t.theme_id,t.name,COUNT(*)
FROM themes t,boo_the bt
WHERE t.theme_id=bt.theme_id
GROUP BY t.theme_id,t.name;

--Para cada libro,todos sus datos

SELECT b.book_id,b.title,b.language,b.pages,b.publisher,COUNT(*)



--Todos los datos de los socios que hayan leido algo sobre bases de datos

SELECT m.*
FROM themes t,boo_the bt,books b,copies c,loans l, members m
WHERE t.theme_id=bt.theme_id AND bt.book_id=b.book_id AND b.book_id=c.book_id
AND c.copy_id=l.copy_id AND l.member_id=m.member_id
AND t.name='Database'; 

--Todos los datos de los socios que hayan leido algo de cervantes

SELECT m.*
FROM themes t,boo_the bt,books b,copies c,loans l, members m
WHERE t.theme_id=bt.theme_id AND bt.book_id=b.book_id AND b.book_id=c.book_id
AND c.copy_id=l.copy_id AND l.member_id=m.member_id
AND t.name='Cervantes'; 

--Para cada tema,todos sus datos y numero de prestamos

SELECT t.*
FROM themes t,boo_the bt,books b,copies c,loans l
WHERE t.theme_id=bt.theme_id AND bt.book_id=b.book_id
AND b.book_id=c.book_id AND c.copy_id=l.copy_id
GROUP BY t.theme_id,t.name;

--Todos los datos de los socios con prestamos, sin duplicados

SELECT DISTINCT m.member_id,m.name,m.email,m.phone
FROM loans l,members m
WHERE l.member_id=m.member_id
GROUP BY m.member_id,m.name,m.email,m.phone;

-- Para cada tema, todos sus datos, número de libros distintos,
-- número de copias y suma de páginas

SELECT t.theme_id, t.name, COUNT(DISTINCT b.book_id) AS num_books,
COUNT(*) AS num_copies, SUM(b.pages) AS sum_pages
FROM themes t, boo_the bt, books b, copies c
WHERE t.theme_id=bt.theme_id AND bt.book_id=b.book_id 
AND b.book_id=c.book_id
GROUP BY t.theme_id, t.name;

-- Para cada editorial, número de libros y número de copias

SELECT b.publisher, COUNT(DISTINCT b.book_id) AS num_libros, COUNT(*) AS num_copies
FROM books b, copies c
WHERE b.book_id=c.book_id
GROUP BY b.publisher;

-- Para cada autor, todos sus datos, número de libros y número de copias

SELECT a.author_id,a.name,a.born_date,a.death_date,a.country,
	COUNT(DISTINCT b.book_id) AS num_libros, COUNT(*) AS num_copies
FROM copies c, books b, boo_aut ba, authors a
WHERE c.book_id=b.book_id AND b.book_id=ba.book_id 
AND ba.author_id=a.author_id
GROUP BY a.author_id,a.name,a.born_date,a.death_date,a.country;

--Para cada pais ,numero de artistas

SELECT country, COUNT(*)
FROM artist
GROUP BY country;

--Para cada pais,numero de peliculas distintas
SELECT a.country, COUNT(DISTINCT am.movie_id)
FROM art_mov am, artists a
WHERE am.artist_id=a.artist_id
GROUP BY a.country;

--Todos los datos de artistas que hayan sido dirigidos por el
-- artista con identificador 5

SELECT a.artist_id,a.name,a.country,a.gender,a.born_date,a.death_date
FROM artist a,
GROUP 
