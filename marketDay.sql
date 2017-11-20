DROP DATABASE IF EXISTS trade;
CREATE DATABASE trade;
USE trade;
CREATE TABLE marketDay (
  dayId INT PRIMARY KEY AUTO_INCREMENT NOT NULL ,
  date  DATE NOT NULL ,
  des VARCHAR(20)
);

USE trade;
INSERT INTO marketDay VALUES(null,'2017-10-14','birthday');
INSERT INTO marketDay VALUES(null,'2017-10-15','birthday');
INSERT INTO marketDay VALUES(null,'2017-10-16','birthday');
INSERT INTO marketDay VALUES(null,'2017-10-17','birthday');

