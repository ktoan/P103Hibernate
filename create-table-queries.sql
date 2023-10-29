create table admin (
	Username varchar(255),
	Password text,
	primary key (Username)
)

create table personal (
	Id int identity(1,1),
	FirstName varchar(255),
	LastName varchar(255),
	Mobile varchar(255),
	Gender varchar(255),
	Area varchar(255),
	Email varchar(255),
	Hobbies varchar(255),
	Description text,
	primary key (Id)
)

create table department (
	Id int identity(1,1),
	Name varchar(255),
	Description text,
	primary key (Id)
)

create table dept_personal (
	Personal_Id int,
	Department_Id int,
	foreign key (Personal_Id) references personal(Id),
	foreign key (Department_Id) references department(Id),
) 