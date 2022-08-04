create table bicicletas (
	bici_id int primary key,
	bici_nombre char(20) not null,
	bici_precioUnd int not null,
	bici_año int
);
insert into bicicletas values (1,"Cannondale", 1200000, 2020);
insert into bicicletas values (2,"Trek", 1450000, 2019);
insert into bicicletas values (3,"Yeti", 2000000, 2020);
insert into bicicletas values (4,"Fuji", 950000, 2021);
insert into bicicletas values (5,"Bmc", 1950000, 1018);