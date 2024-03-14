/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - ershoushujiaoyipingtai
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ershoushujiaoyipingtai` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ershoushujiaoyipingtai`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键 ',
  `yonghu_id` int(20) NOT NULL COMMENT '创建用户',
  `address_name` varchar(200) NOT NULL COMMENT '收货人 ',
  `address_phone` varchar(200) NOT NULL COMMENT '电话 ',
  `address_dizhi` varchar(200) NOT NULL COMMENT '地址 ',
  `isdefault_types` int(11) NOT NULL COMMENT '是否默认地址 ',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间 show3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='收货地址';

/*Data for the table `address` */

insert  into `address`(`id`,`yonghu_id`,`address_name`,`address_phone`,`address_dizhi`,`isdefault_types`,`insert_time`,`update_time`,`create_time`) values (1,3,'收货人1','17703786901','地址1',1,'2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(2,1,'收货人2','17703786902','地址2',1,'2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(3,2,'收货人3','17703786903','地址3',1,'2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(4,2,'收货人4','17703786904','地址4',1,'2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(5,3,'收货人5','17703786905','地址5',1,'2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41');

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '所属用户',
  `tushu_id` int(11) DEFAULT NULL COMMENT '图书',
  `buy_number` int(11) DEFAULT NULL COMMENT '购买数量',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '添加时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='购物车';

/*Data for the table `cart` */

/*Table structure for table `chat` */

DROP TABLE IF EXISTS `chat`;

CREATE TABLE `chat` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '提问用户',
  `chat_issue` varchar(200) DEFAULT NULL COMMENT '问题',
  `issue_time` timestamp NULL DEFAULT NULL COMMENT '问题时间 Search111',
  `chat_reply` varchar(200) DEFAULT NULL COMMENT '回复',
  `reply_time` timestamp NULL DEFAULT NULL COMMENT '回复时间 Search111',
  `zhuangtai_types` int(255) DEFAULT NULL COMMENT '状态',
  `chat_types` int(11) DEFAULT NULL COMMENT '数据类型',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户反馈';

/*Data for the table `chat` */

insert  into `chat`(`id`,`yonghu_id`,`chat_issue`,`issue_time`,`chat_reply`,`reply_time`,`zhuangtai_types`,`chat_types`,`insert_time`) values (1,1,'发送反馈信息','2022-03-16 15:49:30',NULL,NULL,2,1,'2022-03-16 15:49:30'),(2,1,NULL,NULL,'管理对平台的反馈回复','2022-03-16 15:52:11',NULL,2,'2022-03-16 15:52:12');

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'轮播图1','http://localhost:8080/ershoushujiaoyipingtai/upload/config1.jpg'),(2,'轮播图2','http://localhost:8080/ershoushujiaoyipingtai/upload/config2.jpg'),(3,'轮播图3','http://localhost:8080/ershoushujiaoyipingtai/upload/config3.jpg');

/*Table structure for table `dictionary` */

DROP TABLE IF EXISTS `dictionary`;

CREATE TABLE `dictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dic_code` varchar(200) DEFAULT NULL COMMENT '字段',
  `dic_name` varchar(200) DEFAULT NULL COMMENT '字段名',
  `code_index` int(11) DEFAULT NULL COMMENT '编码',
  `index_name` varchar(200) DEFAULT NULL COMMENT '编码名字  Search111 ',
  `super_id` int(11) DEFAULT NULL COMMENT '父字段id',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='字典';

/*Data for the table `dictionary` */

insert  into `dictionary`(`id`,`dic_code`,`dic_name`,`code_index`,`index_name`,`super_id`,`beizhu`,`create_time`) values (1,'sex_types','性别类型',1,'男',NULL,NULL,'2022-03-16 14:42:10'),(2,'sex_types','性别类型',2,'女',NULL,NULL,'2022-03-16 14:42:10'),(3,'isdefault_types','是否默认地址',1,'否',NULL,NULL,'2022-03-16 14:42:10'),(4,'isdefault_types','是否默认地址',2,'是',NULL,NULL,'2022-03-16 14:42:10'),(5,'shangxia_types','上下架',1,'上架',NULL,NULL,'2022-03-16 14:42:10'),(6,'shangxia_types','上下架',2,'下架',NULL,NULL,'2022-03-16 14:42:10'),(7,'tushu_types','图书类型',1,'图书类型1',NULL,NULL,'2022-03-16 14:42:10'),(8,'tushu_types','图书类型',2,'图书类型2',NULL,NULL,'2022-03-16 14:42:10'),(9,'tushu_types','图书类型',3,'图书类型3',NULL,NULL,'2022-03-16 14:42:10'),(10,'chat_types','数据类型',1,'问题',NULL,NULL,'2022-03-16 14:42:11'),(11,'chat_types','数据类型',2,'回复',NULL,NULL,'2022-03-16 14:42:11'),(12,'zhuangtai_types','状态',1,'未回复',NULL,NULL,'2022-03-16 14:42:11'),(13,'zhuangtai_types','状态',2,'已回复',NULL,NULL,'2022-03-16 14:42:11'),(15,'tushu_order_types','订单类型',2,'退款',NULL,NULL,'2022-03-16 14:42:11'),(16,'tushu_order_types','订单类型',3,'已支付',NULL,NULL,'2022-03-16 14:42:11'),(17,'tushu_order_types','订单类型',4,'已发货',NULL,NULL,'2022-03-16 14:42:11'),(18,'tushu_order_types','订单类型',5,'已收货',NULL,NULL,'2022-03-16 14:42:11'),(19,'tushu_order_payment_types','订单支付类型',1,'现金',NULL,NULL,'2022-03-16 14:42:11'),(20,'news_types','公告类型',1,'公告类型1',NULL,NULL,'2022-03-16 14:42:11'),(21,'news_types','公告类型',2,'公告类型2',NULL,NULL,'2022-03-16 14:42:11'),(22,'tushuqiugou_types','图书求购状态',1,'未完成',NULL,NULL,'2022-03-16 14:42:11'),(23,'tushuqiugou_types','图书求购状态',2,'已完成',NULL,NULL,'2022-03-16 14:42:11');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键 ',
  `news_name` varchar(200) DEFAULT NULL COMMENT '公告标题 Search111  ',
  `news_photo` varchar(200) DEFAULT NULL COMMENT '公告图片 ',
  `news_types` int(11) NOT NULL COMMENT '公告类型 Search111',
  `news_content` text COMMENT '公告详情 ',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show1 show2 nameShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='公告信息';

/*Data for the table `news` */

insert  into `news`(`id`,`news_name`,`news_photo`,`news_types`,`news_content`,`create_time`) values (1,'公告标题1','http://localhost:8080/ershoushujiaoyipingtai/upload/news1.jpg',2,'公告详情1','2022-03-16 14:42:41'),(2,'公告标题2','http://localhost:8080/ershoushujiaoyipingtai/upload/news2.jpg',1,'公告详情2','2022-03-16 14:42:41'),(3,'公告标题3','http://localhost:8080/ershoushujiaoyipingtai/upload/news3.jpg',1,'公告详情3','2022-03-16 14:42:41'),(4,'公告标题4','http://localhost:8080/ershoushujiaoyipingtai/upload/news4.jpg',2,'公告详情4','2022-03-16 14:42:41'),(5,'公告标题5','http://localhost:8080/ershoushujiaoyipingtai/upload/news5.jpg',2,'公告详情5','2022-03-16 14:42:41');

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,1,'admin','users','管理员','go7thfb8mjy5lzps1j9s7w60cou4zovl','2022-03-16 14:53:54','2022-03-16 16:57:00'),(2,1,'a1','yonghu','用户','1ikb2akrqz4n11iazikeaxvbz1k9r8a2','2022-03-16 14:57:28','2022-03-16 16:57:48'),(3,2,'a2','yonghu','用户','m26trdx33qvc5of2sywcty25l5vwho9t','2022-03-16 15:34:35','2022-03-16 16:50:16');

