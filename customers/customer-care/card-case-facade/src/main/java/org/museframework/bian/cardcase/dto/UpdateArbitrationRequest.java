package org.museframework.bian.cardcase.dto;

public class UpdateArbitrationRequest {
    private String cardcaseid;

    private String arbitrationid;

    private org.museframework.bian.cardcase.dto.bq.Arbitration arbitration;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setArbitrationid(String arbitrationid) {
        this.arbitrationid = arbitrationid;
    }

    public String getArbitrationid() {
        return arbitrationid;
    }

    public void setArbitration(org.museframework.bian.cardcase.dto.bq.Arbitration arbitration) {
        this.arbitration = arbitration;
    }

    public org.museframework.bian.cardcase.dto.bq.Arbitration getArbitration() {
        return arbitration;
    }
}