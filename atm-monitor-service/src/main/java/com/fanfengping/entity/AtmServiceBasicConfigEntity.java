package com.fanfengping.entity;

public class AtmServiceBasicConfigEntity {
    private Integer no;
    private String  serviceNameEng;
    private String  serviceNameChs;
    private String  serviceType;
    private Integer servicePort;
    private String serviceGitUrl;
    private String  serviceAggregateHome;
    private String  serviceWarName;
    private String  serviceWarFile;
    private String  serviceManager;
    private String  serviceNote;
    private String  serviceUpdateTime;

    public AtmServiceBasicConfigEntity() {
    }

    public AtmServiceBasicConfigEntity(String serviceNameEng, String serviceNameChs, String serviceType, Integer servicePort, String serviceGitUrl,
                                       String serviceAggregateHome, String serviceWarName, String serviceWarFile, String serviceManager,
                                       String serviceNote) {
        this.serviceNameEng = serviceNameEng;
        this.serviceNameChs = serviceNameChs;
        this.serviceType = serviceType;
        this.servicePort = servicePort;
        this.serviceGitUrl = serviceGitUrl;
        this.serviceAggregateHome = serviceAggregateHome;
        this.serviceWarName = serviceWarName;
        this.serviceWarFile = serviceWarFile;
        this.serviceManager = serviceManager;
        this.serviceNote = serviceNote;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getServicePort() {
        return servicePort;
    }

    public void setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
    }

    public String getServiceGitUrl() {
        return serviceGitUrl;
    }

    public void setServiceGitUrl(String serviceGitUrl) {
        this.serviceGitUrl = serviceGitUrl;
    }

    public String getServiceAggregateHome() {
        return serviceAggregateHome;
    }

    public void setServiceAggregateHome(String serviceAggregateHome) {
        this.serviceAggregateHome = serviceAggregateHome;
    }

    public String getServiceWarName() {
        return serviceWarName;
    }

    public void setServiceWarName(String serviceWarName) {
        this.serviceWarName = serviceWarName;
    }

    public String getServiceWarFile() {
        return serviceWarFile;
    }

    public void setServiceWarFile(String serviceWarFile) {
        this.serviceWarFile = serviceWarFile;
    }

    public String getServiceManager() {
        return serviceManager;
    }

    public void setServiceManager(String serviceManager) {
        this.serviceManager = serviceManager;
    }

    public String getServiceNote() {
        return serviceNote;
    }

    public void setServiceNote(String serviceNote) {
        this.serviceNote = serviceNote;
    }

    public String getServiceUpdateTime() {
        return serviceUpdateTime;
    }

    public void setServiceUpdateTime(String serviceUpdateTime) {
        this.serviceUpdateTime = serviceUpdateTime;
    }
}