/*Table structure for table `tushu` */

DROP TABLE IF EXISTS `tushu`;

CREATE TABLE `tushu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键 ',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `tushu_name` varchar(200) DEFAULT NULL COMMENT '图书名称  Search111 ',
  `tushu_photo` varchar(200) DEFAULT NULL COMMENT '图书图片',
  `tushu_zuozhe` varchar(200) DEFAULT NULL COMMENT '作者',
  `tushu_chubanshe` varchar(200) DEFAULT NULL COMMENT '出版社',
  `tushu_types` int(11) DEFAULT NULL COMMENT '图书类型 Search111',
  `tushu_kucun_number` int(11) DEFAULT NULL COMMENT '图书库存',
  `tushu_old_money` decimal(10,2) DEFAULT NULL COMMENT '图书原价 ',
  `tushu_new_money` decimal(10,2) DEFAULT NULL COMMENT '现价',
  `tushu_clicknum` int(11) DEFAULT NULL COMMENT '点击次数 ',
  `shangxia_types` int(11) DEFAULT NULL COMMENT '是否上架 ',
  `tushu_delete` int(11) DEFAULT NULL COMMENT '逻辑删除',
  `tushu_content` text COMMENT '图书简介 ',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间  show1 show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='图书';

/*Data for the table `tushu` */

insert  into `tushu`(`id`,`yonghu_id`,`tushu_name`,`tushu_photo`,`tushu_zuozhe`,`tushu_chubanshe`,`tushu_types`,`tushu_kucun_number`,`tushu_old_money`,`tushu_new_money`,`tushu_clicknum`,`shangxia_types`,`tushu_delete`,`tushu_content`,`create_time`) values (1,2,'图书名称1','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu1.jpg','作者1','出版社1',3,96,'625.25','495.97',313,1,1,'图书简介1','2022-03-16 14:42:41'),(2,2,'图书名称2','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu2.jpg','作者2','出版社2',2,97,'782.22','261.04',480,1,1,'图书简介2','2022-03-16 14:42:41'),(3,3,'图书名称3','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu3.jpg','作者3','出版社3',2,102,'653.34','70.24',69,1,1,'图书简介3','2022-03-16 14:42:41'),(4,1,'图书名称4','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu4.jpg','作者4','出版社4',1,104,'997.02','45.84',263,1,1,'图书简介4','2022-03-16 14:42:41'),(5,1,'图书名称5','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu5.jpg','作者5','出版社5',1,105,'601.80','407.86',193,1,1,'图书简介5','2022-03-16 14:42:41');

/*Table structure for table `tushu_liuyan` */

DROP TABLE IF EXISTS `tushu_liuyan`;

CREATE TABLE `tushu_liuyan` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tushu_id` int(11) DEFAULT NULL COMMENT '图书',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `tushu_liuyan_text` text COMMENT '留言内容',
  `reply_text` text COMMENT '回复内容',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '留言时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '回复时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='图书留言';

