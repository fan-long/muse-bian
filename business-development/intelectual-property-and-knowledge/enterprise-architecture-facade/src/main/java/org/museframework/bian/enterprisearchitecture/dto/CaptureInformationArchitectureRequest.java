package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureInformationArchitectureRequest {
    @MetaField
    private String enterprisearchitectureid;

    @MetaField
    private String informationarchitectureid;

    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture;

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

    public void setInformationArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture informationArchitecture) {
        this.informationArchitecture = informationArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.InformationArchitecture getInformationArchitecture() {
        return informationArchitecture;
    }
}