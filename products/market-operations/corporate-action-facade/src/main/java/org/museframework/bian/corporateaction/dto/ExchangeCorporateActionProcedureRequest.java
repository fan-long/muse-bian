package org.museframework.bian.corporateaction.dto;

public class ExchangeCorporateActionProcedureRequest {
    private String corporateactionid;

    private org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure corporateActionProcedure;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setCorporateActionProcedure(org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure corporateActionProcedure) {
        this.corporateActionProcedure = corporateActionProcedure;
    }

    public org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure getCorporateActionProcedure() {
        return corporateActionProcedure;
    }
}