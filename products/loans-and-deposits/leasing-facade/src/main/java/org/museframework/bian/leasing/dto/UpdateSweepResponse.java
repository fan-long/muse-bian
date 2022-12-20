package org.museframework.bian.leasing.dto;

public class UpdateSweepResponse {
    private org.museframework.bian.leasing.dto.bq.Sweep sweep;

    public void setSweep(org.museframework.bian.leasing.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.leasing.dto.bq.Sweep getSweep() {
        return sweep;
    }
}