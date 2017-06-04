use safira;
drop table usuario;


create table usuario(idUsuario int (15) primary key auto_increment, 
					login varchar(25) not null unique,
                    nome varchar(50) not null,
					senha varchar(100) not null,
					perfil enum('ROLE_ADM', 'ROLE_USU'),
					ativo boolean)Engine=innodb;

insert into usuario values(null,'Administrador', 'admin', md5('123'),'ROLE_ADM',true);
