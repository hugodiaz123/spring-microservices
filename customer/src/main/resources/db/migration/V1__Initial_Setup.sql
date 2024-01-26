create table customer (
    id bigserial primary key,
    first_name text not null,
    last_name text not null,
    email text not null
);