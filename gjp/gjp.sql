/*
SQLyog Job Agent Version 8.2 Copyright(c) Webyog Softworks Pvt. Ltd. All Rights Reserved.


MySQL - 5.6.36-log : Database - gjp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gjp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gjp`;

/*Table structure for table `gjp_zhangwu` */

DROP TABLE IF EXISTS `gjp_zhangwu`;

CREATE TABLE `gjp_zhangwu` (
  `zwid` int(11) NOT NULL AUTO_INCREMENT,
  `flname` varchar(200) DEFAULT NULL,
  `money` double DEFAULT NULL,
  `zhanghu` varchar(100) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`zwid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `gjp_zhangwu` */

insert  into `gjp_zhangwu` values (1,'吃饭支出',247,'交通银行','2016-03-02','家庭聚餐'),(2,'工资收入',12345,'现金','2016-03-15','开工资了'),(3,'服装支出',1998,'现金','2016-04-02','买衣服'),(4,'吃饭支出',325,'现金','2016-06-18','朋友聚餐'),(5,'股票收入',8000,'工商银行','2016-10-28','股票大涨'),(6,'股票收入',5000,'工商银行','2016-10-28','股票又大涨'),(7,'工资收入',5000,'交通银行','2016-10-28','又开工资了'),(8,'礼金支出',5000,'现金','2016-10-28','朋友结婚'),(9,'其他支出',1560,'现金','2016-10-29','丢钱了'),(10,'交通支出',2300,'交通银行','2016-10-29','油价还在涨啊'),(11,'吃饭支出',1000,'工商银行','2016-10-29','又吃饭'),(12,'工资收入',1000,'现金','2016-10-30','开资'),(13,'交通支出',2000,'现金','2016-10-30','机票好贵'),(14,'工资收入',5000,'现金','2016-10-30','又开资');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(22) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1005 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user` values (1001,'tom','男'),(1002,'黄蓉','女'),(1003,'杨过','男'),(1004,'小龙女','女');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
