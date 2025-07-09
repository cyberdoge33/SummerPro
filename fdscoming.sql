/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql8.0.33
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : localhost:3306
 Source Schema         : springboot08hr3

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 09/05/2024 10:47:16
*/

SET NAMES utf8;
USE fdscoming;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fangwuxinxi
-- ----------------------------
DROP TABLE IF EXISTS `fangwuxinxi`;
CREATE TABLE `fangwuxinxi`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `fangwumingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房屋名称',
  `fangwuleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房屋类型',
  `tupian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `zulinfangshi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租赁方式',
  `chaoxianglouceng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '朝向楼层',
  `mianji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '面积',
  `fangwuzhuangtai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房屋状态',
  `xiaoqu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小区',
  `xiangxidizhi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细地址',
  `yuezujiage` int(0) NULL DEFAULT NULL COMMENT '月租价格',
  `yajin` int(0) NULL DEFAULT NULL COMMENT '押金',
  `fangwusheshi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房屋设施',
  `fangwuxiangqing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '房屋详情',
  `faburiqi` DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布日期',
  `fangzhuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房主账号',
  `fangzhuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房主姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1614855484230 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '房屋信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fangwuxinxi
-- ----------------------------
INSERT INTO `fangwuxinxi` VALUES (41, '2021-03-04 18:46:53', '房屋名称1', '房屋类型1', 'http://localhost:8080/springboot08hr3/upload/fangwuxinxi_tupian1.jpg', '整租', '朝向楼层1', '面积1', '可租', '小区1', '详细地址1', 1, 1, '房屋设施1', '房屋详情1', '2021-03-04', '房主账号1', '房主姓名1');
INSERT INTO `fangwuxinxi` VALUES (42, '2021-03-04 18:46:53', '房屋名称2', '房屋类型2', 'http://localhost:8080/springboot08hr3/upload/1614855060611.jpg', '整租', '朝向楼层2', '面积2', '可租', '小区2', '详细地址2', 2, 2, '房屋设施2', '<p>房屋详情2</p>', '2021-03-04', '房主账号2', '房主姓名2');
INSERT INTO `fangwuxinxi` VALUES (43, '2021-03-04 18:46:53', '房屋名称3', '房屋类型3', 'http://localhost:8080/springboot08hr3/upload/fangwuxinxi_tupian3.jpg', '整租', '朝向楼层3', '面积3', '可租', '小区3', '详细地址3', 3, 3, '房屋设施3', '房屋详情3', '2021-03-04', '房主账号3', '房主姓名3');
INSERT INTO `fangwuxinxi` VALUES (44, '2021-03-04 18:46:53', '房屋名称4', '房屋类型4', 'http://localhost:8080/springboot08hr3/upload/1614855071690.jpg', '整租', '朝向楼层4', '面积4', '可租', '小区4', '详细地址4', 4, 4, '房屋设施4', '<p>房屋详情4</p>', '2021-03-04', '房主账号4', '房主姓名4');
INSERT INTO `fangwuxinxi` VALUES (45, '2021-03-04 18:46:53', '房屋名称5', '房屋类型5', 'http://localhost:8080/springboot08hr3/upload/fangwuxinxi_tupian5.jpg', '整租', '朝向楼层5', '面积5', '可租', '小区5', '详细地址5', 5, 5, '房屋设施5', '房屋详情5', '2021-03-04', '房主账号5', '房主姓名5');
INSERT INTO `fangwuxinxi` VALUES (46, '2021-03-04 18:46:53', '房屋名称6', '房屋类型6', 'http://localhost:8080/springboot08hr3/upload/1614855082369.jpg', '整租', '朝向楼层6', '面积6', '可租', '小区6', '详细地址6', 6, 6, '房屋设施6', '<p>房屋详情6</p>', '2021-03-04', '房主账号6', '房主姓名6');
INSERT INTO `fangwuxinxi` VALUES (1614855484229, '2021-03-04 18:58:03', '新记家园605房', '3房1厅', 'http://localhost:8080/springboot08hr3/upload/1614855416340.jpg', '整租', '南北 共8层', '90平', '可租', '新记家园', '太阳宫中路', 2000, 2000, '设施齐全', '<p>设施齐全，采光极好</p><p><img src=\"http://localhost:8080/springboot08hr3/upload/1614855482288.jpg\"></p>', '2021-03-04', '1', '张明');

-- ----------------------------
-- Table structure for fangzhu
-- ----------------------------
DROP TABLE IF EXISTS `fangzhu`;
CREATE TABLE `fangzhu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `fangzhuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房主账号',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `fangzhuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房主姓名',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `shouji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `fangzhuzhanghao`(`fangzhuzhanghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1614855337501 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '房主' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fangzhu
-- ----------------------------
INSERT INTO `fangzhu` VALUES (21, '2021-03-04 18:46:53', '房主账号1', '123456', '房主姓名1', '男', 'http://localhost:8080/springboot08hr3/upload/fangzhu_touxiang1.jpg', '13823888881', '440300199101010001');
INSERT INTO `fangzhu` VALUES (22, '2021-03-04 18:46:53', '房主账号2', '123456', '房主姓名2', '男', 'http://localhost:8080/springboot08hr3/upload/fangzhu_touxiang2.jpg', '13823888882', '440300199202020002');
INSERT INTO `fangzhu` VALUES (23, '2021-03-04 18:46:53', '房主账号3', '123456', '房主姓名3', '男', 'http://localhost:8080/springboot08hr3/upload/fangzhu_touxiang3.jpg', '13823888883', '440300199303030003');
INSERT INTO `fangzhu` VALUES (24, '2021-03-04 18:46:53', '房主账号4', '123456', '房主姓名4', '男', 'http://localhost:8080/springboot08hr3/upload/fangzhu_touxiang4.jpg', '13823888884', '440300199404040004');
INSERT INTO `fangzhu` VALUES (25, '2021-03-04 18:46:53', '房主账号5', '123456', '房主姓名5', '男', 'http://localhost:8080/springboot08hr3/upload/fangzhu_touxiang5.jpg', '13823888885', '440300199505050005');
INSERT INTO `fangzhu` VALUES (26, '2021-03-04 18:46:53', '房主账号6', '123456', '房主姓名6', '男', 'http://localhost:8080/springboot08hr3/upload/fangzhu_touxiang6.jpg', '13823888886', '440300199606060006');
INSERT INTO `fangzhu` VALUES (1614855337500, '2021-03-04 18:55:37', '房主账号7', '123456', '张明', '男', 'http://localhost:8080/springboot08hr3/upload/1614855356133.jpg', '12312312312', '123456789789456123');


