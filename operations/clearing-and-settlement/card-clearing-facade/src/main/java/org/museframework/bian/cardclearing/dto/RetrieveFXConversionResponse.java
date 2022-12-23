package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFXConversionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardclearing.dto.bq.FXConversion fXConversion;

    public void setfXConversion(org.museframework.bian.cardclearing.dto.bq.FXConversion fXConversion) {
        this.fXConversion = fXConversion;
    }

    public org.museframework.bian.cardclearing.dto.bq.FXConversion getfXConversion() {
        return fXConversion;
    }
}