CREATE TABLE book_info
(
 num NUMBER PRIMARY KEY,
 title VARCHAR2(100),
 author VARCHAR2(100),
 publisher VARCHAR2(100),
 regdate DATE
);

CREATE SEQUENCE book_info_seq;

