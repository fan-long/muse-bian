package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTestingSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String testingspecificationid;

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
}