CREATE TABLE regions
(
	region_id INTEGER(6) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(40)
);

CREATE TABLE provinces
(
	province_id INTEGER(6) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(40),
	population INTEGER(9),
	area INTEGER(6),
	region_id INTEGER(6),
	FOREIGN KEY (region_id) REFERENCES regions (region_id)
);

CREATE TABLE rivers
(
	river_id INTEGER(6) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(30),
	river_length INTEGER(6),
	sea VARCHAR(30)
);

CREATE TABLE mountains
(
	mountain_id INTEGER(6) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(30),
	height INTEGER(6)
);

CREATE TABLE riv_pro
(
	river_id INTEGER(6),
	province_id INTEGER(6),
	riv_order INTEGER(6),
	FOREIGN KEY (river_id) REFERENCES rivers(river_id),
	FOREIGN KEY (province_id) REFERENCES provinces(province_id),
	PRIMARY KEY (river_id, province_id)
);

CREATE TABLE mou_pro
(
	mountain_id INTEGER(6),
	province_id INTEGER(6),
	FOREIGN KEY (mountain_id) REFERENCES mountains(mountain_id),
	FOREIGN KEY (province_id) REFERENCES provinces(province_id),
	PRIMARY KEY (mountain_id, province_id)
);