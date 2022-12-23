package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveUsageSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String usagespecificationid;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setUsagespecificationid(String usagespecificationid) {
        this.usagespecificationid = usagespecificationid;
    }

    public String getUsagespecificationid() {
        return usagespecificationid;
    }
}