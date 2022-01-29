create database fiangonanaRevolution;
use fiangonanaRevolution;
create table SinodamParitany
(
	id int primary key,
	nom varchar(50)
);
insert into SinodamParitany values(1,'s1');
create table Fiangonana(
	id int primary key,
	nom varchar(50),
	idSinodaParitany int,
	foreign key (idSinodaParitany) references SinodamParitany(id)
);
insert into Fiangonana values(1,'F1',1);
create table Pasitera(
	id int primary key,
	nom varchar(50),
	mdp varchar(50),
	idFiangonana int,
	foreign key (idFiangonana) references Fiangonana(id)
);
insert into Pasitera values(1,'Pasitera1','1234',1);
create table Famille(
	id int primary key,
	nom varchar(50)
);
insert into Famille values(1,'Famille1');
insert into Famille values(2,'Famille2');
create table Mpiangona(
	id int primary key,
	nom varchar(50),
	mdp varchar(50),
	idFamille int,
	idFiangonana int,
	foreign key (idFiangonana) references Fiangonana(id),
	foreign key (idFamille) references Famille(id)
);
insert into Mpiangona values(1,'M1','1234',1,1);
insert into Mpiangona values(2,'M2','1234',1,1);
insert into Mpiangona values(3,'M3','1234',1,1);
insert into Mpiangona values(4,'M4','1234',1,1);
insert into Mpiangona values(5,'M5','1234',2,1);
insert into Mpiangona values(6,'M6','1234',2,1);
create table Mpandray(
	id int primary key,
	idMpiangona int,
	foreign key (idMpiangona) references Mpiangona(id)
);
insert into Mpandray values (1,1);
insert into Mpandray values (2,2);
insert into Mpandray values (3,3);
insert into Mpandray values (4,4);
insert into Mpandray values (5,5);
create table Caisse(
	id int primary key,
	montant float,
	idFiangonana int,
	foreign key (idFiangonana) references Fiangonana(id)
);
insert into Caisse values(1,10000.1,1);
create table Rakitra(
	id int primary key,
	idFiangonana int,
	montant float,
	semaine int,
	annee int,
	foreign key (idFiangonana) references Fiangonana(id)
);
create sequence seq_Rakitra  start with 1 increment by 1;

