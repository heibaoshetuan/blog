/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.0.67-community : Database - blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `blog`;

/*Table structure for table `blog_category_diary` */

DROP TABLE IF EXISTS `blog_category_diary`;

CREATE TABLE `blog_category_diary` (
  `CG_ID` int(11) unsigned NOT NULL auto_increment,
  `CG_NAME` varchar(100) collate utf8_unicode_ci NOT NULL,
  `CG_DESCRIPTION` varchar(200) collate utf8_unicode_ci default NULL,
  `CG_LEVEL` bigint(11) NOT NULL,
  `CG_CREATETIME` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `CG_UPDATETIME` timestamp NULL default '0000-00-00 00:00:00',
  `CG_UR_ID` int(11) NOT NULL,
  PRIMARY KEY  (`CG_ID`),
  KEY `FK_ID` (`CG_UR_ID`),
  CONSTRAINT `FK_ID` FOREIGN KEY (`CG_UR_ID`) REFERENCES `blog_user` (`UR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `blog_category_diary` */

/*Table structure for table `blog_comment` */

DROP TABLE IF EXISTS `blog_comment`;

CREATE TABLE `blog_comment` (
  `CM_ID` int(11) unsigned NOT NULL auto_increment COMMENT '评论内容ID',
  `CM_CONTNET` varchar(200) collate utf8_unicode_ci NOT NULL COMMENT '评论内容',
  `CM_CREATE_TIME` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '评论时间',
  `CM_DAILY_ID` int(11) NOT NULL COMMENT '评论日志ID',
  `CM_PID` int(11) default NULL COMMENT '评论日志父ID',
  `CM_UR_ID` int(11) NOT NULL COMMENT '评论用户ID',
  PRIMARY KEY  (`CM_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `blog_comment` */

/*Table structure for table `blog_diary` */

DROP TABLE IF EXISTS `blog_diary`;

CREATE TABLE `blog_diary` (
  `DR_ID` int(11) NOT NULL auto_increment,
  `DR_TITLE` varchar(100) collate utf8_unicode_ci NOT NULL,
  `DR_CONTENT` mediumtext collate utf8_unicode_ci NOT NULL,
  `DR_CREATE_TIME` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `DR_CG_ID` int(11) NOT NULL,
  `DR_UPDATE_TIME` timestamp NULL default '0000-00-00 00:00:00',
  `UR_ID` int(11) NOT NULL,
  `DR_TAG` varchar(200) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`DR_ID`),
  KEY `FK2_ID` (`UR_ID`),
  CONSTRAINT `FK2_ID` FOREIGN KEY (`UR_ID`) REFERENCES `blog_user` (`UR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `blog_diary` */

/*Table structure for table `blog_picture` */

DROP TABLE IF EXISTS `blog_picture`;

CREATE TABLE `blog_picture` (
  `PT_ID` int(11) unsigned NOT NULL auto_increment COMMENT '图片主键ID',
  `PT_URL` varchar(100) collate utf8_unicode_ci NOT NULL COMMENT '图片所在服务器地址',
  `PT_DESCRIPTION` varchar(200) collate utf8_unicode_ci default NULL COMMENT '图片描述',
  `PT_CREATE_TIME` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '图片创建时间',
  `PT_DAILY_ID` int(11) default NULL COMMENT '日志ID',
  PRIMARY KEY  (`PT_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `blog_picture` */

/*Table structure for table `blog_user` */

DROP TABLE IF EXISTS `blog_user`;

CREATE TABLE `blog_user` (
  `UR_ID` int(11) NOT NULL auto_increment,
  `UR_NAME` varchar(30) collate utf8_unicode_ci NOT NULL,
  `UR_PASSWORD` varchar(128) collate utf8_unicode_ci NOT NULL,
  `UR_PHONE` varchar(11) collate utf8_unicode_ci default NULL,
  `UR_TOKEN` varchar(128) collate utf8_unicode_ci default NULL,
  `UR_DESCRIPTION` varchar(200) collate utf8_unicode_ci default NULL,
  `UR_STATUS` int(11) default NULL,
  `UR_CREATE_TIME` datetime NOT NULL,
  `UR_UPDATE_TIME` datetime default NULL,
  PRIMARY KEY  (`UR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `blog_user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
