use prueba;

create table if not exists author(
    id int auto_increment primary key,
    namee varchar(50) not null,
    last_name varchar(50) not null
);

insert into author values (1,"Paulo","Cohelo");

create table if not exists book(
    id int auto_increment primary key,
    title varchar(100) not null,
    descrip varchar(200),
    price int not null,
    authorId int,
    yearPub int,
    foreign key (authorId) references author(id),
    constraint check_title check(lenght(title) > 5),
    constraint check_price check(price >= 10000),
    constraint check_year check(yearPub >= 1000)
);

insert into book values(1,"El alquimista","No description",10000,1,1988);