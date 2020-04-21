/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : jinxiaocun

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-04-20 00:57:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_boom`
-- ----------------------------
DROP TABLE IF EXISTS `t_boom`;
CREATE TABLE `t_boom` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentcode` varchar(255) DEFAULT NULL COMMENT '父项物料编号',
  `childcode` varchar(255) DEFAULT NULL COMMENT '子项物料名称',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `unitname` varchar(255) DEFAULT NULL COMMENT '单位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='包装清单';

-- ----------------------------
-- Records of t_boom
-- ----------------------------
INSERT INTO `t_boom` VALUES ('1', 'I5001', 'I5CPU   ', '1', '个');
INSERT INTO `t_boom` VALUES ('2', 'I5001', '显示器', '1', '个');
INSERT INTO `t_boom` VALUES ('3', 'I5001', '主板', '1', '个');
INSERT INTO `t_boom` VALUES ('4', 'I5001', '机箱', '1', '个');
INSERT INTO `t_boom` VALUES ('5', 'I5001', '键盘', '1', '个');
INSERT INTO `t_boom` VALUES ('6', 'I5001', '鼠标', '1', '个');
INSERT INTO `t_boom` VALUES ('7', 'I5001', '螺钉', '5', '个');
INSERT INTO `t_boom` VALUES ('8', 'I5001', '锣鉧', '5', '个');
INSERT INTO `t_boom` VALUES ('9', 'I5001004', '螺钉', '5', '个');
INSERT INTO `t_boom` VALUES ('10', 'I5001004', '锣鉧', '5', '个');
INSERT INTO `t_boom` VALUES ('11', 'I5001004', '铁板', '4', '个');
INSERT INTO `t_boom` VALUES ('12', 'I7001', 'I7CPU   ', '1', '个');
INSERT INTO `t_boom` VALUES ('13', 'I7001', '显示器', '1', '个');
INSERT INTO `t_boom` VALUES ('14', 'I7001', '主板', '1', '个');
INSERT INTO `t_boom` VALUES ('15', 'I7001', '机箱', '1', '个');
INSERT INTO `t_boom` VALUES ('16', 'I7001', '键盘', '1', '个');
INSERT INTO `t_boom` VALUES ('17', 'I7001', '鼠标', '1', '个');
INSERT INTO `t_boom` VALUES ('18', 'I7001', '螺钉', '5', '个');
INSERT INTO `t_boom` VALUES ('19', 'I7001', '锣鉧', '5', '个');
INSERT INTO `t_boom` VALUES ('20', 'I7001004', '螺钉', '5', '个');
INSERT INTO `t_boom` VALUES ('21', 'I7001004', '锣鉧', '5', '个');
INSERT INTO `t_boom` VALUES ('22', 'I7001004', '铁板', '4', '个');

-- ----------------------------
-- Table structure for `t_buy`
-- ----------------------------
DROP TABLE IF EXISTS `t_buy`;
CREATE TABLE `t_buy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tool_id` int(11) NOT NULL COMMENT '物料id',
  `status` int(11) NOT NULL COMMENT '状态入库/未入库',
  `buy_num` int(11) NOT NULL COMMENT '采购数量',
  `is_add` int(11) DEFAULT NULL COMMENT '是否增加物料库存',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='采购表';

-- ----------------------------
-- Records of t_buy
-- ----------------------------
INSERT INTO `t_buy` VALUES ('1', '1', '1', '20', null);
INSERT INTO `t_buy` VALUES ('2', '0', '1', '0', null);
INSERT INTO `t_buy` VALUES ('3', '4', '1', '20', null);
INSERT INTO `t_buy` VALUES ('5', '2', '1', '0', null);
INSERT INTO `t_buy` VALUES ('6', '2', '1', '0', null);
INSERT INTO `t_buy` VALUES ('7', '3', '1', '20', null);
INSERT INTO `t_buy` VALUES ('8', '2', '1', '20', null);
INSERT INTO `t_buy` VALUES ('12', '1', '1', '11', null);
INSERT INTO `t_buy` VALUES ('13', '2', '1', '11', null);
INSERT INTO `t_buy` VALUES ('14', '6', '1', '11', null);
INSERT INTO `t_buy` VALUES ('15', '6', '1', '11', null);
INSERT INTO `t_buy` VALUES ('16', '10', '1', '52', null);
INSERT INTO `t_buy` VALUES ('17', '10', '1', '100', null);
INSERT INTO `t_buy` VALUES ('18', '5', '1', '111', null);
INSERT INTO `t_buy` VALUES ('19', '3', '1', '111', null);
INSERT INTO `t_buy` VALUES ('20', '2', '1', '11', null);
INSERT INTO `t_buy` VALUES ('21', '7', '1', '111', null);
INSERT INTO `t_buy` VALUES ('22', '2', '1', '11', null);
INSERT INTO `t_buy` VALUES ('23', '2', '1', '11', null);
INSERT INTO `t_buy` VALUES ('24', '2', '1', '11', null);
INSERT INTO `t_buy` VALUES ('26', '1', '1', '11', null);
INSERT INTO `t_buy` VALUES ('27', '1', '1', '111', null);

