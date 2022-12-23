package org.museframework.bian.customerproposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyCustomerDefinedProductandServiceTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm customerDefinedProductandServiceTerm;

    public void setCustomerDefinedProductandServiceTerm(org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm customerDefinedProductandServiceTerm) {
        this.customerDefinedProductandServiceTerm = customerDefinedProductandServiceTerm;
    }

    public org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm getCustomerDefinedProductandServiceTerm() {
        return customerDefinedProductandServiceTerm;
    }
}