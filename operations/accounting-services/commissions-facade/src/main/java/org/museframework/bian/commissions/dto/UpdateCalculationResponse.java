package org.museframework.bian.commissions.dto;

public class UpdateCalculationResponse {
    private org.museframework.bian.commissions.dto.bq.Calculation calculation;

    public void setCalculation(org.museframework.bian.commissions.dto.bq.Calculation calculation) {
        this.calculation = calculation;
    }

    public org.museframework.bian.commissions.dto.bq.Calculation getCalculation() {
        return calculation;
    }
}