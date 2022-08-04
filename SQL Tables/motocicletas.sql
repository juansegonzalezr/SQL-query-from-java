create table motocicletas (
	moto_id int primary key,
	moto_nombre char(20) not null,
	moto_precioUnd int not null,
	moto_autonomia int,
	prov_nombre char(20),
    foreign key(prov_nombre) references proveedor(prov_nombre)    
);
insert into motocicletas values (1,"Starker", 4200000, 18, "Auteco");
insert into motocicletas values (2,"Lucky Lion", 5600000, 14, "Hitachi");
insert into motocicletas values (3,"Be Electric", 4600000, 26, "Auteco");
insert into motocicletas values (4,"Aima", 8000000, 36, "Bosch");
insert into motocicletas values (5,"Mec de Colombia", 5900000, 20, "Teco");
insert into motocicletas values (6,"Atom Electric", 4500000, 12, "General Electric");