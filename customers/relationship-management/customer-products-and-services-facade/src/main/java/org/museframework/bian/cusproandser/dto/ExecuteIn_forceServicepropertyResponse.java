package org.museframework.bian.cusproandser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteIn_forceServicepropertyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty in_forceServiceproperty;

    public void setIn_forceServiceproperty(org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty in_forceServiceproperty) {
        this.in_forceServiceproperty = in_forceServiceproperty;
    }

    public org.museframework.bian.cusproandser.dto.bq.In_forceServiceproperty getIn_forceServiceproperty() {
        return in_forceServiceproperty;
    }
}