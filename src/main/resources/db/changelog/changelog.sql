--changeset shopping-cart:1
CREATE TABLE products (
  product_id BIGINT NOT NULL,
  product_name VARCHAR2(255)  NOT NULL,
  product_price BIGINT  NOT NULL
);

CREATE TABLE orders (
  order_id BIGINT NOT NULL,
  order_date datetime NULL,
  total_price BIGINT  NOT NULL
);

CREATE TABLE order_details (
  id BIGINT NOT NULL,
  order_id BIGINT NOT NULL,
  product_id BIGINT NOT NULL, 
  product_price BIGINT NOT NULL
);


--changeset shopping-cart:2
INSERT INTO products (product_id, product_name, product_price) values (1, 'Soap', 20);
INSERT INTO products (product_id, product_name, product_price) values (2, 'Bread', 30);