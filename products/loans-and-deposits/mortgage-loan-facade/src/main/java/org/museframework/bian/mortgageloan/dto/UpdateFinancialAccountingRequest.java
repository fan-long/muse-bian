package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFinancialAccountingRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String financialaccountingid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setFinancialaccountingid(String financialaccountingid) {
        this.financialaccountingid = financialaccountingid;
    }

    public String getFinancialaccountingid() {
        return financialaccountingid;
    }

    public void setFinancialAccounting(org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}