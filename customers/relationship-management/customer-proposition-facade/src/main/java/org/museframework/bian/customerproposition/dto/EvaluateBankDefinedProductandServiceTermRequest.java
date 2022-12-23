package org.museframework.bian.customerproposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateBankDefinedProductandServiceTermRequest {
    @MetaField
    private String customerpropositionid;

    @MetaField
    private String bankdefinedproductandservicetermid;

    @MetaField(ref=true)
    private org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm bankDefinedProductandServiceTerm;

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

    public void setBankDefinedProductandServiceTerm(org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm bankDefinedProductandServiceTerm) {
        this.bankDefinedProductandServiceTerm = bankDefinedProductandServiceTerm;
    }

    public org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm getBankDefinedProductandServiceTerm() {
        return bankDefinedProductandServiceTerm;
    }
}