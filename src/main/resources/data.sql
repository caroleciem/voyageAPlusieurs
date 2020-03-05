/*
*/
insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (1,'2', 1000 ,'2020-04-02',1);
insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (2,'4', 5000 ,'2020-04-02',1);

insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (3,'1', 1000 ,'2020-04-02',2);

insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (5,'4', 4000 ,'2020-04-02',3);
insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (6,'8', 8000 ,'2020-04-02',3);


insert into destination(id,country,continent,descriptive, situation) values (1,'Chine', 'Asie' ,'vibrer avec la muraille','près de la ville');
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (1, 'trois restaurants', 15, 589, 1);
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (2, 'trois restaurants', 7, 219, 1);

insert into destination(id,country,continent,descriptive, situation) values (2,'Japon', 'Asie' ,'venez manger des sushis','près du lac');



