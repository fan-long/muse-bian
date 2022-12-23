package org.museframework.bian.concenman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestContactCenterManagementPlanRequest {
    @MetaField
    private String contactcentermanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan contactCenterManagementPlan;

    public void setContactcentermanagementid(String contactcentermanagementid) {
        this.contactcentermanagementid = contactcentermanagementid;
    }

    public String getContactcentermanagementid() {
        return contactcentermanagementid;
    }

    public void setContactCenterManagementPlan(org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan contactCenterManagementPlan) {
        this.contactCenterManagementPlan = contactCenterManagementPlan;
    }

    public org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan getContactCenterManagementPlan() {
        return contactCenterManagementPlan;
    }
}