package com.fanfengping.entity;

public class AtmDatabaseEntity {
    private Integer dbNo;
    private String  dbEnv;
    private String  dbNameEng;
    private String  dbNameChs;
    private Integer dbBenchmark;
    private String  dbType;
    private String  dbDriver;
    private String  dbUrl;
    private String  dbUser;
    private String  dbPass;
    private String  dbCreater;
    private String  dbCreateTime;
    private String  dbUpdater;
    private String  dbUpdateTime;
    private String  dbNote;
    
    public AtmDatabaseEntity(){}
    
    public AtmDatabaseEntity(String dbEnv, String dbNameEng, String dbNameChs, Integer dbBenchmark,
            String dbType, String dbDriver, String dbUrl, String dbUser, String dbPass, String dbCreater,
            String dbUpdater, String dbNote) {
        this.dbEnv = dbEnv;
        this.dbNameEng = dbNameEng;
        this.dbNameChs = dbNameChs;
        this.dbBenchmark = dbBenchmark;
        this.dbType = dbType;
        this.dbDriver = dbDriver;
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
        this.dbCreater = dbCreater;
        this.dbUpdater = dbUpdater;
        this.dbNote = dbNote;
    }

    public Integer getDbNo() {
        return dbNo;
    }

    public void setDbNo(Integer dbNo) {
        this.dbNo = dbNo;
    }

    public String getDbEnv() {
        return dbEnv;
    }

    public void setDbEnv(String dbEnv) {
        this.dbEnv = dbEnv;
    }

    public String getDbNameEng() {
        return dbNameEng;
    }

    public void setDbNameEng(String dbNameEng) {
        this.dbNameEng = dbNameEng;
    }

    public String getDbNameChs() {
        return dbNameChs;
    }

    public void setDbNameChs(String dbNameChs) {
        this.dbNameChs = dbNameChs;
    }

    public Integer getDbBenchmark() {
        return dbBenchmark;
    }

    public void setDbBenchmark(Integer dbBenchmark) {
        this.dbBenchmark = dbBenchmark;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
    }

    public String getDbCreater() {
        return dbCreater;
    }

    public void setDbCreater(String dbCreater) {
        this.dbCreater = dbCreater;
    }

    public String getDbCreateTime() {
        return dbCreateTime;
    }

    public void setDbCreateTime(String dbCreateTime) {
        this.dbCreateTime = dbCreateTime;
    }

    public String getDbUpdater() {
        return dbUpdater;
    }

    public void setDbUpdater(String dbUpdater) {
        this.dbUpdater = dbUpdater;
    }

    public String getDbUpdateTime() {
        return dbUpdateTime;
    }

    public void setDbUpdateTime(String dbUpdateTime) {
        this.dbUpdateTime = dbUpdateTime;
    }

    public String getDbNote() {
        return dbNote;
    }

    public void setDbNote(String dbNote) {
        this.dbNote = dbNote;
    }
    
}
