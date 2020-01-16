# Creates the quotes table for the applications

USE reviewlister_db;

DROP TABLE IF EXISTS quotes;

CREATE TABLE IF NOT EXISTS quotes (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    author VARCHAR(240) NOT NULL,
    quote TEXT NOT NULL,
    PRIMARY KEY (id)
);
