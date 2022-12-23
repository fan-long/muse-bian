package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveReaderAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String readerassignmentid;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setReaderassignmentid(String readerassignmentid) {
        this.readerassignmentid = readerassignmentid;
    }

    public String getReaderassignmentid() {
        return readerassignmentid;
    }
}