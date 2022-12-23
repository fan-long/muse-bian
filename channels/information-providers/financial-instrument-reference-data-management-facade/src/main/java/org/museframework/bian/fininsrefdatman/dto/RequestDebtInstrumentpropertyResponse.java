package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestDebtInstrumentpropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty debtInstrumentproperty;

    public void setDebtInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty debtInstrumentproperty) {
        this.debtInstrumentproperty = debtInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty getDebtInstrumentproperty() {
        return debtInstrumentproperty;
    }
}