package org.museframework.bian.leasing.dto;

public class RetrieveLienRequest {
    private String leasingid;

    private String lienid;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }
}