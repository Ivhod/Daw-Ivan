-- Todos los datos de clientes sin facturas

SELECT *
FROM customers
WHERE customer_id NOT IN (
	SELECT customer_id
	FROM invoices
);

-- Todos los datos de vehículos sin facturas

SELECT *
FROM vehicles
WHERE vehicle_id NOT IN (
	SELECT vehicle_id
	FROM invoices
);

-- Suma de horas trabajadas por Rosa

SELECT SUM(hours)
FROM items_work
WHERE mechanic_id = (
	SELECT mechanic_id
	FROM mechanics
	WHERE name LIKE '%Rosa%'
);

-- Suma de importe del producto Battery EXT55

SELECT SUM(units*price)
FROM items_part
WHERE part_id = (
	SELECT part_id
	FROM parts
	WHERE description='Battery EXT55'
);

-- Facturas que sólo tengan mano de obra (sin piezas)

SELECT * 
FROM invoices
WHERE invoice_id IN (
	SELECT invoice_id
	FROM items_work
)
AND invoice_id NOT IN (
	SELECT invoice_id
	FROM items_part
);

-- Facturas que sólo tengan piezas (sin mano de obra)

SELECT * 
FROM invoices
WHERE invoice_id NOT IN (
	SELECT invoice_id
	FROM items_work
)
AND invoice_id IN (
	SELECT invoice_id
	FROM items_part
);

-- Facturas que tengan tanto piezas como mano de obra

-- Piezas que no se hayan vendido nunca

-- Número de facturas de Francesca Renatti 

-- Suma de importe de las facturas de Francesca Renatti 

-- Suma de importe de mano de obra de Francesca Renatti

-- Número de ítems de mano de obra del vehículo 5445BBF

-- Todos los datos de piezas vendidas a vehículos Renault

-- La clausura HAVING es a los grupos lo mismo que la clausula WHERE es a las filas
-- Es decir pone condiciones a los grupos 
-- Las condiciones se establecen sobre funciones de agregados

-- Identificadores de Cliente con mas de una factura 

SELECT customer_id, COUNT(*) 
FROM invoices
GROUP BY customer_id
HAVING COUNT(*)>1;

--Identificadores de piezas con suma de unidades vendidas
-- mayor que 4

SELECT part_id, SUM(units)
FROM items_part
GROUP BY part_id
HAVING SUM(units)>4;

--Identificadores de mecanicos con suma de horas mayor que 5

SELECT mechanic_id, SUM(hours)
FROM items_work
GROUP BY mechanic_id
HAVING SUM(hours)>5;