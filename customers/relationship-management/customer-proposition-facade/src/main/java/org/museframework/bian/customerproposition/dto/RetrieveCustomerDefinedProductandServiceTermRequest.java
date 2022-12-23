package org.museframework.bian.customerproposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerDefinedProductandServiceTermRequest {
    @MetaField
    private String customerpropositionid;

    @MetaField
    private String customerdefinedproductandservicetermid;

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
}