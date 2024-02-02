create table fraud_check_history (
    id bigserial primary key,
    customer_id int not null,
    is_fraudster boolean not null,
    created_at timestamp not null
)