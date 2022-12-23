package org.museframework.bian.dirdebman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMandateRegistrationRequest {
    @MetaField
    private String directdebitmandateid;

    @MetaField
    private String mandateregistrationid;

    public void setDirectdebitmandateid(String directdebitmandateid) {
        this.directdebitmandateid = directdebitmandateid;
    }

    public String getDirectdebitmandateid() {
        return directdebitmandateid;
    }

    public void setMandateregistrationid(String mandateregistrationid) {
        this.mandateregistrationid = mandateregistrationid;
    }

    public String getMandateregistrationid() {
        return mandateregistrationid;
    }
}