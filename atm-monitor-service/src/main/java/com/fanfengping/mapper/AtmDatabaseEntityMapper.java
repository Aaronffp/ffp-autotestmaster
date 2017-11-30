package com.fanfengping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fanfengping.entity.AtmDatabaseEntity;

public interface AtmDatabaseEntityMapper {
    @Insert("insert into atm_database (db_env, db_name_eng, db_name_chs, db_benchmark, db_type, db_driver, db_url, db_user, db_pass, db_creater, db_updater, db_note) "
            + "value (#{dbEnv}, #{dbNameEng}, #{dbNameChs}, #{dbBenchmark}, #{dbType}, #{dbDriver}, #{dbUrl}, #{dbUser}, #{dbPass}, #{dbCreater}, #{dbUpdater}, #{dbNote})")
    @Results({
//      @Result(property = "dbNo", column = "db_no"),
        @Result(property = "dbEnv", column = "db_env"),
        @Result(property = "dbNameEng", column = "db_name_eng"),
        @Result(property = "dbNameChs", column = "db_name_chs"),
        @Result(property = "dbBenchmark", column = "db_benchmark"),
        @Result(property = "dbType", column = "db_type"),
        @Result(property = "dbDriver", column = "db_driver"),
        @Result(property = "dbUrl", column = "db_url"),
        @Result(property = "dbUser", column = "db_user"),
        @Result(property = "dbPass", column = "db_pass"),
        @Result(property = "dbCreater", column = "db_creater"),
//      @Result(property = "dbCreateTime", column = "db_create_time"),
        @Result(property = "dbUpdater", column = "db_updater"),
//      @Result(property = "dbUpdateTime", column = "db_update_time"),
        @Result(property = "dbNote", column = "db_note"),
    })
    Integer add(AtmDatabaseEntity atmDatabaseEntity);
    
    @Select("select * from atm_database")
    @Results({
        @Result(property = "dbNo", column = "db_no"),
        @Result(property = "dbEnv", column = "db_env"),
        @Result(property = "dbNameEng", column = "db_name_eng"),
        @Result(property = "dbNameChs", column = "db_name_chs"),
        @Result(property = "dbBenchmark", column = "db_benchmark"),
        @Result(property = "dbType", column = "db_type"),
        @Result(property = "dbDriver", column = "db_driver"),
        @Result(property = "dbUrl", column = "db_url"),
        @Result(property = "dbUser", column = "db_user"),
        @Result(property = "dbPass", column = "db_pass"),
        @Result(property = "dbCreater", column = "db_creater"),
        @Result(property = "dbCreateTime", column = "db_create_time"),
        @Result(property = "dbUpdater", column = "db_updater"),
        @Result(property = "dbUpdateTime", column = "db_update_time"),
        @Result(property = "dbNote", column = "db_note"),
    })
    List<AtmDatabaseEntity> findAll();
    
    @Select("select * from atm_database where db_benchmark = 1")
    @Results({
        @Result(property = "dbNo", column = "db_no"),
        @Result(property = "dbEnv", column = "db_env"),
        @Result(property = "dbNameEng", column = "db_name_eng"),
        @Result(property = "dbNameChs", column = "db_name_chs"),
        @Result(property = "dbBenchmark", column = "db_benchmark"),
        @Result(property = "dbType", column = "db_type"),
        @Result(property = "dbDriver", column = "db_driver"),
        @Result(property = "dbUrl", column = "db_url"),
        @Result(property = "dbUser", column = "db_user"),
        @Result(property = "dbPass", column = "db_pass"),
        @Result(property = "dbCreater", column = "db_creater"),
        @Result(property = "dbCreateTime", column = "db_create_time"),
        @Result(property = "dbUpdater", column = "db_updater"),
        @Result(property = "dbUpdateTime", column = "db_update_time"),
        @Result(property = "dbNote", column = "db_note"),
    })
    List<AtmDatabaseEntity> findDbBenchmark();

    @Select("select * from atm_database where db_name_eng = #{db_name_eng} and db_benchmark = 0")
    @Results({
        @Result(property = "dbNo", column = "db_no"),
        @Result(property = "dbEnv", column = "db_env"),
        @Result(property = "dbNameEng", column = "db_name_eng"),
        @Result(property = "dbNameChs", column = "db_name_chs"),
        @Result(property = "dbBenchmark", column = "db_benchmark"),
        @Result(property = "dbType", column = "db_type"),
        @Result(property = "dbDriver", column = "db_driver"),
        @Result(property = "dbUrl", column = "db_url"),
        @Result(property = "dbUser", column = "db_user"),
        @Result(property = "dbPass", column = "db_pass"),
        @Result(property = "dbCreater", column = "db_creater"),
        @Result(property = "dbCreateTime", column = "db_create_time"),
        @Result(property = "dbUpdater", column = "db_updater"),
        @Result(property = "dbUpdateTime", column = "db_update_time"),
        @Result(property = "dbNote", column = "db_note"),
    })
    List<AtmDatabaseEntity> findByDbNameEng(String dbNameEng);
}
