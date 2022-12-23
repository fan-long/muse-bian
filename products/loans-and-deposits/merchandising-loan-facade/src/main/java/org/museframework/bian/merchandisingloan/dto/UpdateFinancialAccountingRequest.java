package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFinancialAccountingRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String financialaccountingid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setFinancialaccountingid(String financialaccountingid) {
        this.financialaccountingid = financialaccountingid;
    }

    public String getFinancialaccountingid() {
        return financialaccountingid;
    }

    public void setFinancialAccounting(org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}