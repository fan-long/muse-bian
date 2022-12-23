package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateComplianceRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String complianceid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Compliance compliance;

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

    public void setCompliance(org.museframework.bian.customeroffer.dto.bq.Compliance compliance) {
        this.compliance = compliance;
    }

    public org.museframework.bian.customeroffer.dto.bq.Compliance getCompliance() {
        return compliance;
    }
}