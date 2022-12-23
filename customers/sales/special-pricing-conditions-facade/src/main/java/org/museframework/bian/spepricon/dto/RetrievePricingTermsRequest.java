package org.museframework.bian.spepricon.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePricingTermsRequest {
    @MetaField
    private String specialpricingconditionsid;

    @MetaField
    private String pricingtermsid;

    public void setSpecialpricingconditionsid(String specialpricingconditionsid) {
        this.specialpricingconditionsid = specialpricingconditionsid;
    }

    public String getSpecialpricingconditionsid() {
        return specialpricingconditionsid;
    }

    public void setPricingtermsid(String pricingtermsid) {
        this.pricingtermsid = pricingtermsid;
    }

    public String getPricingtermsid() {
        return pricingtermsid;
    }
}