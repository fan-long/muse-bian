package org.museframework.bian.leasing.dto;

public class UpdateSweepRequest {
    private String leasingid;

    private String sweepid;

    private org.museframework.bian.leasing.dto.bq.Sweep sweep;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setSweepid(String sweepid) {
        this.sweepid = sweepid;
    }

    public String getSweepid() {
        return sweepid;
    }

    public void setSweep(org.museframework.bian.leasing.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.leasing.dto.bq.Sweep getSweep() {
        return sweep;
    }
}