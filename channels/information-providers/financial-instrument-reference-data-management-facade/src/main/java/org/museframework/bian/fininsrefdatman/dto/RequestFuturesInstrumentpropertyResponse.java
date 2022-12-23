package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestFuturesInstrumentpropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty futuresInstrumentproperty;

    public void setFuturesInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty futuresInstrumentproperty) {
        this.futuresInstrumentproperty = futuresInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty getFuturesInstrumentproperty() {
        return futuresInstrumentproperty;
    }
}