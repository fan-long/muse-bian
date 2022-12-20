package org.museframework.bian.corporateloan.dto;

public class RequestRestructuringRequest {
    private String corporateloanid;

    private String restructuringid;

    private org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setRestructuringid(String restructuringid) {
        this.restructuringid = restructuringid;
    }

    public String getRestructuringid() {
        return restructuringid;
    }

    public void setRestructuring(org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.corporateloan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}