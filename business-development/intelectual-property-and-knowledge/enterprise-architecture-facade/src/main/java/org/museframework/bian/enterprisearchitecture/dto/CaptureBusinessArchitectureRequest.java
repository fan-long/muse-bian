package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureBusinessArchitectureRequest {
    @MetaField
    private String enterprisearchitectureid;

    @MetaField
    private String businessarchitectureid;

    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture;

    public void setEnterprisearchitectureid(String enterprisearchitectureid) {
        this.enterprisearchitectureid = enterprisearchitectureid;
    }

    public String getEnterprisearchitectureid() {
        return enterprisearchitectureid;
    }

    public void setBusinessarchitectureid(String businessarchitectureid) {
        this.businessarchitectureid = businessarchitectureid;
    }

    public String getBusinessarchitectureid() {
        return businessarchitectureid;
    }

    public void setBusinessArchitecture(org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture businessArchitecture) {
        this.businessArchitecture = businessArchitecture;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.BusinessArchitecture getBusinessArchitecture() {
        return businessArchitecture;
    }
}