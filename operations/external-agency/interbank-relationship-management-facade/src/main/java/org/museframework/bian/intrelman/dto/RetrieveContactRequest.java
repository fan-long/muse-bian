package org.museframework.bian.intrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveContactRequest {
    @MetaField
    private String interbankrelationshipmanagementid;

    @MetaField
    private String contactid;

    public void setInterbankrelationshipmanagementid(String interbankrelationshipmanagementid) {
        this.interbankrelationshipmanagementid = interbankrelationshipmanagementid;
    }

    public String getInterbankrelationshipmanagementid() {
        return interbankrelationshipmanagementid;
    }

    public void setContactid(String contactid) {
        this.contactid = contactid;
    }

    public String getContactid() {
        return contactid;
    }
}