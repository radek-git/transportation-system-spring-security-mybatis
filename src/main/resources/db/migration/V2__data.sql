insert into transport_types (name) values ( 'TRAM' ), ('BUS');

insert into stops (name, latitude, longitude, transport_type_id, is_terminal)
values ( 'Annopol 03', '12.234', '23.345', 1, true ), ('Toruńska 03', '22.222', '33.333', 1, false),
       ('Kondratowicza 03', '34.444', '44.444', 1, false), ('Banacha 04', '66.666', '77.567', 1, true);

insert into lines (name, transport_type_id) values ( '1', 1 ), ('2', 2), ('3', 1);

insert into vehicles (transport_type_id) values ( 1 ), (2), (1);

insert into drivers (name, surname, pesel) values ( 'Jan', 'Nowak', '80111112345' ), ('Roman', 'Kot', '55231212345'),
                                                  ('Marek', 'Orzech', '76121212345');

insert into driver_transports (driver_id, transport_type_id) values (1, 1), (2, 1), (3, 1);

insert into schedules (line_id, vehicle_id, driver_id, starts_at, ends_at, start_stop_id, end_stop_id)
values ( 1, 1, 1, current_timestamp(), current_timestamp(), 1 ,1 );

insert into days_of_week (name) values ( 'monday' ), ('tuesday'), ('wednesday'), ('thursday'), ('friday'), ('saturday'),
                                       ('sunday');

insert into stop_schedules (line_id, arrives_at, stop_id, day_of_week_id)
values ( 1, '10:04:00', 1, 1 ), ( 1, '10:12:00', 1, 1 ), ( 1, '10:18:00', 1, 1 );

insert into line_schedules (line_id, final_stop_id, position, stop_id)
values ( 1, 4, 1, 1 ), ( 1, 4, 2, 2 ), ( 1, 4, 3, 3 ), ( 1, 4, 4, 4 );



