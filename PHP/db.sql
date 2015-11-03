create database ms_350;
create table ms_350.student(student_id int (5) NOT NULL, name varchar(15), major varchar(3));
ALTER table ms_350.student add constraint primary key(student_id);

