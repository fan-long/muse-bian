package org.museframework.bian.merchandisingloan.dto;

public class InitiateSweepResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Sweep sweep;

    public void setSweep(org.museframework.bian.merchandisingloan.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Sweep getSweep() {
        return sweep;
    }
}