package com.fanfengping.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fanfengping.entity.AtmDatabaseEntity;
import com.fanfengping.mapper.AtmDatabaseEntityMapper;

@RestController
public class AtmDatabaseEntityController {
    @Autowired
    AtmDatabaseEntityMapper atmDatabaseEntityMapper;

    @RequestMapping(value = { "/db", "/db/" }, 
            method = { RequestMethod.POST }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer add(@RequestBody Map<String,Object> reqMap) {
        AtmDatabaseEntity db = new AtmDatabaseEntity();
        
//      db.setDbNo(Integer.parseInt(reqMap.get("dbNo").toString()));
        db.setDbEnv(reqMap.get("dbEnv").toString());
        db.setDbNameEng(reqMap.get("dbNameEng").toString());
        db.setDbNameChs(reqMap.get("dbNameChs").toString());
        db.setDbBenchmark(Integer.parseInt(reqMap.get("dbBenchmark").toString()));
        db.setDbType(reqMap.get("dbType").toString());
        db.setDbDriver(reqMap.get("dbDriver").toString());
        db.setDbUrl(reqMap.get("dbUrl").toString());
        db.setDbUser(reqMap.get("dbUser").toString());
        db.setDbPass(reqMap.get("dbPass").toString());
        db.setDbCreater(reqMap.get("dbCreater").toString());
//      db.setDbCreateTime(reqMap.get("dbCreateTime").toString());
        db.setDbUpdater(reqMap.get("dbUpdater").toString());
//      db.setDbUpdateTime(reqMap.get("dbUpdateTime").toString());
        db.setDbNote(reqMap.get("dbNote").toString());
        
        try {
            return atmDatabaseEntityMapper.add(db);
        } catch (Exception e) {
            return 0;
        }
    }
    
    @RequestMapping(value = { "/db", "/db/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmDatabaseEntity> findAll() {
        List<AtmDatabaseEntity> databases = atmDatabaseEntityMapper.findAll();

        return databases;
    }
    
    @RequestMapping(value = { "/db/benchmark", "/db/benchmark/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmDatabaseEntity> findDbBenchmark() {
        List<AtmDatabaseEntity> databases = atmDatabaseEntityMapper.findDbBenchmark();

        return databases;
    }
    
    @RequestMapping(value = { "/db/{dbNameEng}", "/db/{dbNameEng}/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmDatabaseEntity> findByDbNameEng(@PathVariable("dbNameEng") String dbNameEng) {
        List<AtmDatabaseEntity> databases = atmDatabaseEntityMapper.findByDbNameEng(dbNameEng);

        return databases;
    }
    
    @RequestMapping(value = { "/db", "/db/" }, 
            method = { RequestMethod.PUT }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer update(@RequestBody Map<String,Object> reqMap) {
        AtmDatabaseEntity db = new AtmDatabaseEntity();
        
        db.setDbNo(Integer.parseInt(reqMap.get("dbNo").toString()));
        db.setDbEnv(reqMap.get("dbEnv").toString());
        db.setDbNameEng(reqMap.get("dbNameEng").toString());
        db.setDbNameChs(reqMap.get("dbNameChs").toString());
        db.setDbBenchmark(Integer.parseInt(reqMap.get("dbBenchmark").toString()));
        db.setDbType(reqMap.get("dbType").toString());
        db.setDbDriver(reqMap.get("dbDriver").toString());
        db.setDbUrl(reqMap.get("dbUrl").toString());
        db.setDbUser(reqMap.get("dbUser").toString());
        db.setDbPass(reqMap.get("dbPass").toString());
        db.setDbCreater(reqMap.get("dbCreater").toString());
        db.setDbCreateTime(reqMap.get("dbCreateTime").toString());
        db.setDbUpdater(reqMap.get("dbUpdater").toString());
        db.setDbUpdateTime(reqMap.get("dbUpdateTime").toString());
        db.setDbNote(reqMap.get("dbNote").toString());
        
        try {
            return atmDatabaseEntityMapper.update(db);
        } catch (Exception e) {
            return 0;
        }
    }
    
    @RequestMapping(value = { "/db", "/db/" }, 
            method = { RequestMethod.DELETE }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Integer delete(@RequestBody Map<String,Object> reqMap) {
        AtmDatabaseEntity db = new AtmDatabaseEntity();
        
        db.setDbNo(Integer.parseInt(reqMap.get("dbNo").toString()));
        db.setDbEnv(reqMap.get("dbEnv").toString());
        db.setDbNameEng(reqMap.get("dbNameEng").toString());
        db.setDbNameChs(reqMap.get("dbNameChs").toString());
        db.setDbBenchmark(Integer.parseInt(reqMap.get("dbBenchmark").toString()));
        db.setDbType(reqMap.get("dbType").toString());
        db.setDbDriver(reqMap.get("dbDriver").toString());
        db.setDbUrl(reqMap.get("dbUrl").toString());
        db.setDbUser(reqMap.get("dbUser").toString());
        db.setDbPass(reqMap.get("dbPass").toString());
        db.setDbCreater(reqMap.get("dbCreater").toString());
        db.setDbCreateTime(reqMap.get("dbCreateTime").toString());
        db.setDbUpdater(reqMap.get("dbUpdater").toString());
        db.setDbUpdateTime(reqMap.get("dbUpdateTime").toString());
        db.setDbNote(reqMap.get("dbNote").toString());
        
        try {
            return atmDatabaseEntityMapper.delete(db);
        } catch (Exception e) {
            return 0;
        }
    }

}
