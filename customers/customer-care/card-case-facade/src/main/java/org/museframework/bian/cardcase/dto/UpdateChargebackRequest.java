package org.museframework.bian.cardcase.dto;

public class UpdateChargebackRequest {
    private String cardcaseid;

    private String chargebackid;

    private org.museframework.bian.cardcase.dto.bq.Chargeback chargeback;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setChargebackid(String chargebackid) {
        this.chargebackid = chargebackid;
    }

    public String getChargebackid() {
        return chargebackid;
    }

    public void setChargeback(org.museframework.bian.cardcase.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.cardcase.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}