package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCorporateActionProcedureRequest {
    @MetaField
    private String corporateactionid;

    @MetaField(ref=true)
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