package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureTokenAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String tokenassignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setTokenassignmentid(String tokenassignmentid) {
        this.tokenassignmentid = tokenassignmentid;
    }

    public String getTokenassignmentid() {
        return tokenassignmentid;
    }

    public void setTokenAssignment(org.museframework.bian.issdevadm.dto.bq.TokenAssignment tokenAssignment) {
        this.tokenAssignment = tokenAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.TokenAssignment getTokenAssignment() {
        return tokenAssignment;
    }
}