package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerOfferProcedureRequest {
    @MetaField
    private String customerofferid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCustomerOfferProcedure(org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure) {
        this.customerOfferProcedure = customerOfferProcedure;
    }

    public org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure getCustomerOfferProcedure() {
        return customerOfferProcedure;
    }
}