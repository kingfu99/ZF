/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : house

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-08-21 09:24:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_house`
-- ----------------------------
DROP TABLE IF EXISTS `t_house`;
CREATE TABLE `t_house` (
  `h_id` int(11) NOT NULL AUTO_INCREMENT,
  `h_name` varchar(32) COLLATE utf8_bin NOT NULL,
  `h_rect` double(255,0) NOT NULL,
  `h_date` date NOT NULL,
  `h_loc1` varchar(32) COLLATE utf8_bin NOT NULL,
  `h_loc2` varchar(32) COLLATE utf8_bin NOT NULL,
  `h_img` varchar(255) COLLATE utf8_bin NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`h_id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_house
-- ----------------------------
INSERT INTO `t_house` VALUES ('31', '总统套房完美', '100', '2019-09-01', '1004', '1001', '双层套房.jpg', '30');
INSERT INTO `t_house` VALUES ('33', '总统套房345', '443', '2019-07-01', '1004', '1001', '温馨套房1.jpg', '1');
INSERT INTO `t_house` VALUES ('34', '简约套房', '80', '2019-07-01', '1004', '1001', '双层套房.jpg', '1');
INSERT INTO `t_house` VALUES ('35', '总统套房aaa', '1000', '2019-07-01', '1004', '1001', '欧式套房.jpg', '31');
INSERT INTO `t_house` VALUES ('36', '欧式套房', '120', '2019-07-01', '1004', '1001', '温馨套房.jpg', '1');
INSERT INTO `t_house` VALUES ('37', '11', '11', '2019-08-08', '1', '1', '1', '1');
INSERT INTO `t_house` VALUES ('38', '2', '2', '2019-08-12', '2', '2', '2', '2');
INSERT INTO `t_house` VALUES ('39', '3', '3', '2019-08-12', '3', '3', '3', '3');
INSERT INTO `t_house` VALUES ('40', '44', '4', '2019-08-12', '4', '4', '4', '4');
INSERT INTO `t_house` VALUES ('41', '5', '5', '2019-08-12', '5', '5', '55', '5');
INSERT INTO `t_house` VALUES ('42', '6', '6', '2019-08-12', '6', '6', '6', '6');
INSERT INTO `t_house` VALUES ('43', '1', '1', '2019-08-12', '1', '1', '1', '1');
INSERT INTO `t_house` VALUES ('44', '2', '2', '2019-08-12', '2', '2', '2', '2');
INSERT INTO `t_house` VALUES ('45', '2', '2', '2019-08-12', '2', '2', '22', '2');
INSERT INTO `t_house` VALUES ('46', '2', '2', '2019-08-12', '2', '2', '2', '2');
INSERT INTO `t_house` VALUES ('47', '33', '3', '2019-08-12', '3', '3', '3', '3');
INSERT INTO `t_house` VALUES ('48', '44', '4', '2019-08-12', '4', '4', '4', '4');
INSERT INTO `t_house` VALUES ('49', '3', '3', '2019-08-12', '33', '3', '3', '3');
INSERT INTO `t_house` VALUES ('50', '22', '2', '2019-08-12', '2', '2', '2', '2');
INSERT INTO `t_house` VALUES ('51', '22', '2', '2019-08-12', '2', '2', '2', '2');
INSERT INTO `t_house` VALUES ('52', '3', '3', '2019-08-12', '3', '3', '3', '3');
INSERT INTO `t_house` VALUES ('53', '666', '666', '2019-07-01', '1004', '1001', '简约套房.jpg', '1');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `user_pass` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `user_tel` int(32) DEFAULT NULL,
  `user_real_name` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'a', 'b', '3', 'c');
INSERT INTO `t_user` VALUES ('29', 'stardeaver', 'ying', '123456', 'stardeaver');
INSERT INTO `t_user` VALUES ('30', 'tourist', '123', '123', 'tourist');
INSERT INTO `t_user` VALUES ('31', 'aaaaaaa', 'aaa', '111', 'aaa');
INSERT INTO `t_user` VALUES ('32', '12345678', '123', '123', '123');
