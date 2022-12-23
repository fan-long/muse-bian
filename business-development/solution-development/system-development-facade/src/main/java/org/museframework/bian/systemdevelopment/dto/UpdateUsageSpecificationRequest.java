package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateUsageSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String usagespecificationid;

    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification usageSpecification;

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

    public void setUsageSpecification(org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification usageSpecification) {
        this.usageSpecification = usageSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification getUsageSpecification() {
        return usageSpecification;
    }
}