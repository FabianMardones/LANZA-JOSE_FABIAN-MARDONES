DROP TABLE IF EXISTS ODONTOLOGOS;
CREATE TABLE ODONTOLOGOS (ID INT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100) NOT NULL, NUMERODEMATRICULA INT NOT NULL);


INSERT INTO ODONTOLOGOS (NOMBRE, APELLIDO, NUMERODEMATRICULA) VALUES('JOSE','LANZA', 123456789), ('FABIAN', 'MARDONES', 358546)