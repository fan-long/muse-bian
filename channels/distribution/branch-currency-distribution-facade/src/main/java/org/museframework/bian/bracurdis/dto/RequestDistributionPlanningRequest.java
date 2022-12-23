package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestDistributionPlanningRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String distributionplanningid;

    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.bq.DistributionPlanning distributionPlanning;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setDistributionplanningid(String distributionplanningid) {
        this.distributionplanningid = distributionplanningid;
    }

    public String getDistributionplanningid() {
        return distributionplanningid;
    }

    public void setDistributionPlanning(org.museframework.bian.bracurdis.dto.bq.DistributionPlanning distributionPlanning) {
        this.distributionPlanning = distributionPlanning;
    }

    public org.museframework.bian.bracurdis.dto.bq.DistributionPlanning getDistributionPlanning() {
        return distributionPlanning;
    }
}