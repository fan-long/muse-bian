package org.museframework.bian.corporateloan.dto;

public class RetrieveDisbursementRequest {
    private String corporateloanid;

    private String disbursementid;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setDisbursementid(String disbursementid) {
        this.disbursementid = disbursementid;
    }

    public String getDisbursementid() {
        return disbursementid;
    }
}