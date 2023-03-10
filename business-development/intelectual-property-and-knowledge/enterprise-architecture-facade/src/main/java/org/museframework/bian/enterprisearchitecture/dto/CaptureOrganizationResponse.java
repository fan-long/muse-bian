package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureOrganizationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.Organization organization;

    public void setOrganization(org.museframework.bian.enterprisearchitecture.dto.bq.Organization organization) {
        this.organization = organization;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.Organization getOrganization() {
        return organization;
    }
}