package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyLockBoxFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chelocbox.dto.cr.LockBoxFacility lockBoxFacility;

    public void setLockBoxFacility(org.museframework.bian.chelocbox.dto.cr.LockBoxFacility lockBoxFacility) {
        this.lockBoxFacility = lockBoxFacility;
    }

    public org.museframework.bian.chelocbox.dto.cr.LockBoxFacility getLockBoxFacility() {
        return lockBoxFacility;
    }
}