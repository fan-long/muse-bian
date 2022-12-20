package org.museframework.bian.mortgageloan.dto;

public class InitiateSweepRequest {
    private String mortgageloanid;

    private String sweepid;

    private org.museframework.bian.mortgageloan.dto.bq.Sweep sweep;

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

    public void setSweep(org.museframework.bian.mortgageloan.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Sweep getSweep() {
        return sweep;
    }
}