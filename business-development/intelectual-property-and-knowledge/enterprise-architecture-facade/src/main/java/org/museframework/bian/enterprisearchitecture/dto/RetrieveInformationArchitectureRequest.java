package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInformationArchitectureRequest {
    @MetaField
    private String enterprisearchitectureid;

    @MetaField
    private String informationarchitectureid;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setInformationarchitectureid(String informationarchitectureid) {
        this.informationarchitectureid = informationarchitectureid;
    }

    public String getInformationarchitectureid() {
        return informationarchitectureid;
    }
}