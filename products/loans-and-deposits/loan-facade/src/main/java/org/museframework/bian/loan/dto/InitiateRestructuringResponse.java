package org.museframework.bian.loan.dto;

public class InitiateRestructuringResponse {
    private org.museframework.bian.loan.dto.bq.Restructuring restructuring;

    public void setRestructuring(org.museframework.bian.loan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.loan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}