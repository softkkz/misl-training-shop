/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.24_3306
 Source Server Type    : MariaDB
 Source Server Version : 100322
 Source Host           : 192.168.1.24:3306
 Source Schema         : misl_training

 Target Server Type    : MariaDB
 Target Server Version : 100322
 File Encoding         : 65001

 Date: 22/08/2021 16:32:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) DEFAULT NULL,
  `product_desc` varchar(10000) DEFAULT NULL,
  `product_price` decimal(10,2) DEFAULT NULL,
  `product_category` varchar(255) DEFAULT NULL,
  `product_image` varchar(255) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of product
-- ----------------------------
BEGIN;
INSERT INTO `product` VALUES (1, 'iPhone 12', 'มือถือระดับโลก', 32000.00, 'smartphone', 'https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/iphone-12-pro-family-hero?wid=470&hei=556&fmt=jpeg&qlt=95&.v=1604021663000', NULL);
INSERT INTO `product` VALUES (2, 'MacBook Pro 2021', 'MacBook รุ่นใหม่', 45000.00, 'computer', 'https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/mbp-spacegray-select-202011?wid=904&hei=840&fmt=jpeg&qlt=80&.v=1613672894000', NULL);
INSERT INTO `product` VALUES (3, 'Acer Aspire 3', 'Acer Aspire 3 การประมวลผลอันทรงพลัง รับชมวิดีโอ, ท่องเว็บ หรือทำงานอย่างราบรื่นรวดเร็วด้วยระบบประมวลผล Intel® Core™ i5 และกราฟิก NVIDIA® GeForce® MX2301 แอปโหลดเร็วขึ้น กราฟิกมีประสิทธิภาพมากขึ้น และมัลติทาสก์ได้อย่างมีประสิทธิภาพมากขึ้นด้วยการผสมผสานอันทรงพลังนี้และหน่วยความจำ DDR4 ขนาดสูงสุด 8GB', 24000.00, 'computer', 'https://d1dtruvuor2iuy.cloudfront.net/media/catalog/product/p/w/pwb000253858.jpg', NULL);
INSERT INTO `product` VALUES (4, 'Nikon Z 7', 'กล้องมิเรอร์เลสรูปแบบ FX รุ่นแรกของ Nikon ที่มาพร้อมกับความละเอียด 45.7 ล้านพิกเซล ดึงศักยภาพของเลนส์ NIKKOR Z ออกมาใช้อย่างเต็มที่ ด้วยสมรรถนะด้านออพติตอลที่ไม่เคยมีมาก่อน', 1999999.00, 'camera', 'http://www.nikon.co.th/tmp/Asia/4016499630/3857477713/365508689/3015334490/3537950180/3008623577/3353927964/2053073155.png', NULL);
INSERT INTO `product` VALUES (6, 'CPU INTEL CORE I7 - 11700K LGA 1200', 'Processor Base Frequency : 3.6 GHz', 13900.00, 'computer', 'https://img.advice.co.th/images_nas/pic_product4/A0135468/A0135468OK_BIG_1.jpg', NULL);
INSERT INTO `product` VALUES (10, 'CPU AMD sWRX8 RYZEN THREADRIPPER PRO 3995WX', 'AMD Zen Core Architecture Improved energy efficiency, higher clock speeds and more cores than ever before.', 192000.00, 'computer', 'https://img.advice.co.th/images_nas/pic_product4/A0136942/A0136942OK_BIG_1.jpg', NULL);
INSERT INTO `product` VALUES (11, 'CPU AMD sWRX8 RYZEN THREADRIPPER PRO 3995WX', 'AMD Zen Core Architecture Improved energy efficiency, higher clock speeds and more cores than ever before.', 192000.00, 'computer', 'https://img.advice.co.th/images_nas/pic_product4/A0136942/A0136942OK_BIG_1.jpg', NULL);
INSERT INTO `product` VALUES (12, 'CPU AMD sWRX8 RYZEN THREADRIPPER PRO 3995WX', 'AMD Zen Core Architecture Improved energy efficiency, higher clock speeds and more cores than ever before.', 192000.00, 'computer', 'https://img.advice.co.th/images_nas/pic_product4/A0136942/A0136942OK_BIG_1.jpg', NULL);
INSERT INTO `product` VALUES (13, 'CPU AMD sWRX8 RYZEN THREADRIPPER PRO 3995WX', 'AMD Zen Core Architecture Improved energy efficiency, higher clock speeds and more cores than ever before.', 192000.00, 'computer', 'https://img.advice.co.th/images_nas/pic_product4/A0136942/A0136942OK_BIG_1.jpg', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
