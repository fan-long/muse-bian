package org.museframework.bian.termdeposit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateIssuedDeviceRequest {
    @MetaField
    private String termdepositid;

    @MetaField
    private String issueddeviceid;

    @MetaField(ref=true)
    private org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.termdeposit.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}