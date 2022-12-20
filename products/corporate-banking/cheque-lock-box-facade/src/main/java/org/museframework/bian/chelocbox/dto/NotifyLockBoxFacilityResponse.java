package org.museframework.bian.chelocbox.dto;

public class NotifyLockBoxFacilityResponse {
    private org.museframework.bian.chelocbox.dto.cr.LockBoxFacility lockBoxFacility;

    public void setLockBoxFacility(org.museframework.bian.chelocbox.dto.cr.LockBoxFacility lockBoxFacility) {
        this.lockBoxFacility = lockBoxFacility;
    }

    public org.museframework.bian.chelocbox.dto.cr.LockBoxFacility getLockBoxFacility() {
        return lockBoxFacility;
    }
}