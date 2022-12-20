package org.museframework.bian.systemdevelopment.dto;

public class RetrieveUsageSpecificationRequest {
    private String systemdevelopmentid;

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