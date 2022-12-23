package org.museframework.bian.concenman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestContactCenterManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan contactCenterManagementPlan;

    public void setContactCenterManagementPlan(org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan contactCenterManagementPlan) {
        this.contactCenterManagementPlan = contactCenterManagementPlan;
    }

    public org.museframework.bian.concenman.dto.cr.ContactCenterManagementPlan getContactCenterManagementPlan() {
        return contactCenterManagementPlan;
    }
}