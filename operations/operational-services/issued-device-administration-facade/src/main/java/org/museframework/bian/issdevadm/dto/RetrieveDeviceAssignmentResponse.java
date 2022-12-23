package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDeviceAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.DeviceAssignment deviceAssignment;

    public void setDeviceAssignment(org.museframework.bian.issdevadm.dto.bq.DeviceAssignment deviceAssignment) {
        this.deviceAssignment = deviceAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.DeviceAssignment getDeviceAssignment() {
        return deviceAssignment;
    }
}