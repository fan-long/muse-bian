package org.museframework.bian.customerproposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCustomerDefinedProductandServiceTermRequest {
    @MetaField
    private String customerpropositionid;

    @MetaField
    private String customerdefinedproductandservicetermid;

    @MetaField(ref=true)
    private org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm customerDefinedProductandServiceTerm;

    public void setCustomerpropositionid(String customerpropositionid) {
        this.customerpropositionid = customerpropositionid;
    }

    public String getCustomerpropositionid() {
        return customerpropositionid;
    }

    public void setCustomerdefinedproductandservicetermid(String customerdefinedproductandservicetermid) {
        this.customerdefinedproductandservicetermid = customerdefinedproductandservicetermid;
    }

    public String getCustomerdefinedproductandservicetermid() {
        return customerdefinedproductandservicetermid;
    }

    public void setCustomerDefinedProductandServiceTerm(org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm customerDefinedProductandServiceTerm) {
        this.customerDefinedProductandServiceTerm = customerDefinedProductandServiceTerm;
    }

    public org.museframework.bian.customerproposition.dto.bq.CustomerDefinedProductandServiceTerm getCustomerDefinedProductandServiceTerm() {
        return customerDefinedProductandServiceTerm;
    }
}