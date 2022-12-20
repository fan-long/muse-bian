package org.museframework.bian.consumerloan.dto;

public class InitiateRestructuringRequest {
    private String consumerloanid;

    private String restructuringid;

    private org.museframework.bian.consumerloan.dto.bq.Restructuring restructuring;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setRestructuringid(String restructuringid) {
        this.restructuringid = restructuringid;
    }

    public String getRestructuringid() {
        return restructuringid;
    }

    public void setRestructuring(org.museframework.bian.consumerloan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.consumerloan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}