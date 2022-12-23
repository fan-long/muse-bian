package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDisclosuresRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String disclosuresid;

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
}