package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateUnderwritingRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String underwritingid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Underwriting underwriting;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setUnderwritingid(String underwritingid) {
        this.underwritingid = underwritingid;
    }

    public String getUnderwritingid() {
        return underwritingid;
    }

    public void setUnderwriting(org.museframework.bian.customeroffer.dto.bq.Underwriting underwriting) {
        this.underwriting = underwriting;
    }

    public org.museframework.bian.customeroffer.dto.bq.Underwriting getUnderwriting() {
        return underwriting;
    }
}