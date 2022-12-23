package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateEquityInstrumentpropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty equityInstrumentproperty;

    public void setEquityInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty equityInstrumentproperty) {
        this.equityInstrumentproperty = equityInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty getEquityInstrumentproperty() {
        return equityInstrumentproperty;
    }
}