/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.ebranchmanagement.dto.bq;

public class CapacityPlanning {
    /*Record of the channel resource utilization and loading*/
    private String eBranchChannelPlatformUtilization;

    /*Estimated projected resource utilization and loading based on historical patterns and anticipated activity - used to identify the need for capacity upgrades*/
    private String eBranchChannelLoadingProjections;

    public void seteBranchChannelPlatformUtilization(String eBranchChannelPlatformUtilization) {
        this.eBranchChannelPlatformUtilization = eBranchChannelPlatformUtilization;
    }

    public String geteBranchChannelPlatformUtilization() {
        return eBranchChannelPlatformUtilization;
    }

    public void seteBranchChannelLoadingProjections(String eBranchChannelLoadingProjections) {
        this.eBranchChannelLoadingProjections = eBranchChannelLoadingProjections;
    }

    public String geteBranchChannelLoadingProjections() {
        return eBranchChannelLoadingProjections;
    }
}