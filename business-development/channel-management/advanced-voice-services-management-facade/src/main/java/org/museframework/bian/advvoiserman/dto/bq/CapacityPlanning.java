/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.advvoiserman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CapacityPlanning {
    /*Record of the channel resource utilization and loading*/
    @MetaField
    private String VChannelPlatformUtilization;

    /*Estimated projected resource utilization and loading based on historical patterns and anticipated activity - used to identify the need for capacity upgrades*/
    @MetaField
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