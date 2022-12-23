package org.museframework.bian.cusproandser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveIn_forceProductpropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusproandser.dto.bq.In_forceProductproperty in_forceProductproperty;

    public void setIn_forceProductproperty(org.museframework.bian.cusproandser.dto.bq.In_forceProductproperty in_forceProductproperty) {
        this.in_forceProductproperty = in_forceProductproperty;
    }

    public org.museframework.bian.cusproandser.dto.bq.In_forceProductproperty getIn_forceProductproperty() {
        return in_forceProductproperty;
    }
}