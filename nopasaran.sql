-- Efface la base de donnée si elle existe
DROP DATABASE IF EXISTS nopasarandb;
-- Creer la base de donnée 
CREATE DATABASE nopasarandb CHARACTER SET latin1 COLLATE latin1_general_ci; 

-- Selectionner la base de donnée
USE nopasarandb;



CREATE TABLE Administrateur
(
	id_administrateur INT(5) AUTO_INCREMENT,
	nom VARCHAR(100) NOT NULL,
	motDePasse VARCHAR(100) NOT NULL,
	CONSTRAINT pk_id PRIMARY KEY (id_administrateur)
);


CREATE TABLE Utilisateur
(
	id_utilisateur INT(5) AUTO_INCREMENT,
	nom VARCHAR(100) NOT NULL,
	motDePasse VARCHAR(100) NOT NULL,
	CONSTRAINT pk_id PRIMARY KEY (id_utilisateur)
);

-- insertion Administrateur

INSERT INTO Administrateur (nom,motDePasse) VALUES ("charlie","1234");


-- insertion Utilisateur

INSERT INTO Utilisateur (nom,motDePasse) VALUES ("franck","1234");
