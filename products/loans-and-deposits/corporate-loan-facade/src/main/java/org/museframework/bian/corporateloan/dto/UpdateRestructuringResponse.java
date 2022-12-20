package org.museframework.bian.corporateloan.dto;

public class UpdateRestructuringResponse {
    private org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring;

    public void setRestructuring(org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.corporateloan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}