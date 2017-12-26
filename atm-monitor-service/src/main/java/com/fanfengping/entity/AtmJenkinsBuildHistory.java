package com.fanfengping.entity;

public class AtmJenkinsBuildHistory {
    private Integer id;
    private String  buildEnv;
    private String  buildServer;
    private String  buildService;
    private String  buildDeployer;
    private String  buildVersion;
    private Integer buildStatus;
    private String  buildGitUrl;
    private String  buildGitBranch;
    private String  buildJenkinsLink;
    private String  buildTime;

    public AtmJenkinsBuildHistory() {
    }

    public AtmJenkinsBuildHistory(Integer id, String buildEnv, String buildServer, String buildService, String buildDeployer, String buildVersion,
                                  Integer buildStatus, String buildGitUrl, String buildGitBranch, String buildJenkinsLink, String buildTime) {
        this.id = id;
        this.buildEnv = buildEnv;
        this.buildServer = buildServer;
        this.buildService = buildService;
        this.buildDeployer = buildDeployer;
        this.buildVersion = buildVersion;
        this.buildStatus = buildStatus;
        this.buildGitUrl = buildGitUrl;
        this.buildGitBranch = buildGitBranch;
        this.buildJenkinsLink = buildJenkinsLink;
        this.buildTime = buildTime;
    }

    public AtmJenkinsBuildHistory(String buildEnv, String buildServer, String buildService, String buildDeployer, String buildVersion,
                                  Integer buildStatus, String buildGitUrl, String buildGitBranch, String buildJenkinsLink) {
        this.buildEnv = buildEnv;
        this.buildServer = buildServer;
        this.buildService = buildService;
        this.buildDeployer = buildDeployer;
        this.buildVersion = buildVersion;
        this.buildStatus = buildStatus;
        this.buildGitUrl = buildGitUrl;
        this.buildGitBranch = buildGitBranch;
        this.buildJenkinsLink = buildJenkinsLink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildEnv() {
        return buildEnv;
    }

    public void setBuildEnv(String buildEnv) {
        this.buildEnv = buildEnv;
    }

    public String getBuildServer() {
        return buildServer;
    }

    public void setBuildServer(String buildServer) {
        this.buildServer = buildServer;
    }

    public String getBuildService() {
        return buildService;
    }

    public void setBuildService(String buildService) {
        this.buildService = buildService;
    }

    public String getBuildDeployer() {
        return buildDeployer;
    }

    public void setBuildDeployer(String buildDeployer) {
        this.buildDeployer = buildDeployer;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    public Integer getBuildStatus() {
        return buildStatus;
    }

    public void setBuildStatus(Integer buildStatus) {
        this.buildStatus = buildStatus;
    }

    public String getBuildGitUrl() {
        return buildGitUrl;
    }

    public void setBuildGitUrl(String buildGitUrl) {
        this.buildGitUrl = buildGitUrl;
    }

    public String getBuildGitBranch() {
        return buildGitBranch;
    }

    public void setBuildGitBranch(String buildGitBranch) {
        this.buildGitBranch = buildGitBranch;
    }

    public String getBuildJenkinsLink() {
        return buildJenkinsLink;
    }

    public void setBuildJenkinsLink(String buildJenkinsLink) {
        this.buildJenkinsLink = buildJenkinsLink;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }
}
