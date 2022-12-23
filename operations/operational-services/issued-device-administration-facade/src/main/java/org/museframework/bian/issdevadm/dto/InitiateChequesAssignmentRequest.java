package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateChequesAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String chequesassignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setChequesassignmentid(String chequesassignmentid) {
        this.chequesassignmentid = chequesassignmentid;
    }

    public String getChequesassignmentid() {
        return chequesassignmentid;
    }

    public void setChequesAssignment(org.museframework.bian.issdevadm.dto.bq.ChequesAssignment chequesAssignment) {
        this.chequesAssignment = chequesAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.ChequesAssignment getChequesAssignment() {
        return chequesAssignment;
    }
}