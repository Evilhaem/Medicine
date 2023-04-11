CREATE database simple_medicine;
USE simple_medicine;
CREATE TABLE medicinereg (
  name VARCHAR(255),
  id VARCHAR(255),
  country VARCHAR(255),
  ingredients VARCHAR(255),
  number VARCHAR(255),
  purpose VARCHAR(255),
  manudate DATE,
  expdate DATE,
  regdate DATE,
  additional VARCHAR(255)
);
CREATE TABLE injectionreg (
  name VARCHAR(255),
  id VARCHAR(255),
  country VARCHAR(255),
  ingredients VARCHAR(255),
  number VARCHAR(255),
  dose VARCHAR(255),
  manudate DATE,
  expdate DATE,
  regdate DATE,
  additional VARCHAR(255)
);
