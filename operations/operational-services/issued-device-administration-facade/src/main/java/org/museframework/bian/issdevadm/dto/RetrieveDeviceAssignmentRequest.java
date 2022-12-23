package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDeviceAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String deviceassignmentid;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setDeviceassignmentid(String deviceassignmentid) {
        this.deviceassignmentid = deviceassignmentid;
    }

    public String getDeviceassignmentid() {
        return deviceassignmentid;
    }
}