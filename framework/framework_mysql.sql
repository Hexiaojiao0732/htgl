-------------------------------  framework basic  ----------------------------------

--user
drop table framework_user;

create table framework_user
(  	
  id int(10)  not null auto_increment,
  name  varchar(128) not null,
  description  varchar(512),
  password  varchar(256) not null,
  is_active  int(1) not null,
  created_time  timestamp not null,
  updated_time  timestamp,
  constraint framework_user_pk primary key (id)
);

insert into framework_user(id,name,description,password,is_active,created_time) values(1,'system','system default','system',1,now());

--role
drop table framework_role;

create table framework_role
(  	
  id int(10)  not null auto_increment,
  name  varchar(128) not null,
  description  varchar(512),
  is_active  int(1) not null,
  created_time  timestamp not null,
  updated_time  timestamp,
  constraint framework_role_pk primary key (id)
);

insert into framework_role(id,name,description,is_active,created_time) values(1,'admin','admin',1,now());


--authority
drop table framework_authority;

create table framework_authority
(
  id int(10) not null auto_increment, 
  title varchar(255) not null,
  english_title varchar(255) not null,
  description  varchar(512),
  authority_type int(3) not null,--0 directory,1 web-page,2 hidden-page(not in menu-tree),3 javascript button
  parent_id int(10),
  root_id int(10) not null,
  sort_number int(8),--sort in tree
  url varchar(1024),--for java(filter:url filter)
  js_method varchar(1024),--for html(javascript button:hidden or show)  
  icon varchar(64),
  constraint framework_authority_pk primary key (id)	 
); 

--user role
drop table framework_user_role;

create table framework_user_role
(
  user_id int(10) not null,
  role_id int(10) not null,		  		  
  constraint fw_user_role_pk primary key (user_id,role_id),
  constraint fw_user_role_user_fk foreign key (user_id) references framework_user (id) on delete cascade,
  constraint fw_user_role_role_fk foreign key (role_id) references framework_role (id) on delete cascade
);

--role authority
drop table framework_role_authority;

create table framework_role_authority
(
  role_id int(10) not null,
  authority_id int(10) not null,
  constraint fw_role_auth_pk primary key (role_id,authority_id),
  constraint fw_role_auth_role_fk foreign key (role_id) references framework_role (id) on delete cascade,
  constraint fw_role_auth_auth_fk foreign key (authority_id) references framework_authority (id) on delete cascade
);
