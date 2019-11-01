/*
Navicat MySQL Data Transfer

Source Server         : dev
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-11-01 19:49:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dictionaries
-- ----------------------------
DROP TABLE IF EXISTS `dictionaries`;
CREATE TABLE `dictionaries` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionaries
-- ----------------------------
INSERT INTO `dictionaries` VALUES ('1', 'cn', 'English', null, null, '1', null, null, null, null);
INSERT INTO `dictionaries` VALUES ('2', 'jp', '日本語', null, null, '2', null, null, null, null);
INSERT INTO `dictionaries` VALUES ('3', 'ru', 'русский', null, null, '3', null, null, null, null);
INSERT INTO `dictionaries` VALUES ('4', 'spa', 'Español', null, null, '4', null, null, null, null);
INSERT INTO `dictionaries` VALUES ('5', 'zh', '简体中文', null, null, '5', null, null, null, null);
INSERT INTO `dictionaries` VALUES ('6', 'cht', '繁體中文', null, null, '6', null, null, null, null);
INSERT INTO `dictionaries` VALUES ('7', 'kor', '한국어', null, null, '7', null, null, null, null);
INSERT INTO `dictionaries` VALUES ('8', 'de', 'Deutsch', null, null, '8', null, null, null, null);

-- ----------------------------
-- Table structure for multilingual
-- ----------------------------
DROP TABLE IF EXISTS `multilingual`;
CREATE TABLE `multilingual` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `language_code` varchar(255) DEFAULT NULL,
  `language_key` varchar(255) DEFAULT NULL,
  `language_text` longtext,
  `sort` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of multilingual
-- ----------------------------
INSERT INTO `multilingual` VALUES ('1', 'zh', 'com.yxf.language', '简体中文', '5', null, '2019-11-01 17:24:05', null, null, null);
INSERT INTO `multilingual` VALUES ('2', 'cn', 'com.yxf.language', 'English', '1', null, null, null, null, null);
INSERT INTO `multilingual` VALUES ('3', 'jp', 'com.yxf.language', '日本語', '2', null, null, null, null, null);
INSERT INTO `multilingual` VALUES ('4', 'kor', 'com.yxf.language', '한국어', '7', null, null, null, null, null);
INSERT INTO `multilingual` VALUES ('5', 'de', 'com.yxf.language', 'Deutsch', '8', null, null, null, null, null);
INSERT INTO `multilingual` VALUES ('6', 'spa', 'com.yxf.language', 'Español', '4', null, null, null, null, null);
INSERT INTO `multilingual` VALUES ('7', 'ru', 'com.yxf.language', 'русский', '3', null, null, null, null, null);
INSERT INTO `multilingual` VALUES ('8', 'cht', 'com.yxf.language', '繁體中文', '6', null, null, null, null, null);

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permissions_name` varchar(255) NOT NULL,
  `permissions_url` varchar(1024) DEFAULT NULL,
  `state` char(16) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permissions
-- ----------------------------

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) NOT NULL,
  `state` char(16) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(64) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('1', '普通会员', '1', '2019-11-01 14:12:10', null, null, null);
INSERT INTO `roles` VALUES ('2', 'VIP会员', '1', '2019-11-01 14:15:46', null, null, null);
INSERT INTO `roles` VALUES ('3', '高级会员', '1', '2019-11-01 14:16:04', null, null, null);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `id_card` varchar(255) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `tel` varchar(64) DEFAULT NULL,
  `postal_code` varchar(32) DEFAULT NULL,
  `state` char(16) DEFAULT NULL,
  `crate_time` datetime DEFAULT NULL,
  `crate_by` varchar(64) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_by` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'andy', 'bady', '123456', '210104197802020321', '13611226531', '0755-83002252', '518000', '1', '2019-11-01 14:18:05', null, null, null);
