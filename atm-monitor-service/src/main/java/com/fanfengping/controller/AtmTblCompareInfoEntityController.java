package com.fanfengping.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fanfengping.entity.AtmDatabaseEntity;
import com.fanfengping.entity.AtmTblCompareInfoEntity;
import com.fanfengping.mapper.AtmDatabaseEntityMapper;
import com.fanfengping.mapper.AtmTblCompareInfoEntityMapper;
import com.fanfengping.service.DbMysqlService;

@RestController
public class AtmTblCompareInfoEntityController {
    @Autowired
    AtmDatabaseEntityMapper atmDatabaseEntityMapper;
    
    @Autowired
    AtmTblCompareInfoEntityMapper atmTblCompareInfoEntityMapper;
    
    @Autowired
    DbMysqlService dbMysqlService;
    
    @RequestMapping(value = { "/db/compare", "/db/compare/" }, 
            method = { RequestMethod.POST }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String compare() throws SQLException {
        List<AtmDatabaseEntity> dbs = atmDatabaseEntityMapper.findDbBenchmark();
        
        if (dbs.size() < 1) {
            return "{\"result\":\"fail\"}";
        }
        
        for (int i = 0; i < dbs.size(); i++) {
            AtmDatabaseEntity ds = dbs.get(i);
            
            List<AtmDatabaseEntity> dbt = atmDatabaseEntityMapper.findByDbNameEng(ds.getDbNameEng());
            
            if (dbt.size() < 1) {
                continue;
            }
            
            // 清空比对结果信息
            atmTblCompareInfoEntityMapper.clean();
            
            for (int j = 0; j < dbt.size(); j++) {
                AtmDatabaseEntity dt = dbt.get(j);
                
                String timestamp = String.valueOf(System.currentTimeMillis());
                
                AtmTblCompareInfoEntity atmTblCompareInfoEntity = new AtmTblCompareInfoEntity(timestamp, 0, ds.getDbNameEng(), ds.getDbNo(), ds.getDbEnv(), ds.getDbUrl(), dt.getDbNo(), dt.getDbEnv(), dt.getDbUrl(), "开始比对数据库...", "");
                
                atmTblCompareInfoEntityMapper.add(atmTblCompareInfoEntity);
                System.out.println(String.format("[基准库：%s - 比对库：%s] - 开始比对数据库...", dbs.get(i).getDbUrl(), dbt.get(j).getDbUrl()));
                
                dbMysqlService.compareAllTables(dbs.get(i), dbt.get(j), timestamp);
                System.out.println(String.format("[基准库：%s - 比对库：%s] - 结束比对数据库...", dbs.get(i).getDbUrl(), dbt.get(j).getDbUrl()));
            }
        }
        
        return "{\"result\":\"success\"}";
    }
    
    @RequestMapping(value = { "/db/compare", "/db/compare/" }, 
            method = { RequestMethod.GET }, 
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<AtmTblCompareInfoEntity> search(@RequestParam("eng") String eng, @RequestParam("status") String status, @RequestParam("env") String env) throws SQLException {
        return atmTblCompareInfoEntityMapper.search(eng, status, env);
    }

}
