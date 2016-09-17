use survey;
drop table if exists page;

drop table if exists question;

drop table if exists survey;

drop table if exists user;

/*==============================================================*/
/* Table: page                                                  */
/*==============================================================*/
create table page
(
   id                   int not null auto_increment,
   title                varchar(30) not null,
   description          varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: question                                              */
/*==============================================================*/
create table question
(
   id                   int not null auto_increment,
   sid                  int,
   questionType         int not null,
   title                varchar(30) not null,
   options              varchar(50) not null,
   other                bool,
   otherStyle           int,
   otherSelectOptions   varchar(30),
   matrixRowTitles      varchar(30),
   matrixColTitles      varchar(30),
   matrixSelectOptions  varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: survey                                                */
/*==============================================================*/
create table survey
(
   id                   int not null auto_increment,
   pid                  int,
   uid                  int,
   title                varchar(30) not null,
   preText              varchar(20),
   nextText             varchar(20),
   exitText             varchar(10),
   doneText             varchar(10),
   createTime           timestamp default CURRENT_TIMESTAMP,
   primary key (id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment,
   name                 varchar(20) not null,
   login                varchar(20) not null,
   password             varchar(20) not null,
   pwConfirm            varchar(20) not null,
   email                varchar(20) not null,
   regDate              timestamp default CURRENT_TIMESTAMP,
   primary key (id)
);

INSERT INTO user (name,login,password,pwConfirm,email,regDate)VALUES ('张三','zhangsan','zhangsan','zhangsan','zhangsan@163.com',default);

SELECT * FROM user;
SELECT * FROM survey;
SELECT * FROM question;
SELECT * FROM page;