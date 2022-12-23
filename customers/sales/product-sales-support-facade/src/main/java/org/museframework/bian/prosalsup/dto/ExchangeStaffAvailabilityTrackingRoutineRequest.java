package org.museframework.bian.prosalsup.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeStaffAvailabilityTrackingRoutineRequest {
    @MetaField
    private String productsalessupportid;

    @MetaField
    private String staffavailabilitytrackingroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine staffAvailabilityTrackingRoutine;

    public void setProductsalessupportid(String productsalessupportid) {
        this.productsalessupportid = productsalessupportid;
    }

    public String getProductsalessupportid() {
        return productsalessupportid;
    }

    public void setStaffavailabilitytrackingroutineid(String staffavailabilitytrackingroutineid) {
        this.staffavailabilitytrackingroutineid = staffavailabilitytrackingroutineid;
    }

    public String getStaffavailabilitytrackingroutineid() {
        return staffavailabilitytrackingroutineid;
    }

    public void setStaffAvailabilityTrackingRoutine(org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine staffAvailabilityTrackingRoutine) {
        this.staffAvailabilityTrackingRoutine = staffAvailabilityTrackingRoutine;
    }

    public org.museframework.bian.prosalsup.dto.bq.StaffAvailabilityTrackingRoutine getStaffAvailabilityTrackingRoutine() {
        return staffAvailabilityTrackingRoutine;
    }
}