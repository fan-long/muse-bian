package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBiometricAssignmentRequest {
    @MetaField
    private String issueddeviceadministrationid;

    @MetaField
    private String biometricassignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment;

    public void setIssueddeviceadministrationid(String issueddeviceadministrationid) {
        this.issueddeviceadministrationid = issueddeviceadministrationid;
    }

    public String getIssueddeviceadministrationid() {
        return issueddeviceadministrationid;
    }

    public void setBiometricassignmentid(String biometricassignmentid) {
        this.biometricassignmentid = biometricassignmentid;
    }

    public String getBiometricassignmentid() {
        return biometricassignmentid;
    }

    public void setBiometricAssignment(org.museframework.bian.issdevadm.dto.bq.BiometricAssignment biometricAssignment) {
        this.biometricAssignment = biometricAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.BiometricAssignment getBiometricAssignment() {
        return biometricAssignment;
    }
}