package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDistributionVehicleAdministrationRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String distributionvehicleadministrationid;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setDistributionvehicleadministrationid(String distributionvehicleadministrationid) {
        this.distributionvehicleadministrationid = distributionvehicleadministrationid;
    }

    public String getDistributionvehicleadministrationid() {
        return distributionvehicleadministrationid;
    }
}