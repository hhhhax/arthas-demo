/*
Navicat MySQL Data Transfer

Source Server         : 本地测试环境
Source Server Version : 50639
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2020-05-07 10:08:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  `create_user` char(16) DEFAULT NULL COMMENT '创建用户',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user` char(16) DEFAULT NULL COMMENT '更新用户',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '89921218@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆', '1', null, null, null, null);
INSERT INTO `user` VALUES ('2', '2@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-2', '1', null, null, null, null);
INSERT INTO `user` VALUES ('3', '3@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-3', '1', null, null, null, null);
INSERT INTO `user` VALUES ('4', '4@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-4', '1', null, null, null, null);
INSERT INTO `user` VALUES ('5', '5@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-5', '1', null, null, null, null);
INSERT INTO `user` VALUES ('6', '6@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-6', '1', null, null, null, null);
INSERT INTO `user` VALUES ('7', '7@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-7', '1', null, null, null, null);
INSERT INTO `user` VALUES ('8', '8@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-8', '1', null, null, null, null);
INSERT INTO `user` VALUES ('9', '9@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-9', '1', null, null, null, null);
INSERT INTO `user` VALUES ('10', '10@qq.com', '1ee04e0b1cb5af7367c80c22e42efd8b', '土豆-10', '1', null, null, null, null);
INSERT INTO `user` VALUES ('100', '张三', '123456', '你好', '1', 'system', '2020-04-23 15:18:17', 'system', '2020-04-23 15:18:17');
INSERT INTO `user` VALUES ('101', 'baba', 'abc', '1234', '1', null, null, null, null);
