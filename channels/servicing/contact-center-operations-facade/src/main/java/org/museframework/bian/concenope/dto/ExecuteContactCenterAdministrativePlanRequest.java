package org.museframework.bian.concenope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteContactCenterAdministrativePlanRequest {
    @MetaField
    private String contactcenteroperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan contactCenterAdministrativePlan;

    public void setContactcenteroperationsid(String contactcenteroperationsid) {
        this.contactcenteroperationsid = contactcenteroperationsid;
    }

    public String getContactcenteroperationsid() {
        return contactcenteroperationsid;
    }

    public void setContactCenterAdministrativePlan(org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan contactCenterAdministrativePlan) {
        this.contactCenterAdministrativePlan = contactCenterAdministrativePlan;
    }

    public org.museframework.bian.concenope.dto.cr.ContactCenterAdministrativePlan getContactCenterAdministrativePlan() {
        return contactCenterAdministrativePlan;
    }
}