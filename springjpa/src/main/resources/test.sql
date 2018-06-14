/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.37 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `t_class` */

DROP TABLE IF EXISTS `t_class`;

CREATE TABLE `t_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_class` */

insert  into `t_class`(`id`,`class_name`) values (2,'J154'),(3,'J155'),(4,'J156');

/*Table structure for table `t_course` */

DROP TABLE IF EXISTS `t_course`;

CREATE TABLE `t_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `course_type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_course` */

insert  into `t_course`(`id`,`course_name`,`course_type`) values (1,'大保健',1),(2,'太极',1),(4,'毛概',1);

/*Table structure for table `t_customer` */

DROP TABLE IF EXISTS `t_customer`;

CREATE TABLE `t_customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `customer_telphone` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `gender` int(11) DEFAULT NULL COMMENT '0-女，1-男，-1不能不女',
  `customer_birthday` date DEFAULT NULL,
  `login_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=143 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_customer` */

insert  into `t_customer`(`id`,`customer_name`,`customer_telphone`,`gender`,`customer_birthday`,`login_name`,`version`) values (111,'dgsdgfsd',NULL,NULL,'2012-12-12','ertert',1),(113,'123123','13378676789',1,'2018-05-31','xiaoming',0),(114,'小明','13378676789',1,'2018-05-31','xiaoming',0),(115,'小明','13378676789',1,'2018-05-31','xiaoming',0),(116,'小明','13378676789',1,'2018-05-31','xiaoming',0),(117,'小明','13378676789',1,'2018-05-31','xiaoming',0),(118,'小明','13378676789',1,'2018-05-31','xiaoming',0),(119,'小明','13378676789',1,'2018-05-31','xiaoming',0),(120,'小明','13378676789',1,'2018-05-31','xiaoming',0),(121,'小明','13378676789',1,'2018-05-31','xiaoming',0),(122,'小明','13378676789',1,'2018-05-31','xiaoming',0),(123,'小明','13378676789',1,'2018-05-31','xiaoming',0),(124,'小明','13378676789',1,'2018-05-31','xiaoming',0),(125,'小明','13378676789',1,'2018-05-31','xiaoming',0),(126,'小明','13378676789',1,'2018-05-31','xiaoming',0),(127,'小明','13378676789',1,'2018-05-31','xiaoming',0),(128,'小明','13378676789',1,'2018-05-31','xiaoming',0),(129,'小明','13378676789',1,'2018-05-31','xiaoming',0),(130,'小明','13378676789',1,'2018-05-31','xiaoming',0),(131,'小明','13378676789',1,'2018-05-31','xiaoming',0),(132,'小明','13378676789',1,'2018-05-31','xiaoming',0),(133,'小明','13378676789',1,'2018-05-31','xiaoming',0),(134,'小明','13378676789',1,'2018-05-31','xiaoming',0),(135,'小明','13378676789',1,'2018-05-31','xiaoming',0),(136,'小明','13378676789',1,'2018-05-31','xiaoming',0),(137,'小明','13378676789',1,'2018-05-31','xiaoming',0),(138,'小明','13378676789',1,'2018-05-31','xiaoming',0),(139,'小明','13378676789',1,'2018-05-31','xiaoming',0),(140,'小明','13378676789',1,'2018-05-31','xiaoming',0),(141,'小明','13378676789',1,'2018-05-31','xiaoming',0),(142,'小明','13378676789',1,'2018-05-31','xiaoming',0);

/*Table structure for table `t_house` */

DROP TABLE IF EXISTS `t_house`;

CREATE TABLE `t_house` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `house_type` int(11) DEFAULT NULL COMMENT '0-公寓，1-住宅，2-别墅',
  `house_address` varchar(120) COLLATE utf8_bin DEFAULT NULL,
  `fk_person_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_house` */

