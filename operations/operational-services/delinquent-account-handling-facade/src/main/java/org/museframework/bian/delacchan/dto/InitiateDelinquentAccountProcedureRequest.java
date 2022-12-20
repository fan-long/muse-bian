package org.museframework.bian.delacchan.dto;

public class InitiateDelinquentAccountProcedureRequest {
    private org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure;

    public void setDelinquentAccountProcedure(org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure) {
        this.delinquentAccountProcedure = delinquentAccountProcedure;
    }

    public org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure getDelinquentAccountProcedure() {
        return delinquentAccountProcedure;
    }
}