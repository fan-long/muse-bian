package org.museframework.bian.mortgageloan.dto;

public class ExchangeSweepResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Sweep sweep;

    public void setSweep(org.museframework.bian.mortgageloan.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Sweep getSweep() {
        return sweep;
    }
}