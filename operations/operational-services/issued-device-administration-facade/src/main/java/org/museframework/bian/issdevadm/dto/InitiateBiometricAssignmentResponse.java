package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateBiometricAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment;

    public void setBiometricAssignment(org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment) {
        this.biometricAssignment = biometricAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.BiometricAssignment getBiometricAssignment() {
        return biometricAssignment;
    }
}