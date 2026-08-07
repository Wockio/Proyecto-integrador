USE dbpi;

CREATE TABLE users (
	ID int AUTO_INCREMENT PRIMARY KEY,
    Usuario VARCHAR(255),
    Contrasena VARCHAR(255)
);

CREATE TABLE clients (
	ID int AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    Apellido VARCHAR(255),
    Sexo VARCHAR(255),
    Edad int,
    Padecimiento VARCHAR(255),
    Contacto VARCHAR(255)
);

SELECT * FROM users;
SELECT * FROM clients;

TRUNCATE TABLE users;
TRUNCATE TABLE clients;

DROP TABLE users;
DROP TABLE clients;