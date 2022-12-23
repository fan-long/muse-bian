package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTechnologyInfrastructureRequest {
    @MetaField
    private String enterprisearchitectureid;

    @MetaField
    private String technologyinfrastructureid;

    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setTechnologyinfrastructureid(String technologyinfrastructureid) {
        this.technologyinfrastructureid = technologyinfrastructureid;
    }

    public String getTechnologyinfrastructureid() {
        return technologyinfrastructureid;
    }

    public void setTechnologyInfrastructure(org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure) {
        this.technologyInfrastructure = technologyInfrastructure;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure getTechnologyInfrastructure() {
        return technologyInfrastructure;
    }
}