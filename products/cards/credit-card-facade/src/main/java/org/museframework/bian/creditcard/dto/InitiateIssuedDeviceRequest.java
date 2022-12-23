package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateIssuedDeviceRequest {
    @MetaField
    private String creditcardid;

    @MetaField
    private String issueddeviceid;

    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.creditcard.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}