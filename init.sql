CREATE TABLE student
(
    id        INT(10) PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(20),
    sex       CHAR(4),
    classInfo CHAR(10)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;