insert into Rakitra values(next value for seq_Rakitra,1,100.0,1,2017);
insert into Rakitra values(next value for seq_Rakitra,1,123.0,2,2017);
insert into Rakitra values(next value for seq_Rakitra,1,111.0,3,2017);
insert into Rakitra values(next value for seq_Rakitra,1,234.0,4,2017);
insert into Rakitra values(next value for seq_Rakitra,1,123.0,5,2017);
insert into Rakitra values(next value for seq_Rakitra,1,2345.0,6,2017);
insert into Rakitra values(next value for seq_Rakitra,1,24.0,7,2017);
insert into Rakitra values(next value for seq_Rakitra,1,1246.0,8,2017);
insert into Rakitra values(next value for seq_Rakitra,1,123,9,2017);
insert into Rakitra values(next value for seq_Rakitra,1,123,10,2017);
insert into Rakitra values(next value for seq_Rakitra,1,45,11,2017);
insert into Rakitra values(next value for seq_Rakitra,1,34,12,2017);
insert into Rakitra values(next value for seq_Rakitra,1,789,13,2017);
insert into Rakitra values(next value for seq_Rakitra,1,654,14,2017);
insert into Rakitra values(next value for seq_Rakitra,1,356,15,2017);
insert into Rakitra values(next value for seq_Rakitra,1,24,16,2017);
insert into Rakitra values(next value for seq_Rakitra,1,122,17,2017);
insert into Rakitra values(next value for seq_Rakitra,1,63,18,2017);
insert into Rakitra values(next value for seq_Rakitra,1,135,19,2017);
insert into Rakitra values(next value for seq_Rakitra,1,643,20,2017);
insert into Rakitra values(next value for seq_Rakitra,1,13,21,2017);
insert into Rakitra values(next value for seq_Rakitra,1,241,22,2017);
insert into Rakitra values(next value for seq_Rakitra,1,754,23,2017);
insert into Rakitra values(next value for seq_Rakitra,1,643,24,2017);
insert into Rakitra values(next value for seq_Rakitra,1,68,25,2017);
insert into Rakitra values(next value for seq_Rakitra,1,98,26,2017);
insert into Rakitra values(next value for seq_Rakitra,1,543,27,2017);
insert into Rakitra values(next value for seq_Rakitra,1,12,28,2017);
insert into Rakitra values(next value for seq_Rakitra,1,23,29,2017);
insert into Rakitra values(next value for seq_Rakitra,1,21,30,2017);
insert into Rakitra values(next value for seq_Rakitra,1,234,34,2017);
insert into Rakitra values(next value for seq_Rakitra,1,432,35,2017);
insert into Rakitra values(next value for seq_Rakitra,1,23,36,2017);
insert into Rakitra values(next value for seq_Rakitra,1,654,37,2017);
insert into Rakitra values(next value for seq_Rakitra,1,12,38,2017);
insert into Rakitra values(next value for seq_Rakitra,1,654,39,2017);
insert into Rakitra values(next value for seq_Rakitra,1,356,40,2017);
insert into Rakitra values(next value for seq_Rakitra,1,642,41,2017);
insert into Rakitra values(next value for seq_Rakitra,1,876,42,2017);
insert into Rakitra values(next value for seq_Rakitra,1,143,43,2017);
insert into Rakitra values(next value for seq_Rakitra,1,232,44,2017);
insert into Rakitra values(next value for seq_Rakitra,1,113,45,2017);
insert into Rakitra values(next value for seq_Rakitra,1,124,46,2017);
insert into Rakitra values(next value for seq_Rakitra,1,2244,47,2017);
insert into Rakitra values(next value for seq_Rakitra,1,235,48,2017);
insert into Rakitra values(next value for seq_Rakitra,1,233,49,2017);
insert into Rakitra values(next value for seq_Rakitra,1,123,50,2017);
insert into Rakitra values(next value for seq_Rakitra,1,123,51,2017);
insert into Rakitra values(next value for seq_Rakitra,1,55.0,52,2017);
insert into Rakitra values(next value for seq_Rakitra,1,109.0,31,2017);
insert into Rakitra values(next value for seq_Rakitra,1,150.1,32,2017);
insert into Rakitra values(next value for seq_Rakitra,1,99.0,33,2017);

