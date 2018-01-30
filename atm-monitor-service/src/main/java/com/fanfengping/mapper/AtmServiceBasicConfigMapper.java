package com.fanfengping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fanfengping.entity.AtmServiceBasicConfigEntity;

public interface AtmServiceBasicConfigMapper {
    @Update("update atm_service_basic_config set service_name_eng = '${serviceNameEng}', service_name_chs = '${serviceNameChs}', "
            + "     service_type = '${serviceType}', service_port = '${servicePort}', service_git_url = '${serviceGitUrl}', "
            + "     service_aggregate_home = '${serviceAggregateHome}', service_war_name = '${serviceWarName}', "
            + "     service_war_file = '${serviceWarFile}', service_manager = '${serviceManager}', "
            + "     service_note = '${serviceNote}', service_update_time = NOW()"
            + "where no = '${no}'")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceType", column = "service_type"),
        @Result(property = "servicePort", column = "service_port"),
        @Result(property = "serviceGitUrl", column = "service_git_url"),
        @Result(property = "serviceAggregateHome", column = "service_aggregate_home"),
        @Result(property = "serviceWarName", column = "service_war_name"),
        @Result(property = "serviceWarFile", column = "service_war_file"),
        @Result(property = "serviceManager", column = "service_manager"),
        @Result(property = "serviceNote", column = "service_note"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
    })
    int update(AtmServiceBasicConfigEntity atmServiceBasicConfigEntity);
    
    @Delete("delete from atm_service_basic_config where no = #{no}")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceType", column = "service_type"),
        @Result(property = "servicePort", column = "service_port"),
        @Result(property = "serviceGitUrl", column = "service_git_url"),
        @Result(property = "serviceAggregateHome", column = "service_aggregate_home"),
        @Result(property = "serviceWarName", column = "service_war_name"),
        @Result(property = "serviceWarFile", column = "service_war_file"),
        @Result(property = "serviceManager", column = "service_manager"),
        @Result(property = "serviceNote", column = "service_note"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
    })
    int delete(AtmServiceBasicConfigEntity atmServiceBasicConfigEntity);
    
    @Select("select no, service_name_eng, service_name_chs, service_type, service_port, service_git_url, service_aggregate_home, "
            + "     service_war_name, service_war_file, service_manager, service_note, service_update_time  "
            + "from atm_service_basic_config "
            + "where service_name_eng like '%${seng}%' and service_manager like '%${smanager}%'"
            + "order by service_name_eng asc")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceType", column = "service_type"),
        @Result(property = "servicePort", column = "service_port"),
        @Result(property = "serviceGitUrl", column = "service_git_url"),
        @Result(property = "serviceAggregateHome", column = "service_aggregate_home"),
        @Result(property = "serviceWarName", column = "service_war_name"),
        @Result(property = "serviceWarFile", column = "service_war_file"),
        @Result(property = "serviceManager", column = "service_manager"),
        @Result(property = "serviceNote", column = "service_note"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
    })
    List<AtmServiceBasicConfigEntity> search(@Param("seng") String seng, @Param("smanager") String smanager);
    
    @Insert("insert into atm_service_basic_config (service_name_eng, service_name_chs, service_type, service_port, "
            + "          service_git_url, service_aggregate_home, service_war_name, service_war_file, service_manager, service_note) "
            + "value (#{serviceNameEng}, #{serviceNameChs}, #{serviceType}, #{servicePort}, #{serviceGitUrl}, "
            + "       #{serviceAggregateHome}, #{serviceWarName}, #{serviceWarFile}, #{serviceManager}, #{serviceNote})")
    @Results({
//      @Result(property = "no", column = "no"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceType", column = "service_type"),
        @Result(property = "servicePort", column = "service_port"),
        @Result(property = "serviceGitUrl", column = "service_git_url"),
        @Result(property = "serviceAggregateHome", column = "service_aggregate_home"),
        @Result(property = "serviceWarName", column = "service_war_name"),
        @Result(property = "serviceWarFile", column = "service_war_file"),
        @Result(property = "serviceManager", column = "service_manager"),
        @Result(property = "serviceNote", column = "service_note"),
//        @Result(property = "serviceUpdateTime", column = "service_update_time"),
    })
    Integer add(AtmServiceBasicConfigEntity atmServiceBasicConfigEntity);
}
