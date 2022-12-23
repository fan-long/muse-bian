package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveComplianceRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String complianceid;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setComplianceid(String complianceid) {
        this.complianceid = complianceid;
    }

    public String getComplianceid() {
        return complianceid;
    }
}