/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : bl

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-03-06 16:58:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_bl
-- ----------------------------
DROP TABLE IF EXISTS `t_bl`;
CREATE TABLE `t_bl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_bl
-- ----------------------------
INSERT INTO `t_bl` VALUES ('1', '2');
INSERT INTO `t_bl` VALUES ('2', '2');
INSERT INTO `t_bl` VALUES ('3', '3');
INSERT INTO `t_bl` VALUES ('4', '3');
INSERT INTO `t_bl` VALUES ('5', '4');
