/*
MySQL Backup
Database: test
Backup Time: 2023-01-15 15:52:33
*/

SET
FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `test`.`info`;
DROP TABLE IF EXISTS `test`.`user`;
CREATE TABLE `info`
(
    `id`    int(11) NOT NULL AUTO_INCREMENT,
    `title` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `user`
(
    `id`       int(3) NOT NULL AUTO_INCREMENT,
    `name`     varchar(20) NOT NULL,
    `password` varchar(20) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
BEGIN;
LOCK
TABLES `test`.`info` WRITE;
DELETE
FROM `test`.`info`;
INSERT INTO `test`.`info` (`id`, `title`)
VALUES (1, '你瞅啥'),
       (2, '瞅你咋地');
UNLOCK
TABLES;
COMMIT;
BEGIN;
LOCK
TABLES `test`.`user` WRITE;
DELETE
FROM `test`.`user`;
INSERT INTO `test`.`user` (`id`, `name`, `password`)
VALUES (1, 'zhangsan', '123456'),
       (2, 'lisi', '123456'),
       (3, 'wangwu', '123456');
UNLOCK
TABLES;
COMMIT;
