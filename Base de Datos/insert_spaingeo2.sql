CREATE TABLE regions 
(
region_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30)
);

CREATE TABLE provinces
(
province_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30),
population INTEGER(9),
area INTEGER(9),
region_id INTEGER(9),
FOREIGN KEY (region_id) REFERENCES regions (region_id)
);

CREATE TABLE rivers
(
river_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30),
river_length INTEGER(9),
sea VARCHAR(30)
);

CREATE TABLE mountains
(
mountain_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30),
height INTEGER(9)

);


CREATE TABLE riv_pro
(
riv_order INTEGER(9),
river_id INTEGER(9),
province_id INTEGER(9),
FOREIGN KEY (river_id) REFERENCES rivers (river_id),
FOREIGN KEY (province_id) REFERENCES provinces (province_id),
PRIMARY KEY (river_id,province_id)
);

CREATE TABLE mou_pro
(
mountain_id INTEGER(9),
province_id INTEGER(9),
FOREIGN KEY (mountain_id) REFERENCES mountains (mountain_id),
FOREIGN KEY (province_id) REFERENCES provinces (province_id),
PRIMARY KEY (mountain_id, province_id)
);