/*Data for the table `tushu_liuyan` */

insert  into `tushu_liuyan`(`id`,`tushu_id`,`yonghu_id`,`tushu_liuyan_text`,`reply_text`,`insert_time`,`update_time`,`create_time`) values (1,1,1,'留言内容1','回复信息1','2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(2,2,3,'留言内容2','回复信息2','2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(3,3,3,'留言内容3','回复信息3','2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(4,4,3,'留言内容4','回复信息4','2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(5,5,1,'留言内容5','回复信息5','2022-03-16 14:42:41','2022-03-16 14:42:41','2022-03-16 14:42:41'),(6,1,2,'留言内容1111','发布图书用户可回复','2022-03-16 15:47:03','2022-03-16 15:50:37','2022-03-16 15:47:03');

/*Table structure for table `tushu_order` */

DROP TABLE IF EXISTS `tushu_order`;

CREATE TABLE `tushu_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tushu_order_uuid_number` varchar(200) DEFAULT NULL COMMENT '订单号',
  `address_id` int(11) DEFAULT NULL COMMENT '送货地址 ',
  `tushu_id` int(11) DEFAULT NULL COMMENT '图书',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `buy_number` int(11) DEFAULT NULL COMMENT '购买数量',
  `tushu_order_courier_number` varchar(200) DEFAULT NULL COMMENT '快递单号',
  `tushu_order_courier_name` varchar(200) DEFAULT NULL COMMENT '快递公司',
  `tushu_order_true_price` decimal(10,2) DEFAULT NULL COMMENT '实付价格',
  `tushu_order_types` int(11) DEFAULT NULL COMMENT '订单类型',
  `tushu_order_payment_types` int(11) DEFAULT NULL COMMENT '支付类型',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '订单创建时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='图书订单';

/*Data for the table `tushu_order` */

insert  into `tushu_order`(`id`,`tushu_order_uuid_number`,`address_id`,`tushu_id`,`yonghu_id`,`buy_number`,`tushu_order_courier_number`,`tushu_order_courier_name`,`tushu_order_true_price`,`tushu_order_types`,`tushu_order_payment_types`,`insert_time`,`create_time`) values (1,'1647415762493',2,2,1,3,NULL,NULL,'783.12',3,1,'2022-03-16 15:29:23','2022-03-16 15:29:23'),(2,'1647415762493',2,1,1,4,NULL,NULL,'1983.88',3,1,'2022-03-16 15:29:23','2022-03-16 15:29:23'),(3,'1647415829956',2,1,1,1,NULL,NULL,'495.97',3,1,'2022-03-16 15:30:30','2022-03-16 15:30:30'),(4,'1647415990083',2,2,1,1,'JD 1122334456677','京东','261.04',4,1,'2022-03-16 15:33:10','2022-03-16 15:33:10'),(5,'1647415990083',2,3,1,1,NULL,NULL,'70.24',3,1,'2022-03-16 15:33:16','2022-03-16 15:33:16'),(6,'1647416949691',2,2,1,1,'SF 115599226633','顺风','261.04',5,1,'2022-03-16 15:49:10','2022-03-16 15:49:10'),(7,'1647416949691',2,1,1,1,NULL,NULL,'495.97',2,1,'2022-03-16 15:49:10','2022-03-16 15:49:10');

/*Table structure for table `tushuqiugou` */

DROP TABLE IF EXISTS `tushuqiugou`;

CREATE TABLE `tushuqiugou` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键 ',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `tushuqiugou_name` varchar(200) DEFAULT NULL COMMENT '图书名称  Search111 ',
  `tushuqiugou_photo` varchar(200) DEFAULT NULL COMMENT '图书图片',
  `tushuqiugou_zuozhe` varchar(200) DEFAULT NULL COMMENT '作者',
  `tushuqiugou_chubanshe` varchar(200) DEFAULT NULL COMMENT '出版社',
  `tushu_types` int(11) DEFAULT NULL COMMENT '图书类型 Search111',
  `tushuqiugou_types` int(11) DEFAULT NULL COMMENT '图书求购状态',
  `tushuqiugou_content` text COMMENT '图书详情 ',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='图书求购';

/*Data for the table `tushuqiugou` */

insert  into `tushuqiugou`(`id`,`yonghu_id`,`tushuqiugou_name`,`tushuqiugou_photo`,`tushuqiugou_zuozhe`,`tushuqiugou_chubanshe`,`tushu_types`,`tushuqiugou_types`,`tushuqiugou_content`,`create_time`) values (1,2,'图书名称1','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu1.jpg','作者1','出版社1',1,2,'图书详情1','2022-03-16 14:42:41'),(2,1,'图书名称2','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu2.jpg','作者2','出版社2',1,1,'图书详情2','2022-03-16 14:42:41'),(3,3,'图书名称3','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu3.jpg','作者3','出版社3',3,2,'图书详情3','2022-03-16 14:42:41'),(4,1,'图书名称4','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu4.jpg','作者4','出版社4',1,1,'<p>图书详情4</p>','2022-03-16 14:42:41'),(5,3,'图书名称5','http://localhost:8080/ershoushujiaoyipingtai/upload/tushu5.jpg','作者5','出版社5',1,2,'图书详情5','2022-03-16 14:42:41');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'admin','admin','管理员','2022-05-01 00:00:00');

/*Table structure for table `yonghu` */

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(200) DEFAULT NULL COMMENT '账户',
  `password` varchar(200) DEFAULT NULL COMMENT '密码',
  `yonghu_name` varchar(200) DEFAULT NULL COMMENT '用户姓名 Search111 ',
  `yonghu_phone` varchar(200) DEFAULT NULL COMMENT '用户手机号',
  `yonghu_id_number` varchar(200) DEFAULT NULL COMMENT '用户身份证号',
  `yonghu_photo` varchar(200) DEFAULT NULL COMMENT '用户头像',
  `sex_types` int(11) DEFAULT NULL COMMENT '性别 Search111',
  `yonghu_email` varchar(200) DEFAULT NULL COMMENT '电子邮箱',
  `new_money` decimal(10,2) DEFAULT NULL COMMENT '余额 ',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `yonghu` */

insert  into `yonghu`(`id`,`username`,`password`,`yonghu_name`,`yonghu_phone`,`yonghu_id_number`,`yonghu_photo`,`sex_types`,`yonghu_email`,`new_money`,`create_time`) values (1,'a1','123456','用户姓名1','17703786901','410224199610232001','http://localhost:8080/ershoushujiaoyipingtai/upload/yonghu1.jpg',2,'1@qq.com','5911.71','2022-03-16 14:42:41'),(2,'a2','123456','用户姓名2','17703786902','410224199610232002','http://localhost:8080/ershoushujiaoyipingtai/upload/yonghu2.jpg',1,'2@qq.com','857.01','2022-03-16 14:42:41'),(3,'a3','123456','用户姓名3','17703786903','410224199610232003','http://localhost:8080/ershoushujiaoyipingtai/upload/yonghu3.jpg',1,'3@qq.com','170.24','2022-03-16 14:42:41');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
