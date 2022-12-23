package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestIssuedDeviceRequest {
    @MetaField
    private String savingsaccountid;

    @MetaField
    private String issueddeviceid;

    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.savingsaccount.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}