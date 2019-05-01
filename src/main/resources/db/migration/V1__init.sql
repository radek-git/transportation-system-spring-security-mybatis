create table transport_types
(
    id   bigint primary key auto_increment,
    name varchar(50)
);


create table stops
(
    id                bigint primary key auto_increment,
    name              varchar(50) unique not null,
    latitude          varchar(20)        not null,
    longitude         varchar(20)        not null,
    transport_type_id bigint             not null,
    is_terminal       boolean default false,

    foreign key (transport_type_id) references transport_types (id)
);



create table lines
(
    id                bigint primary key auto_increment,
    name              varchar(20) unique not null,
    transport_type_id bigint             not null,

    foreign key (transport_type_id) references transport_types (id)
);



create table vehicles
(
    id                bigint primary key auto_increment,
    transport_type_id bigint not null

);


create table drivers
(
    id      bigint primary key auto_increment,
    name    varchar(50)        not null,
    surname varchar(50)        not null,
    pesel   varchar(11) unique not null
);


create table driver_transports
(
    driver_id         bigint not null,
    transport_type_id bigint not null,

    foreign key (driver_id) references drivers (id),
    foreign key (transport_type_id) references transport_types (id),

    primary key (driver_id, transport_type_id)
);


create table schedule
(
    id            bigint primary key auto_increment,
    line_id       bigint   not null,
    vehicle_id    bigint   not null,
    driver_id     bigint   not null,
    starts_at     datetime not null,
    ends_at       datetime not null,
    start_stop_id bigint   not null,
    end_stop_id   bigint   not null,

    foreign key (line_id) references lines (id),
    foreign key (vehicle_id) references vehicles (id),
    foreign key (driver_id) references drivers (id),
    foreign key (start_stop_id) references stops (id),
    foreign key (end_stop_id) references stops (id)
);





