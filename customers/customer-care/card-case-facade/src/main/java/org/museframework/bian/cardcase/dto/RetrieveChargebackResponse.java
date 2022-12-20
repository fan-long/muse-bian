package org.museframework.bian.cardcase.dto;

public class RetrieveChargebackResponse {
    private org.museframework.bian.cardcase.dto.bq.Chargeback chargeback;

    public void setChargeback(org.museframework.bian.cardcase.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.cardcase.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}