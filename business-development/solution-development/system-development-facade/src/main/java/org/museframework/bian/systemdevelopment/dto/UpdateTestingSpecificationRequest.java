package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTestingSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String testingspecificationid;

    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setTestingspecificationid(String testingspecificationid) {
        this.testingspecificationid = testingspecificationid;
    }

    public String getTestingspecificationid() {
        return testingspecificationid;
    }

    public void setTestingSpecification(org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification) {
        this.testingSpecification = testingSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification getTestingSpecification() {
        return testingSpecification;
    }
}