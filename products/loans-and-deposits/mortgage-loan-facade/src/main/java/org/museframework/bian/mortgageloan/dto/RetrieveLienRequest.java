package org.museframework.bian.mortgageloan.dto;

public class RetrieveLienRequest {
    private String mortgageloanid;

    private String lienid;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }
}