package com.fanfengping.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fanfengping.entity.AtmDeployServiceInfoEntity;
import com.fanfengping.mapper.AtmDeployServiceInfoMapper;

@RestController
public class AtmDeployServiceInfoController {
    @Autowired
    AtmDeployServiceInfoMapper serviceInfoMapper;
    
    @RequestMapping(value = { "/service", "/service/" }, 
            method = { RequestMethod.PUT }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer update(@RequestBody Map<String,Object> reqMap) {
        AtmDeployServiceInfoEntity serviceInfo = new AtmDeployServiceInfoEntity();
        
        serviceInfo.setNo(Integer.parseInt(reqMap.get("no").toString()));
        serviceInfo.setEnv(reqMap.get("env").toString());
        serviceInfo.setServiceNameEng(reqMap.get("serviceNameEng").toString());
        serviceInfo.setServiceNameChs(reqMap.get("serviceNameChs").toString());
        serviceInfo.setServiceUrl(reqMap.get("serviceUrl").toString());
        serviceInfo.setServiceUser(reqMap.get("serviceUser").toString());
        serviceInfo.setServicePass(reqMap.get("servicePass").toString());
        serviceInfo.setServiceUpdater(reqMap.get("serviceUpdater").toString());
//      serviceInfo.setServiceUpdateTime(reqMap.get("serviceUpdateTime").toString());
        serviceInfo.setServiceNote(reqMap.get("serviceNote").toString());
        
        try {
            return serviceInfoMapper.update(serviceInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    @RequestMapping(value = { "/service", "/service/" }, 
            method = { RequestMethod.DELETE }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer delete(@RequestBody Map<String,Object> reqMap) {
        AtmDeployServiceInfoEntity serviceInfo = new AtmDeployServiceInfoEntity();
        
        serviceInfo.setNo(Integer.parseInt(reqMap.get("no").toString()));
        serviceInfo.setEnv(reqMap.get("env").toString());
        serviceInfo.setServiceNameEng(reqMap.get("serviceNameEng").toString());
        serviceInfo.setServiceNameChs(reqMap.get("serviceNameChs").toString());
        serviceInfo.setServiceUrl(reqMap.get("serviceUrl").toString());
        serviceInfo.setServiceUser(reqMap.get("serviceUser").toString());
        serviceInfo.setServicePass(reqMap.get("servicePass").toString());
        serviceInfo.setServiceUpdater(reqMap.get("serviceUpdater").toString());
        serviceInfo.setServiceUpdateTime(reqMap.get("serviceUpdateTime").toString());
        serviceInfo.setServiceNote(reqMap.get("serviceNote").toString());
        
        try {
            return serviceInfoMapper.delete(serviceInfo);
        } catch (Exception e) {
            return 0;
        }
    }

    @RequestMapping(value = { "/service", "/service/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmDeployServiceInfoEntity> findAll() {
        List<AtmDeployServiceInfoEntity> serviceInfo = serviceInfoMapper.findAll();

        return serviceInfo;
    }
    
    @RequestMapping(value = { "/service", "/service/" }, 
            method = { RequestMethod.POST }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer add(@RequestBody Map<String,Object> reqMap) {
        AtmDeployServiceInfoEntity serviceInfo = new AtmDeployServiceInfoEntity();
        
//      serviceInfo.setNo(Integer.parseInt(reqMap.get("no").toString()));
        serviceInfo.setEnv(reqMap.get("env").toString());
        serviceInfo.setServiceNameEng(reqMap.get("serviceNameEng").toString());
        serviceInfo.setServiceNameChs(reqMap.get("serviceNameChs").toString());
        serviceInfo.setServiceUrl(reqMap.get("serviceUrl").toString());
        serviceInfo.setServiceUser(reqMap.get("serviceUser").toString());
        serviceInfo.setServicePass(reqMap.get("servicePass").toString());
        serviceInfo.setServiceUpdater(reqMap.get("serviceUpdater").toString());
//      serviceInfo.setServiceUpdateTime(reqMap.get("serviceUpdateTime").toString());
        serviceInfo.setServiceNote(reqMap.get("serviceNote").toString());
        
        try {
            return serviceInfoMapper.add(serviceInfo);
        } catch (Exception e) {
            return 0;
        }
    }
}
