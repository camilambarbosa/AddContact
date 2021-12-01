/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  camilabarbosa
 * Created: Nov. 30, 2021
 */

CREATE TABLE contacts
(id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(150) NOT NULL,
number varchar(50) NOT NULL,
email varchar(50) NOT NULL,
address varchar(150) NOT NULL);


INSERT INTO Contacts (Name, Number, Email, Address)
VALUES ('Bob', '1234', 'bob@gmail.com', 'Street1');

INSERT INTO Contacts (Name, Number, Email, Address)
VALUES ('Homer', '2341', 'homer@gmail.com', 'Street2');

INSERT INTO Contacts (Name, Number, Email, Address)
VALUES ('Bart', '3412', 'bart@gmail.com', 'Street3');