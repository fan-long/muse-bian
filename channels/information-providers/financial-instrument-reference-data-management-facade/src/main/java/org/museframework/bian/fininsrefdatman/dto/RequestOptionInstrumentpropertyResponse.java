package org.museframework.bian.fininsrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestOptionInstrumentpropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty optionInstrumentproperty;

    public void setOptionInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty optionInstrumentproperty) {
        this.optionInstrumentproperty = optionInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty getOptionInstrumentproperty() {
        return optionInstrumentproperty;
    }
}