insert into Rakitra values(next value for seq_Rakitra,1,345,1,2018);
insert into Rakitra values(next value for seq_Rakitra,1,55,2,2018);
insert into Rakitra values(next value for seq_Rakitra,1,33,3,2018);
insert into Rakitra values(next value for seq_Rakitra,1,567,4,2018);
insert into Rakitra values(next value for seq_Rakitra,1,44,5,2018);
insert into Rakitra values(next value for seq_Rakitra,1,44,6,2018);
insert into Rakitra values(next value for seq_Rakitra,1,754,7,2018);
insert into Rakitra values(next value for seq_Rakitra,1,466,8,2018);
insert into Rakitra values(next value for seq_Rakitra,1,33,9,2018);
insert into Rakitra values(next value for seq_Rakitra,1,44,10,2018);
insert into Rakitra values(next value for seq_Rakitra,1,55,11,2018);
insert into Rakitra values(next value for seq_Rakitra,1,876,12,2018);
insert into Rakitra values(next value for seq_Rakitra,1,456,13,2018);
insert into Rakitra values(next value for seq_Rakitra,1,133,14,2018);
insert into Rakitra values(next value for seq_Rakitra,1,133,15,2018);
insert into Rakitra values(next value for seq_Rakitra,1,133,16,2018);
insert into Rakitra values(next value for seq_Rakitra,1,123,17,2018);
insert into Rakitra values(next value for seq_Rakitra,1,133,18,2018);
insert into Rakitra values(next value for seq_Rakitra,1,222,19,2018);
insert into Rakitra values(next value for seq_Rakitra,1,223,20,2018);
insert into Rakitra values(next value for seq_Rakitra,1,223,21,2018);
insert into Rakitra values(next value for seq_Rakitra,1,22,22,2018);
insert into Rakitra values(next value for seq_Rakitra,1,244,23,2018);
insert into Rakitra values(next value for seq_Rakitra,1,234,24,2018);
insert into Rakitra values(next value for seq_Rakitra,1,334,25,2018);
insert into Rakitra values(next value for seq_Rakitra,1,3344,26,2018);
insert into Rakitra values(next value for seq_Rakitra,1,344,27,2018);
insert into Rakitra values(next value for seq_Rakitra,1,22,28,2018);
insert into Rakitra values(next value for seq_Rakitra,1,2000,29,2018);
insert into Rakitra values(next value for seq_Rakitra,1,999,30,2018);
insert into Rakitra values(next value for seq_Rakitra,1,888,34,2018);
insert into Rakitra values(next value for seq_Rakitra,1,888,35,2018);
insert into Rakitra values(next value for seq_Rakitra,1,8777,36,2018);
insert into Rakitra values(next value for seq_Rakitra,1,666,37,2018);
insert into Rakitra values(next value for seq_Rakitra,1,6345,38,2018);
insert into Rakitra values(next value for seq_Rakitra,1,222,39,2018);
insert into Rakitra values(next value for seq_Rakitra,1,333,40,2018);
insert into Rakitra values(next value for seq_Rakitra,1,333,41,2018);
insert into Rakitra values(next value for seq_Rakitra,1,444,42,2018);
insert into Rakitra values(next value for seq_Rakitra,1,444,43,2018);
insert into Rakitra values(next value for seq_Rakitra,1,444,44,2018);
insert into Rakitra values(next value for seq_Rakitra,1,333,45,2018);
insert into Rakitra values(next value for seq_Rakitra,1,333,46,2018);
insert into Rakitra values(next value for seq_Rakitra,1,333,47,2018);
insert into Rakitra values(next value for seq_Rakitra,1,333,48,2018);
insert into Rakitra values(next value for seq_Rakitra,1,222,49,2018);
insert into Rakitra values(next value for seq_Rakitra,1,222,50,2018);
insert into Rakitra values(next value for seq_Rakitra,1,222,51,2018);
insert into Rakitra values(next value for seq_Rakitra,1,111,52,2018);
insert into Rakitra values(next value for seq_Rakitra,1,111,31,2018);
insert into Rakitra values(next value for seq_Rakitra,1,111,32,2018);
insert into Rakitra values(next value for seq_Rakitra,1,122,33,2018);

