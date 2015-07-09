insert into address (house_flat_no, street, postcode, city, country)
  values ('85', 'Curtis Avenue', 'G44 4QD', 'Glasgow', 'Scotland');

insert into customer (customer_firstname, customer_lastname, customer_date_of_birth, customer_email_address, customer_address_id)
  values ('Colin', 'But', '2011-08-21 14:11:09', 'colin.but1@gmail.com', 1);

insert into customer_payment_details (customer_reference, customer_card_number, customer_card_expiry_date, customer_id)
  values ('REF#1', '1234123412341234', '08/15', 1);

insert into orders (customer_id) values (1);

insert into items (item_name, item_price) values ('TV', 350.0);
insert into items (item_name, item_price) values ('Laptop', 330.0);

insert into orders_items (order_id, item_id) values (1, 1);
insert into orders_items (order_id, item_id) values (1, 2);
