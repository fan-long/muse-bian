package org.museframework.bian.corporatelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAdministerResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatelease.dto.bq.Administer administer;

    public void setAdminister(org.museframework.bian.corporatelease.dto.bq.Administer administer) {
        this.administer = administer;
    }

    public org.museframework.bian.corporatelease.dto.bq.Administer getAdminister() {
        return administer;
    }
}