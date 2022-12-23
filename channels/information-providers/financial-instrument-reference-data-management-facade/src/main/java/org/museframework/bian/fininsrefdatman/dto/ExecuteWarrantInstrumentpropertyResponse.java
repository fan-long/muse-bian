package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteWarrantInstrumentpropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty warrantInstrumentproperty;

    public void setWarrantInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty warrantInstrumentproperty) {
        this.warrantInstrumentproperty = warrantInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty getWarrantInstrumentproperty() {
        return warrantInstrumentproperty;
    }
}