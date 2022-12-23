package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCustomerOfferProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure;

    public void setCustomerOfferProcedure(org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure customerOfferProcedure) {
        this.customerOfferProcedure = customerOfferProcedure;
    }

    public org.museframework.bian.customeroffer.dto.cr.CustomerOfferProcedure getCustomerOfferProcedure() {
        return customerOfferProcedure;
    }
}