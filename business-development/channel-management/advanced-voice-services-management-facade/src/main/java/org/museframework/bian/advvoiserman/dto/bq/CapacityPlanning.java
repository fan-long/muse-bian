/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.advvoiserman.dto.bq;

public class CapacityPlanning {
    /*Record of the channel resource utilization and loading*/
    private String VChannelPlatformUtilization;

    /*Estimated projected resource utilization and loading based on historical patterns and anticipated activity - used to identify the need for capacity upgrades*/
    private String VChannelLoadingProjections;

    public void setVChannelPlatformUtilization(String VChannelPlatformUtilization) {
        this.VChannelPlatformUtilization = VChannelPlatformUtilization;
    }

    public String getVChannelPlatformUtilization() {
        return VChannelPlatformUtilization;
    }

    public void setVChannelLoadingProjections(String VChannelLoadingProjections) {
        this.VChannelLoadingProjections = VChannelLoadingProjections;
    }

    public String getVChannelLoadingProjections() {
        return VChannelLoadingProjections;
    }
}