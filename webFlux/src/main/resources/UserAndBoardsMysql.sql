create table users
(
    id                  BIGINT AUTO_INCREMENT NOT NULL,
    name                VARCHAR(50) NOT NULL,
    age                 INT         NOT NULL,
    profile_picture_url VARCHAR(200) NULL,
    updated_at          datetime    NOT NULL,
    created_at          datetime    NOT NULL,
    PRIMARY KEY (id)
);

insert into users (name, age, profile_picture_url, updated_at, created_at)
values ('user1', 10, null, now(), now());
insert into users (name, age, profile_picture_url, updated_at, created_at)
values ('user2', 20, null, now(), now());
insert into users (name, age, profile_picture_url, updated_at, created_at)
values ('user3', 30, null, now(), now());

create table boards
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    title      VARCHAR(500)  NOT NULL,
    content    VARCHAR(4000) NOT NULL,
    updated_at datetime      NOT NULL,
    created_at datetime      NOT NULL,
    PRIMARY KEY (id)
);

insert into boards (title, content, updated_at, created_at)
values ('Title 1', 'Content1', now(), now());
insert into boards (title, content, updated_at, created_at)
values ('Title 2', 'Content2', now(), now());
insert into boards (title, content, updated_at, created_at)
values ('Title 3', 'Content3', now(), now());