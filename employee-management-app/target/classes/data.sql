insert into employee(first_name, last_name, email) values('vishwa', 'R', 'vishwa@gmail.com');
insert into employee(first_name, last_name, email) values('kirthick', 'raj', 'kirthick@gmail.com');
insert into employee(first_name, last_name, email) values('udhaya', 'P', 'udy@gmail.com');
insert into employee(first_name, last_name, email) values('dharshana', 'A S', 'dharsana@gmail.com');
insert into employee(first_name, last_name, email) values('kamali', 'R', 'kamali@gmail.com');
insert into employee(first_name, last_name, email) values('mohan', 'T', 'mohan@gmail.com');

-- Here, add only one user, name -> ADMIN, password -> ADMIN
insert into user(username, password) values('ADMIN', '$2a$12$mhGDV3seTtAImoU6EyLB3eu8AfnZ5cyIBt3hvHBJBltzlcwLLu7gC');

-- insert into user(username, password) values('USER', '$2a$12$KBDqxW/hGFWk7BnsVHIUN.RGLSfLExCww7kpId.nypZWeKU/X2H2m');
-- insert into users(username, password) values('vihswa', '$2a$12$xEo5ZJMvi8yNJvq2u9ZiK.lTAjbDPN.REPdjnJ5A.9/3cgxOPlIfG');

-- Here, add only one role -> 'ADMIN'
insert into role(name) values('ADMIN');

-- insert into role(name) values('USER');
-- insert into role(name) values('ADMIN');

insert into user_role values(1, 1);

-- insert into user_role values(2, 2);
--insert into user_roles values(3, 1);