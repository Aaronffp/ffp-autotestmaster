package com.fanfengping.entity;

public class AtmServiceBasicConfigEntity {
    private Integer no;
    private String  serviceNameEng;
    private String  serviceNameChs;
    private String  serviceType;
    private Integer servicePort;
    private Integer servicePortDubbo;
    private String  serviceContext;
    private String  servicePathDeploy;
    private String  servicePathLog;
    private String  servicePathData;
    private String  servicePathTemp;
    private String  serviceManager;
    private String  serviceNote;
    private String  serviceUpdateTime;

    public AtmServiceBasicConfigEntity() {
    }

    public AtmServiceBasicConfigEntity(String serviceNameEng, String serviceNameChs, String serviceType, Integer servicePort, String serviceContext,
                                       String servicePathDeploy, String servicePathLog, String servicePathData, String servicePathTemp,
                                       String serviceManager, String serviceNote) {
        this.serviceNameEng = serviceNameEng;
        this.serviceNameChs = serviceNameChs;
        this.serviceType = serviceType;
        this.servicePort = servicePort;
        this.servicePortDubbo = servicePort + 20000;
        this.serviceContext = serviceContext;
        this.servicePathDeploy = servicePathDeploy;
        this.servicePathLog = servicePathLog;
        this.servicePathData = servicePathData;
        this.servicePathTemp = servicePathTemp;
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
        this.servicePortDubbo = servicePort + 20000;
    }

    public Integer getServicePortDubbo() {
        return servicePortDubbo;
    }

    public void setServicePortDubbo(Integer servicePortDubbo) {
        this.servicePortDubbo = servicePortDubbo;
    }

    public String getServiceContext() {
        return serviceContext;
    }

    public void setServiceContext(String serviceContext) {
        this.serviceContext = serviceContext;
    }

    public String getServicePathDeploy() {
        return servicePathDeploy;
    }

    public void setServicePathDeploy(String servicePathDeploy) {
        this.servicePathDeploy = servicePathDeploy;
    }

    public String getServicePathLog() {
        return servicePathLog;
    }

    public void setServicePathLog(String servicePathLog) {
        this.servicePathLog = servicePathLog;
    }

    public String getServicePathData() {
        return servicePathData;
    }

    public void setServicePathData(String servicePathData) {
        this.servicePathData = servicePathData;
    }

    public String getServicePathTemp() {
        return servicePathTemp;
    }

    public void setServicePathTemp(String servicePathTemp) {
        this.servicePathTemp = servicePathTemp;
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
