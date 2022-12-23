package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveApplicationArchitectureRequest {
    @MetaField
    private String enterprisearchitectureid;

    @MetaField
    private String applicationarchitectureid;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setApplicationarchitectureid(String applicationarchitectureid) {
        this.applicationarchitectureid = applicationarchitectureid;
    }

    public String getApplicationarchitectureid() {
        return applicationarchitectureid;
    }
}