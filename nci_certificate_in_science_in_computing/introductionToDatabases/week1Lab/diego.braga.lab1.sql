-- Create the e-commerce database if it doesn't exist
CREATE DATABASE IF NOT EXISTS ecommerce;
USE ecommerce;

-- Create the 'customers' table
DROP TABLE IF EXISTS customers;
CREATE TABLE customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    address VARCHAR(255)
);

-- Create the 'products' table
DROP TABLE IF EXISTS products;
CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(255),
    description TEXT,
    price DECIMAL(10, 2)
);

-- Create the 'orders' table
DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    order_date DATE,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- Create the 'order_items' table
DROP TABLE IF EXISTS order_items;
CREATE TABLE order_items (
    order_item_id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    product_id INT,
    quantity INT,
    price DECIMAL(10, 2),
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- Insert sample data into the 'customers' table
INSERT INTO customers (first_name, last_name, email, address)
VALUES ('John', 'Doe', 'johndoe@example.com', '123 Main St'),
       ('Alice', 'Smith', 'alice@example.com', '456 Elm St');

-- Insert sample data into the 'products' table
INSERT INTO products (product_name, description, price)
VALUES ('Widget', 'A high-quality widget', 19.99),
       ('Gadget', 'A fantastic gadget', 29.99);

-- Insert sample data into the 'orders' table
INSERT INTO orders (order_date, customer_id)
VALUES ('2023-01-15', 1),
       ('2023-02-20', 2);

-- Insert sample data into the 'order_items' table
INSERT INTO order_items (order_id, product_id, quantity, price)
VALUES (1, 1, 2, 39.98),
       (2, 2, 1, 29.99);
