package org.museframework.bian.cardcase.dto;

public class UpdateArbitrationResponse {
    private org.museframework.bian.cardcase.dto.bq.Arbitration arbitration;

    public void setArbitration(org.museframework.bian.cardcase.dto.bq.Arbitration arbitration) {
        this.arbitration = arbitration;
    }

    public org.museframework.bian.cardcase.dto.bq.Arbitration getArbitration() {
        return arbitration;
    }
}