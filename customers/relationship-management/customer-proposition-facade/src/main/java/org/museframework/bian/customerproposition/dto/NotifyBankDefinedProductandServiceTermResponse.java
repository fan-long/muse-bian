package org.museframework.bian.customerproposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyBankDefinedProductandServiceTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm bankDefinedProductandServiceTerm;

    public void setBankDefinedProductandServiceTerm(org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm bankDefinedProductandServiceTerm) {
        this.bankDefinedProductandServiceTerm = bankDefinedProductandServiceTerm;
    }

    public org.museframework.bian.customerproposition.dto.bq.BankDefinedProductandServiceTerm getBankDefinedProductandServiceTerm() {
        return bankDefinedProductandServiceTerm;
    }
}