package org.museframework.bian.customerproposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyBankDefinedProductandServiceTermRequest {
    @MetaField
    private String customerpropositionid;

    @MetaField
    private String bankdefinedproductandservicetermid;

    public void setCustomerpropositionid(String customerpropositionid) {
        this.customerpropositionid = customerpropositionid;
    }

    public String getCustomerpropositionid() {
        return customerpropositionid;
    }

    public void setBankdefinedproductandservicetermid(String bankdefinedproductandservicetermid) {
        this.bankdefinedproductandservicetermid = bankdefinedproductandservicetermid;
    }

    public String getBankdefinedproductandservicetermid() {
        return bankdefinedproductandservicetermid;
    }
}