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

import com.fanfengping.entity.AtmServiceBasicConfigEntity;
import com.fanfengping.mapper.AtmServiceBasicConfigMapper;

@RestController
public class AtmServiceBasicConfigController {
    @Autowired
    AtmServiceBasicConfigMapper serviceBasicConfigMapper;
    
    @RequestMapping(value = { "/sconf", "/sconf/" }, 
            method = { RequestMethod.PUT }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer update(@RequestBody Map<String,Object> reqMap) {
        AtmServiceBasicConfigEntity serviceBasicConfig = new AtmServiceBasicConfigEntity();
        
        serviceBasicConfig.setNo(Integer.parseInt(reqMap.get("no").toString()));
        serviceBasicConfig.setServiceNameEng(reqMap.get("eng").toString());
        serviceBasicConfig.setServiceNameChs(reqMap.get("chs").toString());
        serviceBasicConfig.setServiceType(reqMap.get("type").toString());
        serviceBasicConfig.setServicePort(Integer.parseInt(reqMap.get("port").toString()));
        serviceBasicConfig.setServiceContext(reqMap.get("context").toString());
        serviceBasicConfig.setServicePathDeploy(reqMap.get("deployPath").toString());
        serviceBasicConfig.setServicePathLog(reqMap.get("logPath").toString());
        serviceBasicConfig.setServicePathData(reqMap.get("dataPath").toString());
        serviceBasicConfig.setServicePathTemp(reqMap.get("tempPath").toString());
        serviceBasicConfig.setServiceManager(reqMap.get("manager").toString());
        serviceBasicConfig.setServiceNote(reqMap.get("note").toString());
        
        try {
            return serviceBasicConfigMapper.update(serviceBasicConfig);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    @RequestMapping(value = { "/sconf", "/sconf/" }, 
            method = { RequestMethod.DELETE }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer delete(@RequestBody Map<String,Object> reqMap) {
        AtmServiceBasicConfigEntity serviceBasicConfig = new AtmServiceBasicConfigEntity();
        
        serviceBasicConfig.setNo(Integer.parseInt(reqMap.get("no").toString()));
        serviceBasicConfig.setServiceNameEng(reqMap.get("eng").toString());
        serviceBasicConfig.setServiceNameChs(reqMap.get("chs").toString());
        serviceBasicConfig.setServiceType(reqMap.get("type").toString());
        serviceBasicConfig.setServicePort(Integer.parseInt(reqMap.get("port").toString()));
        serviceBasicConfig.setServiceContext(reqMap.get("context").toString());
        serviceBasicConfig.setServicePathDeploy(reqMap.get("deployPath").toString());
        serviceBasicConfig.setServicePathLog(reqMap.get("logPath").toString());
        serviceBasicConfig.setServicePathData(reqMap.get("dataPath").toString());
        serviceBasicConfig.setServicePathTemp(reqMap.get("tempPath").toString());
        serviceBasicConfig.setServiceManager(reqMap.get("manager").toString());
        serviceBasicConfig.setServiceNote(reqMap.get("note").toString());
        serviceBasicConfig.setServiceUpdateTime(reqMap.get("updateTime").toString());
        
        try {
            return serviceBasicConfigMapper.delete(serviceBasicConfig);
        } catch (Exception e) {
            return 0;
        }
    }
    
    @RequestMapping(value = { "/sconf", "/sconf/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmServiceBasicConfigEntity> search(@RequestParam("seng") String seng, @RequestParam("smanager") String smanager) throws SQLException {
        return serviceBasicConfigMapper.search(seng, smanager);
    }

    @RequestMapping(value = { "/sconf", "/sconf/" }, 
            method = { RequestMethod.POST }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer add(@RequestBody Map<String,Object> reqMap) {
        AtmServiceBasicConfigEntity serviceBasicConfig = new AtmServiceBasicConfigEntity();
        
        serviceBasicConfig.setServiceNameEng(reqMap.get("eng").toString());
        serviceBasicConfig.setServiceNameChs(reqMap.get("chs").toString());
        serviceBasicConfig.setServiceType(reqMap.get("type").toString());
        serviceBasicConfig.setServicePort(Integer.parseInt(reqMap.get("port").toString()));
        serviceBasicConfig.setServiceContext(reqMap.get("context").toString());
        serviceBasicConfig.setServicePathDeploy(reqMap.get("deployPath").toString());
        serviceBasicConfig.setServicePathLog(reqMap.get("logPath").toString());
        serviceBasicConfig.setServicePathData(reqMap.get("dataPath").toString());
        serviceBasicConfig.setServicePathTemp(reqMap.get("tempPath").toString());
        serviceBasicConfig.setServiceManager(reqMap.get("manager").toString());
        serviceBasicConfig.setServiceNote(reqMap.get("note").toString());
        
        try {
            return serviceBasicConfigMapper.add(serviceBasicConfig);
        } catch (Exception e) {
            return 0;
        }
    }
}