-- ----------------------------
-- Table structure for `t_num`
-- ----------------------------
DROP TABLE IF EXISTS `t_num`;
CREATE TABLE `t_num` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tool_id` int(11) DEFAULT NULL COMMENT '物料id',
  `number` int(11) DEFAULT NULL COMMENT '库存数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='库存表';

-- ----------------------------
-- Records of t_num
-- ----------------------------
INSERT INTO `t_num` VALUES ('1', '1', '172');
INSERT INTO `t_num` VALUES ('2', '2', '94');
INSERT INTO `t_num` VALUES ('3', '3', '50');
INSERT INTO `t_num` VALUES ('4', '4', '50');
INSERT INTO `t_num` VALUES ('5', '5', '50');
INSERT INTO `t_num` VALUES ('6', '6', '61');
INSERT INTO `t_num` VALUES ('7', '7', '161');
INSERT INTO `t_num` VALUES ('8', '8', '50');
INSERT INTO `t_num` VALUES ('9', '9', '50');
INSERT INTO `t_num` VALUES ('10', '10', '102');
INSERT INTO `t_num` VALUES ('11', '11', '50');
INSERT INTO `t_num` VALUES ('12', '12', '389');
INSERT INTO `t_num` VALUES ('13', '13', '176');

-- ----------------------------
-- Table structure for `t_profit`
-- ----------------------------
DROP TABLE IF EXISTS `t_profit`;
CREATE TABLE `t_profit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tool_id` int(11) DEFAULT NULL COMMENT '物料id',
  `sale_id` int(11) DEFAULT NULL,
  `profit` int(11) DEFAULT NULL COMMENT '利润',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_profit
-- ----------------------------
INSERT INTO `t_profit` VALUES ('3', '12', '18', '2450');

-- ----------------------------
-- Table structure for `t_sale`
-- ----------------------------
DROP TABLE IF EXISTS `t_sale`;
CREATE TABLE `t_sale` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tool_id` int(11) NOT NULL COMMENT '物料id',
  `status` int(11) NOT NULL COMMENT '状态（未出库0/出库1）',
  `sale_num` int(11) NOT NULL COMMENT '销售数量',
  `sale_price` int(11) NOT NULL COMMENT '销售单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='销售表';

-- ----------------------------
-- Records of t_sale
-- ----------------------------
INSERT INTO `t_sale` VALUES ('1', '1', '0', '20', '5000');
INSERT INTO `t_sale` VALUES ('2', '12', '1', '20', '5000');
INSERT INTO `t_sale` VALUES ('3', '2', '0', '2', '20');
INSERT INTO `t_sale` VALUES ('5', '12', '1', '11', '11');
INSERT INTO `t_sale` VALUES ('6', '12', '1', '11', '11');
INSERT INTO `t_sale` VALUES ('7', '13', '1', '111', '1111');
INSERT INTO `t_sale` VALUES ('8', '12', '1', '11', '1111');
INSERT INTO `t_sale` VALUES ('9', '13', '1', '11', '111');
INSERT INTO `t_sale` VALUES ('10', '13', '1', '11', '1111');
INSERT INTO `t_sale` VALUES ('11', '13', '1', '11', '11');
INSERT INTO `t_sale` VALUES ('12', '13', '1', '11', '11');
INSERT INTO `t_sale` VALUES ('13', '13', '1', '1', '5000');
INSERT INTO `t_sale` VALUES ('16', '13', '1', '11', '5000');
INSERT INTO `t_sale` VALUES ('17', '13', '1', '1', '11');
INSERT INTO `t_sale` VALUES ('18', '12', '1', '1', '5000');

-- ----------------------------
-- Table structure for `t_tool`
-- ----------------------------
DROP TABLE IF EXISTS `t_tool`;
CREATE TABLE `t_tool` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL COMMENT '编号',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `unitbase` varchar(255) DEFAULT NULL COMMENT '最小单位',
  `unitprice` int(11) DEFAULT NULL COMMENT '单价',
  `itemtype` varchar(255) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='物料信息表';

-- ----------------------------
-- Records of t_tool
-- ----------------------------
INSERT INTO `t_tool` VALUES ('1', 'I5001001', 'I5CPU   ', '个', '500', '外购件');
INSERT INTO `t_tool` VALUES ('2', 'I5001002', '显示器', '个', '800', '外购件');
INSERT INTO `t_tool` VALUES ('3', 'I5001003', '主板', '个', '500', '外购件');
INSERT INTO `t_tool` VALUES ('4', 'I5001004', 'I5主机箱', '个', '400', '自制件');
INSERT INTO `t_tool` VALUES ('5', 'I5001005', '键盘', '个', '100', '外购件');
INSERT INTO `t_tool` VALUES ('6', 'I5001006', '鼠标', '个', '50', '外购件');
INSERT INTO `t_tool` VALUES ('7', 'I5001007', '螺钉', '个', '20', '外购件');
INSERT INTO `t_tool` VALUES ('8', 'I5001008', '锣鉧', '个', '20', '外购件');
INSERT INTO `t_tool` VALUES ('9', 'I5001004003', '铁板', '个', '50', '外购件');
INSERT INTO `t_tool` VALUES ('10', 'I7001001', 'I7CPU   ', '个', '1000', '外购件');
INSERT INTO `t_tool` VALUES ('11', 'I7001004', 'I7主机箱', '个', '400', '自制件');
INSERT INTO `t_tool` VALUES ('12', 'I5001', 'I5 电脑', '个', '2550', '自制件');
INSERT INTO `t_tool` VALUES ('13', 'I7001', 'I7 电脑', '个', '3550', '自制件');
