package org.museframework.bian.conadvser.dto;

public class RetrieveFinancialPlanningRequest {
    private String consumeradvisoryservicesid;

    private String financialplanningid;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setFinancialplanningid(String financialplanningid) {
        this.financialplanningid = financialplanningid;
    }

    public String getFinancialplanningid() {
        return financialplanningid;
    }
}