-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'abo', 'abo', '管理员', '2021-03-04 18:46:53');

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `xingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `touxiang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `zhiye` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职业',
  `lianxidianhua` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `shenfenzheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yonghuming`(`yonghuming`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1614855579739 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (11, '2021-03-04 18:46:53', '用户名1', '123456', '姓名1', 'http://localhost:8080/springboot08hr3/upload/yonghu_touxiang1.jpg', '男', '职业1', '13823888881', '440300199101010001');
INSERT INTO `yonghu` VALUES (12, '2021-03-04 18:46:53', '用户名2', '123456', '姓名2', 'http://localhost:8080/springboot08hr3/upload/yonghu_touxiang2.jpg', '男', '职业2', '13823888882', '440300199202020002');
INSERT INTO `yonghu` VALUES (13, '2021-03-04 18:46:53', '用户名3', '123456', '姓名3', 'http://localhost:8080/springboot08hr3/upload/yonghu_touxiang3.jpg', '男', '职业3', '13823888883', '440300199303030003');
INSERT INTO `yonghu` VALUES (14, '2021-03-04 18:46:53', '用户名4', '123456', '姓名4', 'http://localhost:8080/springboot08hr3/upload/yonghu_touxiang4.jpg', '男', '职业4', '13823888884', '440300199404040004');
INSERT INTO `yonghu` VALUES (15, '2021-03-04 18:46:53', '用户名5', '123456', '姓名5', 'http://localhost:8080/springboot08hr3/upload/yonghu_touxiang5.jpg', '男', '职业5', '13823888885', '440300199505050005');
INSERT INTO `yonghu` VALUES (16, '2021-03-04 18:46:53', '用户名6', '123456', '姓名6', 'http://localhost:8080/springboot08hr3/upload/yonghu_touxiang6.jpg', '男', '职业6', '13823888886', '440300199606060006');
INSERT INTO `yonghu` VALUES (1614855579738, '2021-03-04 18:59:39', '2', '2', '陈一', 'http://localhost:8080/springboot08hr3/upload/1614855594396.jpg', '女', 'IT', '12312312312', '123456789789456123');

-- ----------------------------
-- Table structure for yuyuekanfang
-- ----------------------------
DROP TABLE IF EXISTS `yuyuekanfang`;
CREATE TABLE `yuyuekanfang`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yuyuebianhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '预约编号',
  `fangwumingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房屋名称',
  `fangwuleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房屋类型',
  `fangwuzhuangtai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房屋状态',
  `xiaoqu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小区',
  `yuezujiage` int(0) NULL DEFAULT NULL COMMENT '月租价格',
  `yajin` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '押金',
  `zuyongyueshu` int(0) NULL DEFAULT NULL COMMENT '租用月数',
  `zuyongjine` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '租用金额',
  `yuyueshijian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预约时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `shenfenzheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  `lianxidianhua` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `fangzhuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房主账号',
  `fangzhuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '房主姓名',
  `sfsh` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '审核回复',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yuyuebianhao`(`yuyuebianhao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1614855637717 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '预约看房' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yuyuekanfang
-- ----------------------------
INSERT INTO `yuyuekanfang` VALUES (51, '2021-03-04 18:46:53', '预约编号1', '房屋名称1', '房屋类型1', '房屋状态1', '小区1', 1, '押金1', 1, '租用金额1', '2021-03-04 18:46:53', '用户名1', '姓名1', '身份证1', '联系电话1', '房主账号1', '房主姓名1', '是', '');
INSERT INTO `yuyuekanfang` VALUES (52, '2021-03-04 18:46:53', '预约编号2', '房屋名称2', '房屋类型2', '房屋状态2', '小区2', 2, '押金2', 2, '租用金额2', '2021-03-04 18:46:53', '用户名2', '姓名2', '身份证2', '联系电话2', '房主账号2', '房主姓名2', '是', '');
INSERT INTO `yuyuekanfang` VALUES (53, '2021-03-04 18:46:53', '预约编号3', '房屋名称3', '房屋类型3', '房屋状态3', '小区3', 3, '押金3', 3, '租用金额3', '2021-03-04 18:46:53', '用户名3', '姓名3', '身份证3', '联系电话3', '房主账号3', '房主姓名3', '是', '');
INSERT INTO `yuyuekanfang` VALUES (54, '2021-03-04 18:46:53', '预约编号4', '房屋名称4', '房屋类型4', '房屋状态4', '小区4', 4, '押金4', 4, '租用金额4', '2021-03-04 18:46:53', '用户名4', '姓名4', '身份证4', '联系电话4', '房主账号4', '房主姓名4', '是', '');
INSERT INTO `yuyuekanfang` VALUES (55, '2021-03-04 18:46:53', '预约编号5', '房屋名称5', '房屋类型5', '房屋状态5', '小区5', 5, '押金5', 5, '租用金额5', '2021-03-04 18:46:53', '用户名5', '姓名5', '身份证5', '联系电话5', '房主账号5', '房主姓名5', '是', '');
INSERT INTO `yuyuekanfang` VALUES (56, '2021-03-04 18:46:53', '预约编号6', '房屋名称6', '房屋类型6', '房屋状态6', '小区6', 6, '押金6', 6, '租用金额6', '2021-03-04 18:46:53', '用户名6', '姓名6', '身份证6', '联系电话6', '房主账号6', '房主姓名6', '是', '');
INSERT INTO `yuyuekanfang` VALUES (1614855637716, '2021-03-04 19:00:37', '2021341902829609414', '新记家园605房', '3房1厅', '可租', '新记家园', 2000, '2000', 12, '24000', '2021-03-04 19:00:35', '2', '陈一', '123456789789456123', '12312312312', '1', '张明', '是', '可以');

SET FOREIGN_KEY_CHECKS = 1;
