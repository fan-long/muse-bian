package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFinancialAccountingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting;

    public void setFinancialAccounting(org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialAccounting getFinancialAccounting() {
        return financialAccounting;
    }
}