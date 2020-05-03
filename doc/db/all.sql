drop table if exists `test`;
create table `courseyfsh`.`test`(
  `id` varchar(36) not null default '' comment 'id',
  `name` varchar(100) comment '名称',
  primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='测试';

insert into `test` (`id`,`name`) values ("3","测试2");
insert into `test` (`id`,`name`) values ("4","测试4");