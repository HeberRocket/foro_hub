alter table topicos add activo tinyint not null;
update topicos set activo = 1;