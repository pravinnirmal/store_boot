create table users
(
    id        bigint       not null
        primary key,
    user_name varchar(255) not null,
    email     varchar(255) not null,
    password  varchar(255) not null
);

create table address
(
    street  varchar(255) not null,
    city    varchar(255) null,
    state   varchar(255) null,
    user_id bigint       not null,
    id      bigint auto_increment
        primary key,
    constraint address_users_id_fk
        foreign key (user_id) references users (id)
);

