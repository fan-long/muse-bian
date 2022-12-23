package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePasswordAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String passwordassignmentid;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setPasswordassignmentid(String passwordassignmentid) {
        this.passwordassignmentid = passwordassignmentid;
    }

    public String getPasswordassignmentid() {
        return passwordassignmentid;
    }
}