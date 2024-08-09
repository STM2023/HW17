CREATE TABLE IF NOT EXISTS users (

name VARCHAR(100) NOT NULL,
password VARCHAR(100)  NOT NULL
);

INSERT   INTO  users
         (  name ,  password )
VALUES
         ( 'user',  'jdbcDefault'),
         ( 'admin', 'admin');

