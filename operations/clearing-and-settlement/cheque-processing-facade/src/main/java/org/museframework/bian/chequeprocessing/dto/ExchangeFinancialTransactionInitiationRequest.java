package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeFinancialTransactionInitiationRequest {
    @MetaField
    private String chequeprocessingid;

    @MetaField
    private String financialtransactioninitiationid;

    @MetaField(ref=true)
    private org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setFinancialtransactioninitiationid(String financialtransactioninitiationid) {
        this.financialtransactioninitiationid = financialtransactioninitiationid;
    }

    public String getFinancialtransactioninitiationid() {
        return financialtransactioninitiationid;
    }

    public void setFinancialTransactionInitiation(org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation financialTransactionInitiation) {
        this.financialTransactionInitiation = financialTransactionInitiation;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.FinancialTransactionInitiation getFinancialTransactionInitiation() {
        return financialTransactionInitiation;
    }
}