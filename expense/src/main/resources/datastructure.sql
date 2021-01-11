CREATE TABLE expensedetails (
  id int unsigned NOT NULL AUTO_INCREMENT,
  head varchar(255) NOT NULL,
  details varchar(255) NOT NULL,
  name varchar(20) NOT NULL,
  amount double NOT NULL,
  status varchar(20) NOT NULL,
  user varchar(100) NOT NULL,
  date date NOT NULL,
  PRIMARY KEY (id)
);

select * from expensedetails;