insert into Rakitra values(next value for seq_Rakitra,1,11,1,2019);
insert into Rakitra values(next value for seq_Rakitra,1,11,2,2019);
insert into Rakitra values(next value for seq_Rakitra,1,11222,3,2019);
insert into Rakitra values(next value for seq_Rakitra,1,222,4,2019);
insert into Rakitra values(next value for seq_Rakitra,1,222,5,2019);
insert into Rakitra values(next value for seq_Rakitra,1,22,6,2019);
insert into Rakitra values(next value for seq_Rakitra,1,222,7,2019);
insert into Rakitra values(next value for seq_Rakitra,1,222,8,2019);
insert into Rakitra values(next value for seq_Rakitra,1,25,9,2019);
insert into Rakitra values(next value for seq_Rakitra,1,255,10,2019);
insert into Rakitra values(next value for seq_Rakitra,1,245,11,2019);
insert into Rakitra values(next value for seq_Rakitra,1,123,12,2019);
insert into Rakitra values(next value for seq_Rakitra,1,422,13,2019);
insert into Rakitra values(next value for seq_Rakitra,1,466,14,2019);
insert into Rakitra values(next value for seq_Rakitra,1,6433,15,2019);
insert into Rakitra values(next value for seq_Rakitra,1,144,16,2019);
insert into Rakitra values(next value for seq_Rakitra,1,134,17,2019);
insert into Rakitra values(next value for seq_Rakitra,1,123,18,2019);
insert into Rakitra values(next value for seq_Rakitra,1,466,19,2019);
insert into Rakitra values(next value for seq_Rakitra,1,546,20,2019);
insert into Rakitra values(next value for seq_Rakitra,1,255,21,2019);
insert into Rakitra values(next value for seq_Rakitra,1,245,22,2019);
insert into Rakitra values(next value for seq_Rakitra,1,1334,23,2019);
insert into Rakitra values(next value for seq_Rakitra,1,222,24,2019);
insert into Rakitra values(next value for seq_Rakitra,1,22,25,2019);
insert into Rakitra values(next value for seq_Rakitra,1,144,26,2019);
insert into Rakitra values(next value for seq_Rakitra,1,134,27,2019);
insert into Rakitra values(next value for seq_Rakitra,1,12,28,2019);
insert into Rakitra values(next value for seq_Rakitra,1,367,29,2019);
insert into Rakitra values(next value for seq_Rakitra,1,25,30,2019);
insert into Rakitra values(next value for seq_Rakitra,1,211,34,2019);
insert into Rakitra values(next value for seq_Rakitra,1,256,35,2019);
insert into Rakitra values(next value for seq_Rakitra,1,256,36,2019);
insert into Rakitra values(next value for seq_Rakitra,1,256,37,2019);
insert into Rakitra values(next value for seq_Rakitra,1,252,38,2019);
insert into Rakitra values(next value for seq_Rakitra,1,522,39,2019);
insert into Rakitra values(next value for seq_Rakitra,1,522,40,2019);
insert into Rakitra values(next value for seq_Rakitra,1,245,41,2019);
insert into Rakitra values(next value for seq_Rakitra,1,256,42,2019);
insert into Rakitra values(next value for seq_Rakitra,1,632,43,2019);
insert into Rakitra values(next value for seq_Rakitra,1,246,44,2019);
insert into Rakitra values(next value for seq_Rakitra,1,74,45,2019);
insert into Rakitra values(next value for seq_Rakitra,1,3246,46,2019);
insert into Rakitra values(next value for seq_Rakitra,1,1445,47,2019);
insert into Rakitra values(next value for seq_Rakitra,1,7643523,48,2019);
insert into Rakitra values(next value for seq_Rakitra,1,653,49,2019);
insert into Rakitra values(next value for seq_Rakitra,1,7654,50,2019);
insert into Rakitra values(next value for seq_Rakitra,1,135,51,2019);
insert into Rakitra values(next value for seq_Rakitra,1,124,52,2019);
insert into Rakitra values(next value for seq_Rakitra,1,124,31,2019);
insert into Rakitra values(next value for seq_Rakitra,1,123,32,2019);
insert into Rakitra values(next value for seq_Rakitra,1,12,33,2019);

