package org.museframework.bian.businessdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureBusinessDevelopmentStrategyRequest {
    @MetaField
    private String businessdevelopmentid;

    @MetaField(ref=true)
    private org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy businessDevelopmentStrategy;

    public void setBusinessdevelopmentid(String businessdevelopmentid) {
        this.businessdevelopmentid = businessdevelopmentid;
    }

    public String getBusinessdevelopmentid() {
        return businessdevelopmentid;
    }

    public void setBusinessDevelopmentStrategy(org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy businessDevelopmentStrategy) {
        this.businessDevelopmentStrategy = businessDevelopmentStrategy;
    }

    public org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy getBusinessDevelopmentStrategy() {
        return businessDevelopmentStrategy;
    }
}