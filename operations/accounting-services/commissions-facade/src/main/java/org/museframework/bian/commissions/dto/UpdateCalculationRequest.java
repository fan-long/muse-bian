package org.museframework.bian.commissions.dto;

public class UpdateCalculationRequest {
    private String commissionsid;

    private String calculationid;

    private org.museframework.bian.commissions.dto.bq.Calculation calculation;

    public void setCommissionsid(String commissionsid) {
        this.commissionsid = commissionsid;
    }

    public String getCommissionsid() {
        return commissionsid;
    }

    public void setCalculationid(String calculationid) {
        this.calculationid = calculationid;
    }

    public String getCalculationid() {
        return calculationid;
    }

    public void setCalculation(org.museframework.bian.commissions.dto.bq.Calculation calculation) {
        this.calculation = calculation;
    }

    public org.museframework.bian.commissions.dto.bq.Calculation getCalculation() {
        return calculation;
    }
}