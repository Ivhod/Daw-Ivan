INSERT INTO regions(region_id,name)
VALUES
(NULL,'Andalucía'),
(NULL,'Aragón'),
(NULL,'Asturias'),
(NULL,'Baleares'),
(NULL,'Canarias'),
(NULL,'Cantabria'),
(NULL,'Castilla-La Mancha'),
(NULL,'Castilla y León'),
(NULL,'Cataluña'),
(NULL,'Comunidad Valenciana'), 
(NULL,'Extremadura'),
(NULL,'Galicia'), 
(NULL,'Madrid'),
(NULL,'Murcia'),
(NULL,'Navarra'),
(NULL,'País Vasco'),
(NULL,'La Rioja');

INSERT INTO provinces (name,population,area,region_id)
('Almería',NULL,NULL,1),
('Cádiz',NULL,NULL,2),
('Córdoba',NULL,NULL,3),
('Granada',NULL,NULL,4),
('Huelva',NULL,NULL,5),
('Jaén',NULL,NULL,6),
('Málaga',NULL,NULL,7),
('Sevilla',NULL,NULL,8),
('Huesca, Teruel, Zaragoza'),
('Oviedo'),
('Palma de Mallorca'),
('Santa Cruz de Tenerife, Las Palmas de Gran Canaria'),
('Santander'),
('Albacete, Ciudad Real, Cuenca, Guadalajara, Toledo'),
('Ávila, Burgos, León, Salamanca, Segovia, Soria, Valladolid, Zamora'),
('Barcelona, Gerona, Lérida, Tarragona'),
('Alicante, Castellón de la Plana, Valencia'),
('Badajoz, Cáceres'),
('La Coruña, Lugo, Orense, Pontevedra'),
('Madrid'),
('Murcia'),
('Pamplona'),
('Bilbao, San Sebastián, Vitoria'),
('Logroño');

INSERT INTO rivers(river_id,name,river_length,sea)
VALUES
(NULL,'Miño',340,'Atlantic'),
(NULL,'Duero',897,'Atlantic'),
(NULL,'Tajo',1007,'Atlantic'),
(NULL,'Guadiana',742,'Atlantic'),
(NULL,'Guadalquivir',657,'Atlantic');
(NULL,'Ebro',930,'Mediterranean'),
(NULL,'Jucar',509,'Mediterranean'),
(NULL,'Segura',325,'Mediterranean');

INSERT INTO mountains(mountain_id,name,heigth)
VALUES
(NULL,'Cordillera Cantabrica',2650),
(NULL,'Pirineos',3404),
(NULL,'Sistema Central',2592),
(NULL,'Sistemas Beticos',3479),
(NULL,'Sierra Morena',1332),
(NULL,'Sistema Iberico',2314);

INSERT INTO riv_pro(riv_pro_id,riv_order,river_id,province_id)
VALUES
(NULL,1,5,6,),
(NULL,2,5,3,),
(NULL,3,5,8,),
(NULL,4,5,2,),
(NULL,4,5,5,),
(NULL,1,1,40,),
(NULL,2,1,41,),
(NULL,3,1,42,);

INSERT INTO mou_pro (mou_pro_id,mountain_id,province_id)