package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFinancialInstrumentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument;

    public void setFinancialInstrument(org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.leasing.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}