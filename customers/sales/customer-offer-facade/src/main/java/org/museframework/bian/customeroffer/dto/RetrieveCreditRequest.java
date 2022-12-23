package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCreditRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String creditid;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCreditid(String creditid) {
        this.creditid = creditid;
    }

    public String getCreditid() {
        return creditid;
    }
}