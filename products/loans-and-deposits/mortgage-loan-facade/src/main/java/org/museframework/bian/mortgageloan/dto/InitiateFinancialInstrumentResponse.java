package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateFinancialInstrumentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument;

    public void setFinancialInstrument(org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}