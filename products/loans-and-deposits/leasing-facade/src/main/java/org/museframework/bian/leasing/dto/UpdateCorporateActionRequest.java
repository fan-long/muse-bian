package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCorporateActionRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String corporateactionid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setCorporateAction(org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.leasing.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}