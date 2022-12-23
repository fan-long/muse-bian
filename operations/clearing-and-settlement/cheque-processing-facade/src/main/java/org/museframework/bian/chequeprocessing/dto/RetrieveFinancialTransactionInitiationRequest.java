package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialTransactionInitiationRequest {
    @MetaField
    private String chequeprocessingid;

    @MetaField
    private String financialtransactioninitiationid;

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
}