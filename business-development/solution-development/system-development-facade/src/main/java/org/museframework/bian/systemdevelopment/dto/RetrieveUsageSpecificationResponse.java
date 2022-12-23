package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveUsageSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification usageSpecification;

    public void setUsageSpecification(org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification usageSpecification) {
        this.usageSpecification = usageSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification getUsageSpecification() {
        return usageSpecification;
    }
}