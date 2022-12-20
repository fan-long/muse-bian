package org.museframework.bian.atmnetope.dto;

public class RequestCashDistributionResponse {
    private org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution;

    public void setCashDistribution(org.museframework.bian.atmnetope.dto.bq.CashDistribution cashDistribution) {
        this.cashDistribution = cashDistribution;
    }

    public org.museframework.bian.atmnetope.dto.bq.CashDistribution getCashDistribution() {
        return cashDistribution;
    }
}