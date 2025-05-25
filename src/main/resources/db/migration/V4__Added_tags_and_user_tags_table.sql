create table tags
(
    tag_name varchar(255) not null,
    tag_id   int          not null
        primary key
);

create table user_tags
(
    user_id bigint not null,
    tag_id  int    null,
    constraint user_tags_tags_tag_id_fk
        foreign key (tag_id) references tags (tag_id)
);

