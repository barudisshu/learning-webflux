create table if not exists directors
(
  id   int         not null auto_increment primary key,
  name varchar(30) not null
);

create table if not exists movies
(
  id          int         not null auto_increment primary key,
  name        varchar(30) not null,
  description varchar(255),
  published   boolean,
  director_id int         not null,
  foreign key (director_id) references directors (id)
);

insert into directors
values (1, '张三'),
       (2, '李四'),
       (3, '王二'),
       (4, '麻子');

insert into movies
values (1, '碟中谍1', '', true, 1);
insert into movies
values (2, '碟中谍2', '', true, 1);
insert into movies
values (3, '碟中谍3', '', true, 1);
insert into movies
values (4, '碟中谍4', '', false, 1);


