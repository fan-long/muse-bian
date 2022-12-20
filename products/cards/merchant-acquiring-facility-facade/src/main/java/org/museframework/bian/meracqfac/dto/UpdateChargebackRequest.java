package org.museframework.bian.meracqfac.dto;

public class UpdateChargebackRequest {
    private String merchantacquiringfacilityid;

    private String chargebackid;

    private org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setChargebackid(String chargebackid) {
        this.chargebackid = chargebackid;
    }

    public String getChargebackid() {
        return chargebackid;
    }

    public void setChargeback(org.museframework.bian.meracqfac.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.meracqfac.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}