-- El comando CREATE TABLE sirve para crear una tabla
-- SINTAXIS
-- CREATE TABLE <nombre de tabla>
--(<lista de campos>,<lista de calves ajenas>);
--
--

CREATE TABLE users
(
user_id INTEGER (9) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (30),
password VARCHAR (10),
email VARCHAR (30),
born_date DATE
);

CREATE TABLE posts
(
post_id INTEGER (9) PRIMARY KEY AUTO_INCREMENT,
post_text VARCHAR(30),
post_date DATE,
user_id INTEGER (9),
FOREING KEY (user_id) REFERENCES users (user_id)
);

CREATE TABLE reactions
(
post_id INTEGER(9),
user_id INTEGER(9),
react_type INTEGER(9),
FOREING KEY user_id REFERENCES users (user_id),
FOREING KEY post_id REFERENCES posts (post_id)	
);

CREATE TABLE followers
(
follower_id INTEGER(9),
followed_id INTEGER(9),
follow_date	INTEGER(9),
FOREING KEY follower_id REFERENCES users(user_id),
FOREING KEY followed_id REFERENCES users (user_id)
);


CREATE TABLE stations
(
station_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30),
plus_code VARCHAR(30)
);

CREATE TABLE doors
(
door_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
door_type INTEGER(9),
station_id INTEGER(9),
FOREING KEY (station_id) REFERENCES stations (station_id)
);

CREATE TABLE stops
(
stop_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
color_line VARCHAR(30),
stop_num INTEGER(9),
station_id INTEGER(9),
FOREING KEY (station_id) REFERENCES stations (station_id)
);

CREATE TABLE people
(
people_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
people_date DATE,
people_count INTEGER(9),
door_id INTEGER(9),
FOREING KEY (door_id) REFERENCES doors (door_id)
);

CREATE TABLE wagons
(
wagon_id INTEGER(9) PRIMARY KEY AUTO_INCREMENT,
brand VARCHAR(30),
model VARCHAR(30),
capacity INTEGER(9),
);

CREATE TABLE stop_wag
(
stop_wag_id INTEGER(9),
stop_datetime DATETIME,
direction VARCHAR(30),
stop_id INTEGER(9),
wagon_id INTEGER(9),
FOREING KEY (wagon_id) REFERENCES wagons (wagon_id),
FOREING KEY (stop_id) REFERENCES stops (stop_id),
PRIMARY KEY (wagon_id,stop_datetime)
);