insert  into `t_house`(`id`,`house_type`,`house_address`,`fk_person_id`) values ('402883856390ebfe016390ec36b30002',2,'夏威夷','402883856390ebfe016390ec36830000'),('402883856390ebfe016390ec36b30003',2,'澳门','402883856390ebfe016390ec36830000'),('402883856390ebfe016390ec36b30004',2,'香港九龙','402883856390ebfe016390ec36830000'),('4028ab6f638aed5901638aed5eee0002',2,'夏威夷','4028ab6f638aed5901638aed5eaf0000'),('4028ab6f638aed5901638aed5eee0003',2,'澳门','4028ab6f638aed5901638aed5eaf0000'),('4028ab6f638aed5901638aed5eee0004',2,'香港九龙','4028ab6f638aed5901638aed5eaf0000'),('4028ab6f63955815016395581be80002',2,'夏威夷','4028ab6f63955815016395581bb90000'),('4028ab6f63955815016395581be80003',2,'香港九龙','4028ab6f63955815016395581bb90000'),('4028ab6f63955815016395581be80004',2,'澳门','4028ab6f63955815016395581bb90000');

/*Table structure for table `t_husband` */

DROP TABLE IF EXISTS `t_husband`;

CREATE TABLE `t_husband` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `husband_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `husband_age` int(11) DEFAULT NULL,
  `fk_wife_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_husband` */

insert  into `t_husband`(`id`,`husband_name`,`husband_age`,`fk_wife_id`) values (1,'小月月',20,1),(2,'小月月',20,2),(3,'张奥条',20,3);

/*Table structure for table `t_person` */

DROP TABLE IF EXISTS `t_person`;

CREATE TABLE `t_person` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `person_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `gender` int(11) DEFAULT NULL COMMENT '0-女，1-男，-1代表未知',
  `login_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_persondtl_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_person` */

insert  into `t_person`(`id`,`person_name`,`gender`,`login_name`,`fk_persondtl_id`) values ('402883856390ebfe016390ec36830000','山鸡哥',1,'sj','402883856390ebfe016390ec36930001'),('4028ab6f638aed5901638aed5eaf0000','冠希哥',1,'cgx','4028ab6f638aed5901638aed5ebf0001'),('4028ab6f63955815016395581bb90000','浩南哥',1,'hn','4028ab6f63955815016395581bc90001');

/*Table structure for table `t_persondtl` */

DROP TABLE IF EXISTS `t_persondtl`;

CREATE TABLE `t_persondtl` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `person_idcard` varchar(18) COLLATE utf8_bin DEFAULT NULL,
  `person_job` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_persondtl` */

insert  into `t_persondtl`(`id`,`person_idcard`,`person_job`) values ('402883856390ebfe016390ec36930001','31134234234234233','伟大的社会人'),('4028ab6f638aed5901638aed5ebf0001','31134234234234234','伟大的摄影师'),('4028ab6f63955815016395581bc90001','31134234234234233','伟大的社会人');

/*Table structure for table `t_pet` */

DROP TABLE IF EXISTS `t_pet`;

CREATE TABLE `t_pet` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pet_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `pet_type` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `bone` int(11) DEFAULT NULL,
  `fish` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_pet` */

insert  into `t_pet`(`id`,`pet_name`,`pet_type`,`bone`,`fish`) values (1,'小月月','1',10,NULL),(2,'小鹏','0',NULL,10),(3,'小月月','1',10,NULL),(4,'小黄','1',10,NULL);

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_class_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_student` */

insert  into `t_student`(`id`,`student_name`,`fk_class_id`) values (3,'小鹏',2),(6,'小月月',3);

/*Table structure for table `t_student_course` */

DROP TABLE IF EXISTS `t_student_course`;

CREATE TABLE `t_student_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_student_id` bigint(20) DEFAULT NULL,
  `fk_course_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_student_course` */

insert  into `t_student_course`(`id`,`fk_student_id`,`fk_course_id`) values (1,3,2),(2,3,1),(3,3,3);

/*Table structure for table `t_wife` */

DROP TABLE IF EXISTS `t_wife`;

CREATE TABLE `t_wife` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `wife_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_wife` */

insert  into `t_wife`(`id`,`wife_name`) values (1,'如花'),(2,'如花'),(3,'如花');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
