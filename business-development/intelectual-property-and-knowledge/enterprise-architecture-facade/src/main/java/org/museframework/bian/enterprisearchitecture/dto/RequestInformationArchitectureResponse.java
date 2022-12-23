package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestInformationArchitectureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture;

    public void setInformationArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture) {
        this.informationArchitecture = informationArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture getInformationArchitecture() {
        return informationArchitecture;
    }
}