package org.museframework.bian.corporateaction.dto;

public class InitiateCorporateActionProcedureResponse {
    private org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure corporateActionProcedure;

    public void setCorporateActionProcedure(org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure corporateActionProcedure) {
        this.corporateActionProcedure = corporateActionProcedure;
    }

    public org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure getCorporateActionProcedure() {
        return corporateActionProcedure;
    }
}