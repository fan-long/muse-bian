package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFacilityApplicationRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String facilityapplicationid;

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
}