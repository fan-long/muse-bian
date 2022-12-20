package org.museframework.bian.systemdevelopment.dto;

public class RequestUsageSpecificationResponse {
    private org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification usageSpecification;

    public void setUsageSpecification(org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification usageSpecification) {
        this.usageSpecification = usageSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.UsageSpecification getUsageSpecification() {
        return usageSpecification;
    }
}