package org.museframework.bian.issdevadm.dto;

public class UpdateIssuedDeviceAllocationResponse {
    private org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation issuedDeviceAllocation;

    public void setIssuedDeviceAllocation(org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation issuedDeviceAllocation) {
        this.issuedDeviceAllocation = issuedDeviceAllocation;
    }

    public org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation getIssuedDeviceAllocation() {
        return issuedDeviceAllocation;
    }
}