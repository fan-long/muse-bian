package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFinancialAccountingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting;

    public void setFinancialAccounting(org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}