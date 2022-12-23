package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeFinancialTransactionInitiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation;

    public void setFinancialTransactionInitiation(org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation) {
        this.financialTransactionInitiation = financialTransactionInitiation;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation getFinancialTransactionInitiation() {
        return financialTransactionInitiation;
    }
}