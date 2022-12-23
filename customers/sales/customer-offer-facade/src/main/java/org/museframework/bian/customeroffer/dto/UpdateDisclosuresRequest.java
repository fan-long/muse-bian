package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDisclosuresRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String disclosuresid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Disclosures disclosures;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setDisclosuresid(String disclosuresid) {
        this.disclosuresid = disclosuresid;
    }

    public String getDisclosuresid() {
        return disclosuresid;
    }

    public void setDisclosures(org.museframework.bian.customeroffer.dto.bq.Disclosures disclosures) {
        this.disclosures = disclosures;
    }

    public org.museframework.bian.customeroffer.dto.bq.Disclosures getDisclosures() {
        return disclosures;
    }
}