insert into Rakitra values(next value for seq_Rakitra,1,11,1,2020);
insert into Rakitra values(next value for seq_Rakitra,1,11,2,2020);
insert into Rakitra values(next value for seq_Rakitra,1,11222,3,2020);
insert into Rakitra values(next value for seq_Rakitra,1,222,4,2020);
insert into Rakitra values(next value for seq_Rakitra,1,222,5,2020);
insert into Rakitra values(next value for seq_Rakitra,1,22,6,2020);
insert into Rakitra values(next value for seq_Rakitra,1,222,7,2020);
insert into Rakitra values(next value for seq_Rakitra,1,222,8,2020);
insert into Rakitra values(next value for seq_Rakitra,1,25,9,2020);
insert into Rakitra values(next value for seq_Rakitra,1,255,10,2020);
insert into Rakitra values(next value for seq_Rakitra,1,245,11,2020);
insert into Rakitra values(next value for seq_Rakitra,1,123,12,2020);
insert into Rakitra values(next value for seq_Rakitra,1,422,13,2020);
insert into Rakitra values(next value for seq_Rakitra,1,466,14,2020);
insert into Rakitra values(next value for seq_Rakitra,1,6433,15,2020);
insert into Rakitra values(next value for seq_Rakitra,1,144,16,2020);
insert into Rakitra values(next value for seq_Rakitra,1,134,17,2020);
insert into Rakitra values(next value for seq_Rakitra,1,123,18,2020);
insert into Rakitra values(next value for seq_Rakitra,1,466,19,2020);
insert into Rakitra values(next value for seq_Rakitra,1,546,20,2020);
insert into Rakitra values(next value for seq_Rakitra,1,255,21,2020);
insert into Rakitra values(next value for seq_Rakitra,1,245,22,2020);
insert into Rakitra values(next value for seq_Rakitra,1,1334,23,2020);
insert into Rakitra values(next value for seq_Rakitra,1,222,24,2020);
insert into Rakitra values(next value for seq_Rakitra,1,22,25,2020);
insert into Rakitra values(next value for seq_Rakitra,1,144,26,2020);
insert into Rakitra values(next value for seq_Rakitra,1,134,27,2020);
insert into Rakitra values(next value for seq_Rakitra,1,12,28,2020);
insert into Rakitra values(next value for seq_Rakitra,1,367,29,2020);
insert into Rakitra values(next value for seq_Rakitra,1,25,30,2020);
insert into Rakitra values(next value for seq_Rakitra,1,211,34,2020);
insert into Rakitra values(next value for seq_Rakitra,1,256,35,2020);
insert into Rakitra values(next value for seq_Rakitra,1,256,36,2020);
insert into Rakitra values(next value for seq_Rakitra,1,256,37,2020);
insert into Rakitra values(next value for seq_Rakitra,1,252,38,2020);
insert into Rakitra values(next value for seq_Rakitra,1,522,39,2020);
insert into Rakitra values(next value for seq_Rakitra,1,522,40,2020);
insert into Rakitra values(next value for seq_Rakitra,1,245,41,2020);
insert into Rakitra values(next value for seq_Rakitra,1,256,42,2020);
insert into Rakitra values(next value for seq_Rakitra,1,632,43,2020);
insert into Rakitra values(next value for seq_Rakitra,1,246,44,2020);
insert into Rakitra values(next value for seq_Rakitra,1,74,45,2020);
insert into Rakitra values(next value for seq_Rakitra,1,3246,46,2020);
insert into Rakitra values(next value for seq_Rakitra,1,1445,47,2020);
insert into Rakitra values(next value for seq_Rakitra,1,7643523,48,2020);
insert into Rakitra values(next value for seq_Rakitra,1,653,49,2020);
insert into Rakitra values(next value for seq_Rakitra,1,7654,50,2020);
insert into Rakitra values(next value for seq_Rakitra,1,135,51,2020);
insert into Rakitra values(next value for seq_Rakitra,1,124,52,2020);
insert into Rakitra values(next value for seq_Rakitra,1,124,31,2020);
insert into Rakitra values(next value for seq_Rakitra,1,123,32,2020);
insert into Rakitra values(next value for seq_Rakitra,1,12,33,2020);

