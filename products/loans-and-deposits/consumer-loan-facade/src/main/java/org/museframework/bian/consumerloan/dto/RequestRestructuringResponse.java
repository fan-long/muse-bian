package org.museframework.bian.consumerloan.dto;

public class RequestRestructuringResponse {
    private org.museframework.bian.consumerloan.dto.bq.Restructuring restructuring;

    public void setRestructuring(org.museframework.bian.consumerloan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.consumerloan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}