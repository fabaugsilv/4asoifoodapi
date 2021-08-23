DROP TABLE IF EXISTS MERCHANT;

CREATE TABLE MERCHANT (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  NAME VARCHAR(250) NOT NULL,
  CORPORATE_NAME VARCHAR(250) NOT NULL
);


INSERT INTO MERCHANT (ID, NAME, CORPORATE_NAME) VALUES(1, 'MERCHANT NAME 1', 'MERCHANT CORPORATE 1');
INSERT INTO MERCHANT (ID, NAME, CORPORATE_NAME) VALUES(2, 'MERCHANT NAME 2', 'MERCHANT CORPORATE 2');
INSERT INTO MERCHANT (ID, NAME, CORPORATE_NAME) VALUES(3, 'MERCHANT NAME 3', 'MERCHANT CORPORATE 3');
INSERT INTO MERCHANT (ID, NAME, CORPORATE_NAME) VALUES(4, 'MERCHANT NAME 4', 'MERCHANT CORPORATE 4');
INSERT INTO MERCHANT (ID, NAME, CORPORATE_NAME) VALUES(5, 'MERCHANT NAME 5', 'MERCHANT CORPORATE 5');