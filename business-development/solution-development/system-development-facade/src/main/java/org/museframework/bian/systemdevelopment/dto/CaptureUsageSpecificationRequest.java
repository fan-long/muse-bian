package org.museframework.bian.systemdevelopment.dto;

public class CaptureUsageSpecificationRequest {
    private String systemdevelopmentid;

    private String usagespecificationid;

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