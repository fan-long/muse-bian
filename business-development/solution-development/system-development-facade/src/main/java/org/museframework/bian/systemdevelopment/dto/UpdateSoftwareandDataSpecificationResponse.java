package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSoftwareandDataSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.SoftwareandDataSpecification softwareandDataSpecification;

    public void setSoftwareandDataSpecification(org.museframework.bian.systemdevelopment.dto.bq.SoftwareandDataSpecification softwareandDataSpecification) {
        this.softwareandDataSpecification = softwareandDataSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.SoftwareandDataSpecification getSoftwareandDataSpecification() {
        return softwareandDataSpecification;
    }
}