package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveConfigurationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemsadministration.dto.bq.Configuration configuration;

    public void setConfiguration(org.museframework.bian.systemsadministration.dto.bq.Configuration configuration) {
        this.configuration = configuration;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Configuration getConfiguration() {
        return configuration;
    }
}