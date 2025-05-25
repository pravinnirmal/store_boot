create table profiles
(
    id            bigint        not null,
    bio           varchar(255)  null,
    phone_number  int           not null,
    date_of_birth date          null,
    loyalty_point int default 0 not null
);

