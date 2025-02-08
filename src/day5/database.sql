create table categories (
id serial primary key,
category varchar(120) not null
);
select * from categories
insert into categories(category)
values ('Electronics'),
		('Fashion'),
		('Skincare'),
		('Furniture');


create table products (
	id serial primary key,
	categories_id int not null,
	product_name varchar(255) not null,
	product_price double precision not null,
	constraint fk_categories_products foreign key (categories_id) references categories(id) on delete cascade
);
select * from products
insert into products(product_name,product_price,categories_id)
values ('Sabun',15000000,3),
		('Baju',3000000,2),
		('Jam tangan', 2000000,2),
		('Leptop',50000000,1),
		('Mejah',10000000,4);

create table customers(
id serial primary key,
customers_name varchar(255) not null
);
select * from customers
alter table customers
add column address text;
insert into customers(customers_name)
values ('Ridho'),
		('Darma'),
		('Fachri'),
		('Alwi');
update customers
set address = 'Jl. jakarta raya no 90'

create table orders(
id serial primary key,
customer_id  int not null,
order_date date not null,
constraint fk_customers_orders foreign key (customer_id) references customers(id) on delete cascade
);
select * from orders
insert into orders(order_date,customer_id )
values ('2024-1-1',3),
		('2024-4-1',4),
		('2024-1-1',1),
		('2024-2-1',2);

create table order_items(
id serial primary key,
product_id int not null,
order_id int not null,
quantity int not null,
constraint fk_order_items_products foreign key (product_id) references products(id) on delete cascade,
constraint fk_order_items_orders foreign key (order_id) references orders(id) on delete cascade
);
select * from order_items
insert into order_items(product_id,order_id,quantity)
values (1,4,10),
		(5,1,1),
		(4,2,3),
		(3,3,5);


CREATE TABLE product_reviews (
    id SERIAL PRIMARY KEY,
    review VARCHAR(255) NOT NULL,
    product_id INT NOT NULL,
    customer_id INT NOT NULL,
	constraint fk_product_reviews_products foreign key (product_id) references products(id) on delete cascade,
	constraint fk_product_reviews_customer foreign key (customer_id) references customers(id) on delete cascade
);

alter table product_reviews
add column rating int check (rating between 1 and 5);


select * from product_reviews
insert into product_reviews(review,product_id,customer_id)
values ('baik',1,1),
		('barang jelek',5,4),
		('bagus',3,3),
		('tidak sesuai',2,2);

create table payment_details(
id serial primary key,
order_id int not null,
payment_method varchar(155) not null,
constraint fk_payment_details_orders foreign key (order_id) references orders(id) on delete cascade
);
select * from payment_details
insert into payment_details(order_id,payment_method)
values (1,'BCA'),
		(4,'Uang tunai'),
		(3,'BRI'),
		(2,'Mandiri');



-- Join products with categories
create or replace view product_details as
select c.id,c.category,p.id as product_id,p.categories_id from categories c
inner join  products p on p.categories_id = c.id;
select * from product_details

-- Join orders with customers
create view customer_orders as
select u.id,u.customers_name,o.id as order_id,customer_id,o.order_date from customers u
inner join orders o on o.customer_id = u.id;
select * from customer_orders
-- Join order_items with products
create or replace view order_items_detail as
select p.id,p.categories_id,p.product_name,p.product_price,i.id as order_items_id,i.product_id,i.order_id from products p
inner join order_items i on i.product_id = p.id;
select * from order_items_detail
-- Join orders, order_items, and products
select * from orders o
inner join order_items r on r.order_id = o.id
inner join products p on p.id = r.product_id;
-- Join product_reviews with products and customers
create or replace view product_reviews_details as
select pr.id AS review_id, pr.review, pr.product_id, p.product_name, pr.customer_id from  product_reviews pr
inner join products p on pr.product_id = p.id
inner join customers c on pr.customer_id = c.id;
select * from product_reviews_details



select * from products
where id in (
select product_id from product_reviews
where rating = (select max(rating) from product_reviews )
)

alter table products add constraint unique_product_name unique (product_name);
