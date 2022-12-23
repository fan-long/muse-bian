package org.museframework.bian.prosalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeStaffAssignmentRoutineRequest {
    @MetaField
    private String productsalessupportid;

    @MetaField
    private String staffassignmentroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine staffAssignmentRoutine;

    public void setProductsalessupportid(String productsalessupportid) {
        this.productsalessupportid = productsalessupportid;
    }

    public String getProductsalessupportid() {
        return productsalessupportid;
    }

    public void setStaffassignmentroutineid(String staffassignmentroutineid) {
        this.staffassignmentroutineid = staffassignmentroutineid;
    }

    public String getStaffassignmentroutineid() {
        return staffassignmentroutineid;
    }

    public void setStaffAssignmentRoutine(org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine staffAssignmentRoutine) {
        this.staffAssignmentRoutine = staffAssignmentRoutine;
    }

    public org.museframework.bian.prosalsup.dto.bq.StaffAssignmentRoutine getStaffAssignmentRoutine() {
        return staffAssignmentRoutine;
    }
}