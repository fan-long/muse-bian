package org.museframework.bian.conadvser.dto;

public class InitiateFinancialPlanningRequest {
    private String consumeradvisoryservicesid;

    private String financialplanningid;

    private org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning;

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

    public void setFinancialPlanning(org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning) {
        this.financialPlanning = financialPlanning;
    }

    public org.museframework.bian.conadvser.dto.bq.FinancialPlanning getFinancialPlanning() {
        return financialPlanning;
    }
}