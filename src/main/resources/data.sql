insert into destination(id,country,continent,descriptive, situation) values (1,'Chine', 'Asie','Vibrer avec la muraille','près de la ville');
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (1, 'trois restaurants', 15, 589, 1);
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (2, 'trois restaurants', 7, 219, 1);
insert into destination(id,country,continent,descriptive, situation) values (2,'Japon', 'Asie' ,'Venez manger des sushis','près du lac');
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (3, 'des beaux kimonos', 15, 728, 2);
insert into destination(id,country,continent,descriptive, situation) values (3,'Italie', 'Europe' ,'Profitez du carnaval','près du lac');
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (4, 'bas les masques', 15, 428, 3);
insert into destination(id,country,continent,descriptive, situation) values (4,'Pologne', 'Europe','Cracovie, ville de tous les reves','près de la ville');
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (5, 'des pierogis succulents', 10, 228, 4);
insert into destination(id,country,continent,descriptive, situation) values (5,'Pologne', 'Europe','Varsovie','près de la ville');
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (6, 'des pierogis à foison', 15, 428, 5);
insert into destination(id,country,continent,descriptive, situation) values (6,'Pérou', 'Amerique','les temples incas','près de la ville');
insert into trip (id, descriptive_restauration, duration, price_per_pers, destination_id) values (7, 'tout à valonté', 15, 1028, 6);
insert into role (id, role_type) values(1,'PAYEUR');
insert into role (id, role_type) values(2,'ORGANIZER');
insert into role (id, role_type) values(3,'PARTICIPANT');
insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (1,'2', 1000 ,'2020-04-02',1);
insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (2,'4', 5000 ,'2020-04-02',1);

insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (3,'1', 1000 ,'2020-04-02',2);
insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (4,'2', 2000 ,'2020-04-02',2);

insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (5,'4', 4000 ,'2020-04-02',3);
insert into reservation (id, BED_ROOM_NUMBER, GLOBAL_PRICE, date, PENSION_TYPE) values (6,'8', 8000 ,'2020-04-02',3);


/*insert into person(id,address,city,civility,country,email,first_name,name,phone,zip_code) values (1,'10, rue des restaurants','Montreuil','Monsieur','France','prenom.nom@test.com','test-prenom','test-nom','06-12-34-56-67','93100');
insert into person(id,address,city,civility,country,email,first_name,name,phone,zip_code) values (2,'10, rue des bars','Montreuil','Madame','France','prenom2.nom2@test.com','test-prenom2','test-nom2','06-09-87-65-43','93100');
insert into person(id,address,city,civility,country,email,first_name,name,phone,zip_code) values (3,'10, rue des hotels','Montreuil','Monsieur','France','prenom3.nom3@test.com','test-prenom3','test-nom3','06-09-87-65-43','93100');

insert into payment(id,amount,person_id,reservation_id) values(1,100,2,1);
*/



