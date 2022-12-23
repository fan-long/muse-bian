package org.museframework.bian.concenope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestContactCenterAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan contactCenterAdministrativePlan;

    public void setContactCenterAdministrativePlan(org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan contactCenterAdministrativePlan) {
        this.contactCenterAdministrativePlan = contactCenterAdministrativePlan;
    }

    public org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan getContactCenterAdministrativePlan() {
        return contactCenterAdministrativePlan;
    }
}