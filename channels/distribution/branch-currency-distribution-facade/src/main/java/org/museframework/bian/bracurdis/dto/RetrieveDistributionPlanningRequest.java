package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDistributionPlanningRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String distributionplanningid;

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
}