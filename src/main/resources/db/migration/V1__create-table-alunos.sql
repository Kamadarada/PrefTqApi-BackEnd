create table alunos(

    id bigint not null auto_increment,
    nome varchar(15) not null,
    datanascimento varchar(10) not null ,
    portador varchar(15) not null ,
    rua varchar(20) not null ,
    bairro varchar (15) not null,
    cidade varchar(10) not null ,
    numero varchar(4),

    primary key (id)

);

