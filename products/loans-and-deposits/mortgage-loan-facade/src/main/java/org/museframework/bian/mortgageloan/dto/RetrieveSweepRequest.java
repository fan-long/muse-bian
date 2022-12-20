package org.museframework.bian.mortgageloan.dto;

public class RetrieveSweepRequest {
    private String mortgageloanid;

    private String sweepid;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setSweepid(String sweepid) {
        this.sweepid = sweepid;
    }

    public String getSweepid() {
        return sweepid;
    }
}