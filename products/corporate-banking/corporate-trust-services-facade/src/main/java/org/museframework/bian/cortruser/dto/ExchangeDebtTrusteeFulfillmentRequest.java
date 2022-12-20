package org.museframework.bian.cortruser.dto;

public class ExchangeDebtTrusteeFulfillmentRequest {
    private String corporatetrustservicesid;

    private String debttrusteefulfillmentid;

    private org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment debtTrusteeFulfillment;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setDebttrusteefulfillmentid(String debttrusteefulfillmentid) {
        this.debttrusteefulfillmentid = debttrusteefulfillmentid;
    }

    public String getDebttrusteefulfillmentid() {
        return debttrusteefulfillmentid;
    }

    public void setDebtTrusteeFulfillment(org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment debtTrusteeFulfillment) {
        this.debtTrusteeFulfillment = debtTrusteeFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.DebtTrusteeFulfillment getDebtTrusteeFulfillment() {
        return debtTrusteeFulfillment;
    }
}