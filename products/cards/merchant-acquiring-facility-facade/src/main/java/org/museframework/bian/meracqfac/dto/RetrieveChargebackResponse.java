package org.museframework.bian.meracqfac.dto;

public class RetrieveChargebackResponse {
    private org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback;

    public void setChargeback(org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.meracqfac.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}