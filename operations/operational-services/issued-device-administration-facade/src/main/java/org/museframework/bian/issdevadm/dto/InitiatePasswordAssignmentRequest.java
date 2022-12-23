package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiatePasswordAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String passwordassignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment;

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

    public void setPasswordAssignment(org.museframework.bian.issdevadm.dto.bq.PasswordAssignment passwordAssignment) {
        this.passwordAssignment = passwordAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.PasswordAssignment getPasswordAssignment() {
        return passwordAssignment;
    }
}