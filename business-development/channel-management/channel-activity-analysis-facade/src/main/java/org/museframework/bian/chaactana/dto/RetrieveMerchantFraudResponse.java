package org.museframework.bian.chaactana.dto;

public class RetrieveMerchantFraudResponse {
    private org.museframework.bian.chaactana.dto.bq.MerchantFraud merchantFraud;

    public void setMerchantFraud(org.museframework.bian.chaactana.dto.bq.MerchantFraud merchantFraud) {
        this.merchantFraud = merchantFraud;
    }

    public org.museframework.bian.chaactana.dto.bq.MerchantFraud getMerchantFraud() {
        return merchantFraud;
    }
}