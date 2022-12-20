package org.museframework.bian.chaactana.dto;

public class RetrieveDeviceErrorResponse {
    private org.museframework.bian.chaactana.dto.bq.DeviceError deviceError;

    public void setDeviceError(org.museframework.bian.chaactana.dto.bq.DeviceError deviceError) {
        this.deviceError = deviceError;
    }

    public org.museframework.bian.chaactana.dto.bq.DeviceError getDeviceError() {
        return deviceError;
    }
}