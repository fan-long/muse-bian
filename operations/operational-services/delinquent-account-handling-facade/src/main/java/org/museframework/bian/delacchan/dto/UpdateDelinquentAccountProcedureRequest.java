package org.museframework.bian.delacchan.dto;

public class UpdateDelinquentAccountProcedureRequest {
    private String delinquentaccounthandlingid;

    private org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setDelinquentAccountProcedure(org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure) {
        this.delinquentAccountProcedure = delinquentAccountProcedure;
    }

    public org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure getDelinquentAccountProcedure() {
        return delinquentAccountProcedure;
    }
}