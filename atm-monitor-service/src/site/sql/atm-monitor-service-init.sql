/*
Source Server         : 127.0.0.1
Source Server Version : 50635
Source Host           : 127.0.0.1:3306
Source Database       : information_schema

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-12-01 00:38:13
*/

-- ----------------------------------------------------------------------
-- CREATE DATABASE `atm_monitor` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
-- CREATE USER 'user_monitor'@'%' IDENTIFIED BY 'fanfengping123';
-- GRANT ALL PRIVILEGES ON `atm_monitor`.* TO 'user_monitor'@'%' IDENTIFIED BY 'fanfengping123';
-- ----------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------------------------------------------------
-- Table structure for atm_database
-- ----------------------------------------------------------------------
DROP TABLE IF EXISTS `atm_database`;
CREATE TABLE `atm_database` (
    `db_no`  int(15) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '环境编号' ,
    `db_env`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境标识' ,
    `db_name_eng`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '系统英文简称' ,
    `db_name_chs`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '系统中文名称' ,
    `db_benchmark`  int(1) NOT NULL DEFAULT 0 COMMENT '是否基准数据库（1，是；0，否）' ,
    `db_type`  varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库类型' ,
    `db_driver`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库驱动' ,
    `db_url`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库URL' ,
    `db_user`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库用户' ,
    `db_pass`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库密码' ,
    `db_creater`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库维护人' ,
    `db_create_time`  datetime NOT NULL DEFAULT NOW() COMMENT '创建日期' ,
    `db_updater`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库更新人' ,
    `db_update_time`  datetime NOT NULL DEFAULT NOW() COMMENT '环境数据库更新时间' ,
    `db_note`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '' COMMENT '备注' ,
PRIMARY KEY (`db_no`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='环境数据库信息配置表';

ALTER TABLE `atm_database`
ADD UNIQUE INDEX `index_atm_database` (`db_env`, `db_name_eng`) USING HASH COMMENT '环境数据库信息配置表联合主键';

insert into atm_database (db_env, db_name_eng, db_name_chs, db_benchmark, db_type, db_driver, db_url, db_user, db_pass, db_creater, db_updater, db_note) 
value ('SIT01', 'aaron-finance', '账务系统', 1, 'MYSQL', 'com.mysql.jdbc.Driver', 'jdbc:mysql://127.0.0.1:3306/finance_test01', 'user_monitor', 'fanfengping123', '范丰平', '范丰平', '账务项目组使用');
insert into atm_database (db_env, db_name_eng, db_name_chs, db_benchmark, db_type, db_driver, db_url, db_user, db_pass, db_creater, db_updater, db_note) 
value ('SIT02', 'aaron-finance', '账务系统', 1, 'MYSQL', 'com.mysql.jdbc.Driver', 'jdbc:mysql://127.0.0.1:3306/finance_test02', 'user_monitor', 'fanfengping123', '范丰平', '范丰平', '保险项目组使用');

-- ----------------------------------------------------------------------
-- Table structure for atm_table
-- ----------------------------------------------------------------------
DROP TABLE IF EXISTS `atm_table`;
CREATE TABLE `atm_table` (
    `tbl_no`  int(15) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '环境编号' ,
    `db_no`  int(15) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '环境编号' ,
    `db_env`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境标识' ,
    `db_name_eng`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '系统英文简称' ,
    `tbl_column_name`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '表名称' ,
    `tbl_column_count`  int(10) NOT NULL DEFAULT 0 COMMENT '表列数' ,
    `tbl_column_type`  varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库类型' ,
    `tbl_column_driver`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库驱动' ,
    `tbl_column_url`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库URL' ,
    `tbl_column_user`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库用户' ,
    `tbl_column_pass`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '环境数据库密码' ,
    `tbl_create_time`  datetime NOT NULL DEFAULT NOW() COMMENT '创建日期' ,
    `tbl_note`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '' COMMENT '备注' ,
PRIMARY KEY (`db_no`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='环境数据库信息配置表';


-- ----------------------------------------------------------------------
-- Table structure for atm_tbl_compare_info
-- ----------------------------------------------------------------------
DROP TABLE IF EXISTS `atm_tbl_compare_info`;
CREATE TABLE `atm_tbl_compare_info` (
    `tbl_comp_no`  int(15) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '系统编号' ,
    `tbl_comp_flag`  bigint(25) NOT NULL COMMENT '批次标识' ,
    `tbl_comp_result`  int(3) NOT NULL COMMENT '结果标识（0，成功；-1，失败）' ,
    `tbl_comp_name_eng` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '系统英文简称' ,
    `tbl_comp_benchmark_no`  int(15) UNSIGNED NOT NULL COMMENT '基准库编号' ,
    `tbl_comp_benchmark_env`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '基准库环境标识' ,
    `tbl_comp_benchmark_url`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '基准库URL' ,
    `tbl_comp_target_no`  int(15) UNSIGNED NOT NULL COMMENT '比对库编号' ,
    `tbl_comp_target_env`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '比对库环境标识' ,
    `tbl_comp_target_url`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '比对库URL' ,
    `tbl_comp_info`  varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '比对信息' ,
    `tbl_comp_note`  varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '' COMMENT '备注' ,
    `tbl_comp_time`  datetime NOT NULL DEFAULT NOW() COMMENT '创建日期' ,
PRIMARY KEY (`tbl_comp_no`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='数据库表比对结果表';




