CREATE TABLE notification (
    id                BIGSERIAL PRIMARY KEY,
    to_customer_id    INT       NOT NULL,
    to_customer_email INT       NOT NULL,
    sender            INT       NOT NULL,
    message           INT       NOT NULL,
    sent_at           TIMESTAMP NOT NULL
)