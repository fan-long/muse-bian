package org.museframework.bian.creditfacility.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRestructuringRequest {
    @MetaField
    private String creditfacilityid;

    @MetaField
    private String restructuringid;

    @MetaField(ref=true)
    private org.museframework.bian.creditfacility.dto.bq.Restructuring restructuring;

    public void setCreditfacilityid(String creditfacilityid) {
        this.creditfacilityid = creditfacilityid;
    }

    public String getCreditfacilityid() {
        return creditfacilityid;
    }

    public void setRestructuringid(String restructuringid) {
        this.restructuringid = restructuringid;
    }

    public String getRestructuringid() {
        return restructuringid;
    }

    public void setRestructuring(org.museframework.bian.creditfacility.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.creditfacility.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}