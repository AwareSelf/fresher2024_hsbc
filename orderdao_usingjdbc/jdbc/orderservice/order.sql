SELECT * FROM mydb1.student1;

create table myorder
(orderid int,ordername varchar(40),orderprice int);

-- disable safe update mode
SET SQL_SAFE_UPDATES=0;
delete from mydb1.myorder;
SET SQL_SAFE_UPDATES=1;
select * from mydb1.myorder;