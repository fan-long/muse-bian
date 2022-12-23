package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTechnicalSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String technicalspecificationid;

    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setTechnicalspecificationid(String technicalspecificationid) {
        this.technicalspecificationid = technicalspecificationid;
    }

    public String getTechnicalspecificationid() {
        return technicalspecificationid;
    }

    public void setTechnicalSpecification(org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification) {
        this.technicalSpecification = technicalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification getTechnicalSpecification() {
        return technicalSpecification;
    }
}