insert into Rakitra values(next value for seq_Rakitra,1,24,1,2021);
insert into Rakitra values(next value for seq_Rakitra,1,245,2,2021);
insert into Rakitra values(next value for seq_Rakitra,1,2455,3,2021);
insert into Rakitra values(next value for seq_Rakitra,1,245,4,2021);
insert into Rakitra values(next value for seq_Rakitra,1,245,5,2021);
insert into Rakitra values(next value for seq_Rakitra,1,245,6,2021);
insert into Rakitra values(next value for seq_Rakitra,1,24,7,2021);
insert into Rakitra values(next value for seq_Rakitra,1,245,8,2021);
insert into Rakitra values(next value for seq_Rakitra,1,345,9,2021);
insert into Rakitra values(next value for seq_Rakitra,1,2334,10,2021);
insert into Rakitra values(next value for seq_Rakitra,1,2344,11,2021);
insert into Rakitra values(next value for seq_Rakitra,1,24,12,2021);
insert into Rakitra values(next value for seq_Rakitra,1,23356,13,2021);
insert into Rakitra values(next value for seq_Rakitra,1,323,14,2021);
insert into Rakitra values(next value for seq_Rakitra,1,656,15,2021);
insert into Rakitra values(next value for seq_Rakitra,1,234,16,2021);
insert into Rakitra values(next value for seq_Rakitra,1,34,17,2021);
insert into Rakitra values(next value for seq_Rakitra,1,23,18,2021);
insert into Rakitra values(next value for seq_Rakitra,1,4322,19,2021);
insert into Rakitra values(next value for seq_Rakitra,1,23,20,2021);
insert into Rakitra values(next value for seq_Rakitra,1,234,21,2021);
insert into Rakitra values(next value for seq_Rakitra,1,223,22,2021);
insert into Rakitra values(next value for seq_Rakitra,1,311,23,2021);
insert into Rakitra values(next value for seq_Rakitra,1,533,24,2021);
insert into Rakitra values(next value for seq_Rakitra,1,124,25,2021);
insert into Rakitra values(next value for seq_Rakitra,1,21,26,2021);
insert into Rakitra values(next value for seq_Rakitra,1,213,27,2021);
insert into Rakitra values(next value for seq_Rakitra,1,42,28,2021);
insert into Rakitra values(next value for seq_Rakitra,1,543,29,2021);
insert into Rakitra values(next value for seq_Rakitra,1,123,30,2021);
insert into Rakitra values(next value for seq_Rakitra,1,11,34,2021);
insert into Rakitra values(next value for seq_Rakitra,1,321,35,2021);
insert into Rakitra values(next value for seq_Rakitra,1,235,36,2021);
insert into Rakitra values(next value for seq_Rakitra,1,123,37,2021);
insert into Rakitra values(next value for seq_Rakitra,1,123,38,2021);
insert into Rakitra values(next value for seq_Rakitra,1,678,39,2021);
insert into Rakitra values(next value for seq_Rakitra,1,45,40,2021);
insert into Rakitra values(next value for seq_Rakitra,1,124,41,2021);
insert into Rakitra values(next value for seq_Rakitra,1,234,42,2021);
insert into Rakitra values(next value for seq_Rakitra,1,12,43,2021);
insert into Rakitra values(next value for seq_Rakitra,1,9,44,2021);
insert into Rakitra values(next value for seq_Rakitra,1,8,45,2021);
insert into Rakitra values(next value for seq_Rakitra,1,7,46,2021);
insert into Rakitra values(next value for seq_Rakitra,1,6,47,2021);
insert into Rakitra values(next value for seq_Rakitra,1,5,48,2021);
insert into Rakitra values(next value for seq_Rakitra,1,4,49,2021);
insert into Rakitra values(next value for seq_Rakitra,1,3,50,2021);
insert into Rakitra values(next value for seq_Rakitra,1,2,51,2021);
insert into Rakitra values(next value for seq_Rakitra,1,1,52,2021);
insert into Rakitra values(next value for seq_Rakitra,1,12,31,2021);
insert into Rakitra values(next value for seq_Rakitra,1,133,32,2021);
insert into Rakitra values(next value for seq_Rakitra,1,123,33,2021);
create table PretFutur
(
	id int primary key,
	datePret datetime,
	dateLimite datetime,
	idMpiangona int,
	montant float,
	foreign key (idMpiangona) references Mpiangona(id)
);
create sequence seq_PretFutur start with 1 increment by 1;
create table Pret
(
	id int primary key,
	dateLimite datetime,
	datePret datetime,
	idMpiangona int,
	montant float,
	interet float default 0,
	foreign key (idMpiangona) references Mpiangona(id)
);
create sequence seq_Pret  start with 1 increment by 1;
create table DetailPret(
	id int primary key,
	idPret int,
	date datetime,
	montant float,
	remarque varchar(50),
	foreign key (idPret) references Pret(id)
);
create sequence seq_DetailPret start with 1 increment by 1;
create table Remboursement
(
	id int primary key,
	idPret int ,
	date datetime,
	montant float,
	remarque varchar(50),
	foreign key (idPret) references Pret(id)
);
create sequence seq_Remboursement start with 1 increment by 1;
create table ConfiancePlus(
	id int primary key,
	idPret int,
	plus float,
	foreign key (idPret) references Pret(id)
);
create sequence seq_Confiance start with 1 increment by 1;

create table PourcentageRakitra(
	id int primary key,
	pourcentage float,
	idFiangonana int,
	date1 datetime,
	date2 datetime,
	foreign key (idFiangonana) references Fiangonana(id)
);
create sequence seq_PourcentageRakitra start with 1 increment by 1;
