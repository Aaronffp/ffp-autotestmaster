package com.fanfengping.entity;

public class AtmDeployServiceInfoEntity {
    private Integer no;
    private String env;
    private String serviceNameEng;
    private String serviceNameChs;
    private String serviceUrl;
    private String serviceUser;
    private String servicePass;
    private String serviceUpdater;
    private String serviceUpdateTime;
    private String serviceNote;

    public AtmDeployServiceInfoEntity() {
    }

    public AtmDeployServiceInfoEntity(String env, String serviceNameEng, String serviceNameChs, String serviceUrl, 
            String serviceUser, String servicePass, String serviceUpdater, String serviceNote) {
        this.env = env;
        this.serviceNameEng = serviceNameEng;
        this.serviceNameChs = serviceNameChs;
        this.serviceUrl = serviceUrl;
        this.serviceUser = serviceUser;
        this.servicePass = servicePass;
        this.serviceUpdater = serviceUpdater;
        this.serviceNote = serviceNote;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getServiceNameEng() {
        return serviceNameEng;
    }

    public void setServiceNameEng(String serviceNameEng) {
        this.serviceNameEng = serviceNameEng;
    }

    public String getServiceNameChs() {
        return serviceNameChs;
    }

    public void setServiceNameChs(String serviceNameChs) {
        this.serviceNameChs = serviceNameChs;
    }


    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceUser() {
        return serviceUser;
    }

    public void setServiceUser(String serviceUser) {
        this.serviceUser = serviceUser;
    }

    public String getServicePass() {
        return servicePass;
    }

    public void setServicePass(String servicePass) {
        this.servicePass = servicePass;
    }

    public String getServiceUpdater() {
        return serviceUpdater;
    }

    public void setServiceUpdater(String serviceUpdater) {
        this.serviceUpdater = serviceUpdater;
    }

    public String getServiceUpdateTime() {
        return serviceUpdateTime;
    }

    public void setServiceUpdateTime(String serviceUpdateTime) {
        this.serviceUpdateTime = serviceUpdateTime;
    }

    public String getServiceNote() {
        return serviceNote;
    }

    public void setServiceNote(String serviceNote) {
        this.serviceNote = serviceNote;
    }
}
