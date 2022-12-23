package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFacilityApplicationRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String facilityapplicationid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setFacilityapplicationid(String facilityapplicationid) {
        this.facilityapplicationid = facilityapplicationid;
    }

    public String getFacilityapplicationid() {
        return facilityapplicationid;
    }

    public void setFacilityApplication(org.museframework.bian.customeroffer.dto.bq.FacilityApplication facilityApplication) {
        this.facilityApplication = facilityApplication;
    }

    public org.museframework.bian.customeroffer.dto.bq.FacilityApplication getFacilityApplication() {
        return facilityApplication;
    }
}