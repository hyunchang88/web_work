CREATE TABLE board_guest
(num NUMBER PRIMARY KEY,
writer VARCHAR2(50),
title VARCHAR2(100),
content CLOB,
regdate DATE);

CREATE SEQUENCE board_guest_seq;

CREATE TABLE users
(id VARCHAR2(100) PRIMARY KEY,
pwd VARCHAR2(100) NOT NULL,
email VARCHAR2(100),
regdate DATE);

CREATE SEQUENCE users_seq;

