package com.fanfengping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fanfengping.entity.AtmJenkinsBuildHistory;

public interface AtmJenkinsBuildHistoryMapper {
    @Update("update atm_jenkins_build_history set build_status = #{buildStatus} where id = #{id}")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "buildEnv", column = "build_env"),
        @Result(property = "buildServer", column = "build_server"),
        @Result(property = "buildService", column = "build_service"),
        @Result(property = "buildDeployer", column = "build_deployer"),
        @Result(property = "buildVersion", column = "build_version"),
        @Result(property = "buildStatus", column = "build_status"),
        @Result(property = "buildGitUrl", column = "build_git_url"),
        @Result(property = "buildGitBranch", column = "build_git_branch"),
        @Result(property = "buildJenkinsLink", column = "build_jenkins_link"),
        @Result(property = "buildTime", column = "build_time"),
    })
    int update(AtmJenkinsBuildHistory atmJenkinsBuildHistory);
    
    @Select("select id, build_env, build_server, build_service, build_deployer, build_version, build_status, "
            + "build_git_url, build_git_branch, build_jenkins_link, build_time "
            + "from atm_jenkins_build_history "
            + "where build_env like '%${env}%' and build_server like '%${server}%' and build_service like '%${service}%' "
            + "and build_deployer like '%${deployer}%' "
            + "order by id desc limit 50")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "buildEnv", column = "build_env"),
        @Result(property = "buildServer", column = "build_server"),
        @Result(property = "buildService", column = "build_service"),
        @Result(property = "buildDeployer", column = "build_deployer"),
        @Result(property = "buildVersion", column = "build_version"),
        @Result(property = "buildStatus", column = "build_status"),
        @Result(property = "buildGitUrl", column = "build_git_url"),
        @Result(property = "buildGitBranch", column = "build_git_branch"),
        @Result(property = "buildJenkinsLink", column = "build_jenkins_link"),
        @Result(property = "buildTime", column = "build_time"),
    })
    List<AtmJenkinsBuildHistory> searchAllVersion(@Param("env") String env, @Param("server") String server, @Param("service") String service, @Param("deployer") String deployer, @Param("status") Integer status);
    
    @Select("select id, build_env, build_server, build_service, build_deployer, build_version, build_status, "
            + "build_git_url, build_git_branch, build_jenkins_link, build_time "
            + "from atm_jenkins_build_history "
            + "where build_env like '%${env}%' and build_server like '%${server}%' and build_service like '%${service}%' "
            + "and build_deployer like '%${deployer}%' and build_status = '${status}' "
            + "order by id desc limit 50")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "buildEnv", column = "build_env"),
        @Result(property = "buildServer", column = "build_server"),
        @Result(property = "buildService", column = "build_service"),
        @Result(property = "buildDeployer", column = "build_deployer"),
        @Result(property = "buildVersion", column = "build_version"),
        @Result(property = "buildStatus", column = "build_status"),
        @Result(property = "buildGitUrl", column = "build_git_url"),
        @Result(property = "buildGitBranch", column = "build_git_branch"),
        @Result(property = "buildJenkinsLink", column = "build_jenkins_link"),
        @Result(property = "buildTime", column = "build_time"),
    })
    List<AtmJenkinsBuildHistory> search(@Param("env") String env, @Param("server") String server, @Param("service") String service, @Param("deployer") String deployer, @Param("status") Integer status);
    
    @Insert("insert into atm_jenkins_build_history(build_env, build_server, build_service, build_deployer, build_version, build_status, "
            + "build_git_url, build_git_branch, build_jenkins_link)"
            + "values (#{buildEnv}, #{buildServer}, #{buildService}, #{buildDeployer}, #{buildVersion}, #{buildStatus}, "
            + "#{buildGitUrl}, #{buildGitBranch}, #{buildJenkinsLink})")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "buildEnv", column = "build_env"),
        @Result(property = "buildServer", column = "build_server"),
        @Result(property = "buildService", column = "build_service"),
        @Result(property = "buildDeployer", column = "build_deployer"),
        @Result(property = "buildVersion", column = "build_version"),
        @Result(property = "buildStatus", column = "build_status"),
        @Result(property = "buildGitUrl", column = "build_git_url"),
        @Result(property = "buildGitBranch", column = "build_git_branch"),
        @Result(property = "buildJenkinsLink", column = "build_jenkins_link"),
        @Result(property = "buildTime", column = "build_time"),
    })
    Integer add(AtmJenkinsBuildHistory atmJenkinsBuildHistory);
}
