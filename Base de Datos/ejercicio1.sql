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
