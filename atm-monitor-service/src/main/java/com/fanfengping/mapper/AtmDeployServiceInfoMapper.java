package com.fanfengping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fanfengping.entity.AtmDeployServiceInfoEntity;

public interface AtmDeployServiceInfoMapper {
    @Update("update atm_deploy_service_info set env = '${env}', service_name_eng = '${serviceNameEng}', service_name_chs = '${serviceNameChs}', "
            + "service_url = '${serviceUrl}', service_updater = '${serviceUpdater}', service_update_time = NOW(), "
            + "service_note = '${serviceNote}' where no = '${no}'")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "env", column = "env"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceUrl", column = "service_url"),
        @Result(property = "serviceUser", column = "service_user"),
        @Result(property = "servicePass", column = "service_pass"),
        @Result(property = "serviceUpdater", column = "service_updater"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
        @Result(property = "serviceNote", column = "service_note"),
    })
    int update(AtmDeployServiceInfoEntity serviceInfo);
    
    @Delete("delete from atm_deploy_service_info where no = #{no}")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "env", column = "env"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceUrl", column = "service_url"),
        @Result(property = "serviceUser", column = "service_user"),
        @Result(property = "servicePass", column = "service_pass"),
        @Result(property = "serviceUpdater", column = "service_updater"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
        @Result(property = "serviceNote", column = "service_note"),
    })
    int delete(AtmDeployServiceInfoEntity serviceInfo);
    
    @Select("select no, env, service_name_eng, service_name_chs, service_url, service_user, service_pass, "
            + "service_updater, service_update_time, service_note  "
            + "from atm_deploy_service_info order by no desc")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "env", column = "env"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceUrl", column = "service_url"),
        @Result(property = "serviceUser", column = "service_user"),
        @Result(property = "servicePass", column = "service_pass"),
        @Result(property = "serviceUpdater", column = "service_updater"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
        @Result(property = "serviceNote", column = "service_note"),
    })
    List<AtmDeployServiceInfoEntity> findAll();
    
    @Insert("insert into atm_deploy_service_info (env, service_name_eng, service_name_chs, service_url, service_user, service_pass, service_updater, service_note) "
            + "value (#{env}, #{serviceNameEng}, #{serviceNameChs}, #{serviceUrl}, #{serviceUser}, #{servicePass}, #{serviceUpdater}, #{serviceNote})")
    @Results({
//      @Result(property = "no", column = "no"),
        @Result(property = "env", column = "env"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceUrl", column = "service_url"),
        @Result(property = "serviceUser", column = "service_user"),
        @Result(property = "servicePass", column = "service_pass"),
        @Result(property = "serviceUpdater", column = "service_updater"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
        @Result(property = "serviceNote", column = "service_note"),
    })
    Integer add(AtmDeployServiceInfoEntity serviceInfo);
}
