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
            + "     service_type = '${serviceType}', service_port = '${servicePort}', service_port_dubbo = '${servicePortDubbo}', "
            + "     service_context = '${serviceContext}', service_path_deploy = '${servicePathDeploy}', "
            + "     service_path_log= '${servicePathLog}', service_path_data = '${servicePathData}', "
            + "     service_path_temp = '${servicePathTemp}', service_manager = '${serviceManager}', "
            + "     service_note = '${serviceNote}', service_update_time = NOW()"
            + "where no = '${no}'")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceType", column = "service_type"),
        @Result(property = "servicePort", column = "service_port"),
        @Result(property = "servicePortDubbo", column = "service_port_dubbo"),
        @Result(property = "serviceContext", column = "service_context"),
        @Result(property = "servicePathDeploy", column = "service_path_deploy"),
        @Result(property = "servicePathLog", column = "service_path_log"),
        @Result(property = "servicePathData", column = "service_path_data"),
        @Result(property = "servicePathTemp", column = "service_path_temp"),
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
        @Result(property = "servicePortDubbo", column = "service_port_dubbo"),
        @Result(property = "serviceContext", column = "service_context"),
        @Result(property = "servicePathDeploy", column = "service_path_deploy"),
        @Result(property = "servicePathLog", column = "service_path_log"),
        @Result(property = "servicePathData", column = "service_path_data"),
        @Result(property = "servicePathTemp", column = "service_path_temp"),
        @Result(property = "serviceManager", column = "service_manager"),
        @Result(property = "serviceNote", column = "service_note"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
    })
    int delete(AtmServiceBasicConfigEntity atmServiceBasicConfigEntity);
    
    @Select("select no, service_name_eng, service_name_chs, service_type, service_port, service_port_dubbo, service_context, "
            + "     service_path_deploy, service_path_log, service_path_data, service_path_temp, service_manager, "
            + "     service_note, service_update_time  "
            + "from atm_service_basic_config "
            + "where service_name_eng like '%${seng}%' and service_manager like '%${smanager}%'"
            + "order by service_name_eng asc")
    @Results({
        @Result(property = "no", column = "no"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceType", column = "service_type"),
        @Result(property = "servicePort", column = "service_port"),
        @Result(property = "servicePortDubbo", column = "service_port_dubbo"),
        @Result(property = "serviceContext", column = "service_context"),
        @Result(property = "servicePathDeploy", column = "service_path_deploy"),
        @Result(property = "servicePathLog", column = "service_path_log"),
        @Result(property = "servicePathData", column = "service_path_data"),
        @Result(property = "servicePathTemp", column = "service_path_temp"),
        @Result(property = "serviceManager", column = "service_manager"),
        @Result(property = "serviceNote", column = "service_note"),
        @Result(property = "serviceUpdateTime", column = "service_update_time"),
    })
    List<AtmServiceBasicConfigEntity> search(@Param("seng") String seng, @Param("smanager") String smanager);
    
    @Insert("insert into atm_service_basic_config (service_name_eng, service_name_chs, service_type, service_port, "
            + "          service_port_dubbo, service_context, service_path_deploy, service_path_log, service_path_data, "
            + "          service_path_temp, service_manager, service_note) "
            + "value (#{serviceNameEng}, #{serviceNameChs}, #{serviceType}, #{servicePort}, #{servicePortDubbo}, "
            + "       #{serviceContext}, #{servicePathDeploy}, #{servicePathLog}, #{servicePathData}, "
            + "       #{servicePathTemp}, #{serviceManager}, #{serviceNote})")
    @Results({
//      @Result(property = "no", column = "no"),
        @Result(property = "serviceNameEng", column = "service_name_eng"),
        @Result(property = "serviceNameChs", column = "service_name_chs"),
        @Result(property = "serviceType", column = "service_type"),
        @Result(property = "servicePort", column = "service_port"),
        @Result(property = "servicePortDubbo", column = "service_port_dubbo"),
        @Result(property = "serviceContext", column = "service_context"),
        @Result(property = "servicePathDeploy", column = "service_path_deploy"),
        @Result(property = "servicePathLog", column = "service_path_log"),
        @Result(property = "servicePathData", column = "service_path_data"),
        @Result(property = "servicePathTemp", column = "service_path_temp"),
        @Result(property = "serviceManager", column = "service_manager"),
        @Result(property = "serviceNote", column = "service_note"),
//        @Result(property = "serviceUpdateTime", column = "service_update_time"),
    })
    Integer add(AtmServiceBasicConfigEntity atmServiceBasicConfigEntity);
}
