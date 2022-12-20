package org.museframework.bian.commissions.dto;

public class RetrieveCalculationRequest {
    private String commissionsid;

    private String calculationid;

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
}