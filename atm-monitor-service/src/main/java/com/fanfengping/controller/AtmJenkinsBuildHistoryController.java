package com.fanfengping.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fanfengping.entity.AtmJenkinsBuildHistory;
import com.fanfengping.mapper.AtmJenkinsBuildHistoryMapper;

@RestController
public class AtmJenkinsBuildHistoryController {
    @Autowired
    AtmJenkinsBuildHistoryMapper atmJenkinsBuildHistoryMapper;
    
    @RequestMapping(value = { "/build", "/build/" }, 
            method = { RequestMethod.POST }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer add(@RequestBody Map<String,Object> reqMap) {
        try {
            String[] req = reqMap.get("binfo").toString().split(",");
            
            if (req.length < 9) {
                return -1;
            }
            
            AtmJenkinsBuildHistory bh = new AtmJenkinsBuildHistory(req[0], req[1], req[2], req[3], req[4], Integer.parseInt(req[5]), req[6], req[7], req[8]);
            
            return atmJenkinsBuildHistoryMapper.add(bh);
        } catch (Exception e) {
            return -1;
        }
    }
    
    @RequestMapping(value = { "/build/release", "/build/release/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmJenkinsBuildHistory> searchRelease(@RequestParam("env") String env, @RequestParam("service") String service) throws SQLException {
        return atmJenkinsBuildHistoryMapper.searchRelease(env, service);
    }

    @RequestMapping(value = { "/build", "/build/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmJenkinsBuildHistory> search(@RequestParam("env") String env, @RequestParam("server") String server, @RequestParam("service") String service, @RequestParam("deployer") String deployer, @RequestParam("status") String status) throws SQLException {
        if (Integer.parseInt(status) == -1) {
            return atmJenkinsBuildHistoryMapper.searchAllVersion(env, server, service, deployer, Integer.parseInt(status));
        } else {
            return atmJenkinsBuildHistoryMapper.search(env, server, service, deployer, Integer.parseInt(status));
        }
    }
    
    @RequestMapping(value = { "/build", "/build/" }, 
            method = { RequestMethod.PUT }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer update(@RequestBody Map<String,Object> reqMap) {
        try {
            AtmJenkinsBuildHistory bh = new AtmJenkinsBuildHistory();
            
            bh.setId(Integer.parseInt(reqMap.get("id").toString()));
            bh.setBuildEnv(reqMap.get("buildEnv").toString());
            bh.setBuildServer(reqMap.get("buildServer").toString());
            bh.setBuildService(reqMap.get("buildService").toString());
            bh.setBuildDeployer(reqMap.get("buildDeployer").toString());
            bh.setBuildVersion(reqMap.get("buildVersion").toString());
            bh.setBuildStatus(Integer.parseInt(reqMap.get("buildStatus").toString()));
            bh.setBuildGitUrl(reqMap.get("buildGitUrl").toString());
            bh.setBuildGitBranch(reqMap.get("buildGitBranch").toString());
            bh.setBuildJenkinsLink(reqMap.get("buildJenkinsLink").toString());
            bh.setBuildTime(reqMap.get("buildTime").toString());
        
            return atmJenkinsBuildHistoryMapper.update(bh);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
