# empty_ssm
my first repostiory

项目介绍：这是我已经配置好了的SSM+JSP架构的Java Web项目，非常适合新手程序员进行二次开发，每一个文件里都有大量的注释。


我写了一个简单的User对象用户登录的功能，需要自己创建数据库，这里附上数据库的代码：

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('dulao', '123456');
