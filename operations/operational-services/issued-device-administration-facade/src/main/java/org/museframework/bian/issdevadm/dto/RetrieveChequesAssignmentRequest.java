package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveChequesAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String chequesassignmentid;

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
}