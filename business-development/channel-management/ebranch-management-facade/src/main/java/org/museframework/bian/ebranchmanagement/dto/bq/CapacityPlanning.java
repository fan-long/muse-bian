/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.ebranchmanagement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CapacityPlanning {
    /*Record of the channel resource utilization and loading*/
    @MetaField
    private String eBranchChannelPlatformUtilization;

    /*Estimated projected resource utilization and loading based on historical patterns and anticipated activity - used to identify the need for capacity upgrades*/
    @MetaField
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