package org.museframework.bian.bracurdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestDistributionVehicleAdministrationRequest {
    @MetaField
    private String branchcurrencydistributionid;

    @MetaField
    private String distributionvehicleadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.bracurdis.dto.bq.DistributionVehicleAdministration distributionVehicleAdministration;

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

    public void setDistributionVehicleAdministration(org.museframework.bian.bracurdis.dto.bq.DistributionVehicleAdministration distributionVehicleAdministration) {
        this.distributionVehicleAdministration = distributionVehicleAdministration;
    }

    public org.museframework.bian.bracurdis.dto.bq.DistributionVehicleAdministration getDistributionVehicleAdministration() {
        return distributionVehicleAdministration;
    }
}