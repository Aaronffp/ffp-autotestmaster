package com.fanfengping.entity;

import java.util.Date;

public class AtmTblCompareInfoEntity {
    private Integer tblCompNo;
    private String  tblCompFlag;
    private Integer tblCompResult;
    private String  tblCompNameEng;
    private Integer tblCompBenchmarkNo;
    private String  tblCompBenchmarkEnv;
    private String  tblCompBenchmarkUrl;
    private Integer tblCompTargetNo;
    private String  tblCompTargetEnv;
    private String  tblCompTargetUrl;
    private String  tblCompInfo;
    private String  tblCompNote;
    private Date    tblCompTime;
    
    public AtmTblCompareInfoEntity() {}

    public AtmTblCompareInfoEntity(String tblCompFlag, Integer tblCompResult, String tblCompNameEng, Integer tblCompBenchmarkNo,
            String tblCompBenchmarkEnv, String tblCompBenchmarkUrl, Integer tblCompTargetNo, String tblCompTargetEnv,
            String tblCompTargetUrl, String tblCompInfo, String tblCompNote) {
        this.tblCompFlag = tblCompFlag;
        this.tblCompResult = tblCompResult;
        this.tblCompNameEng = tblCompNameEng;
        this.tblCompBenchmarkNo = tblCompBenchmarkNo;
        this.tblCompBenchmarkEnv = tblCompBenchmarkEnv;
        this.tblCompBenchmarkUrl = tblCompBenchmarkUrl;
        this.tblCompTargetNo = tblCompTargetNo;
        this.tblCompTargetEnv = tblCompTargetEnv;
        this.tblCompTargetUrl = tblCompTargetUrl;
        this.tblCompInfo = tblCompInfo;
        this.tblCompNote = tblCompNote;
    }

    public Integer getTblCompNo() {
        return tblCompNo;
    }

    public void setTblCompNo(Integer tblCompNo) {
        this.tblCompNo = tblCompNo;
    }

    public String getTblCompFlag() {
        return tblCompFlag;
    }

    public void setTblCompFlag(String tblCompFlag) {
        this.tblCompFlag = tblCompFlag;
    }

    public Integer getTblCompResult() {
        return tblCompResult;
    }

    public void setTblCompResult(Integer tblCompResult) {
        this.tblCompResult = tblCompResult;
    }

    public String getTblCompNameEng() {
        return tblCompNameEng;
    }

    public void setTblCompNameEng(String tblCompNameEng) {
        this.tblCompNameEng = tblCompNameEng;
    }

    public Integer getTblCompBenchmarkNo() {
        return tblCompBenchmarkNo;
    }

    public void setTblCompBenchmarkNo(Integer tblCompBenchmarkNo) {
        this.tblCompBenchmarkNo = tblCompBenchmarkNo;
    }

    public String getTblCompBenchmarkEnv() {
        return tblCompBenchmarkEnv;
    }

    public void setTblCompBenchmarkEnv(String tblCompBenchmarkEnv) {
        this.tblCompBenchmarkEnv = tblCompBenchmarkEnv;
    }

    public String getTblCompBenchmarkUrl() {
        return tblCompBenchmarkUrl;
    }

    public void setTblCompBenchmarkUrl(String tblCompBenchmarkUrl) {
        this.tblCompBenchmarkUrl = tblCompBenchmarkUrl;
    }

    public Integer getTblCompTargetNo() {
        return tblCompTargetNo;
    }

    public void setTblCompTargetNo(Integer tblCompTargetNo) {
        this.tblCompTargetNo = tblCompTargetNo;
    }

    public String getTblCompTargetEnv() {
        return tblCompTargetEnv;
    }

    public void setTblCompTargetEnv(String tblCompTargetEnv) {
        this.tblCompTargetEnv = tblCompTargetEnv;
    }

    public String getTblCompTargetUrl() {
        return tblCompTargetUrl;
    }

    public void setTblCompTargetUrl(String tblCompTargetUrl) {
        this.tblCompTargetUrl = tblCompTargetUrl;
    }

    public String getTblCompInfo() {
        return tblCompInfo;
    }

    public void setTblCompInfo(String tblCompInfo) {
        this.tblCompInfo = tblCompInfo;
    }

    public String getTblCompNote() {
        return tblCompNote;
    }

    public void setTblCompNote(String tblCompNote) {
        this.tblCompNote = tblCompNote;
    }

    public Date getTblCompTime() {
        return tblCompTime;
    }

    public void setTblCompTime(Date tblCompTime) {
        this.tblCompTime = tblCompTime;
    }
    
}
