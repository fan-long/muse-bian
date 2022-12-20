package org.museframework.bian.issdevadm.dto;

public class UpdateIssuedDeviceAllocationRequest {
    private String issueddeviceadministrationid;

    private org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation issuedDeviceAllocation;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setIssuedDeviceAllocation(org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation issuedDeviceAllocation) {
        this.issuedDeviceAllocation = issuedDeviceAllocation;
    }

    public org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation getIssuedDeviceAllocation() {
        return issuedDeviceAllocation;
    }
}