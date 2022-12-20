package org.museframework.bian.chelocbox.dto;

public class RetrieveLockBoxFacilityResponse {
    private org.museframework.bian.chelocbox.dto.cr.LockBoxFacility lockBoxFacility;

    public void setLockBoxFacility(org.museframework.bian.chelocbox.dto.cr.LockBoxFacility lockBoxFacility) {
        this.lockBoxFacility = lockBoxFacility;
    }

    public org.museframework.bian.chelocbox.dto.cr.LockBoxFacility getLockBoxFacility() {
        return lockBoxFacility;
    }
}