drop table if exists coffees;
create table coffees(
    id int primary key auto_increment,
    description varchar(100) not null,
    done bit
)