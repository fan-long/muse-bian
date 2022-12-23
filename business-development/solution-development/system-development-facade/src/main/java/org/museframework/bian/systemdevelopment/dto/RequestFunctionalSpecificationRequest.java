package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFunctionalSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String functionalspecificationid;

    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setFunctionalspecificationid(String functionalspecificationid) {
        this.functionalspecificationid = functionalspecificationid;
    }

    public String getFunctionalspecificationid() {
        return functionalspecificationid;
    }

    public void setFunctionalSpecification(org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification) {
        this.functionalSpecification = functionalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification getFunctionalSpecification() {
        return functionalSpecification;
    }
}