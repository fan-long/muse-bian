package org.museframework.bian.merchandisingloan.dto;

public class ExchangeSweepRequest {
    private String merchandisingloanid;

    private String sweepid;

    private org.museframework.bian.merchandisingloan.dto.bq.Sweep sweep;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setSweepid(String sweepid) {
        this.sweepid = sweepid;
    }

    public String getSweepid() {
        return sweepid;
    }

    public void setSweep(org.museframework.bian.merchandisingloan.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Sweep getSweep() {
        return sweep;
    }
}