package org.museframework.bian.bracurdis.dto;

public class UpdateDistributionVehicleAdministrationRequest {
    private String branchcurrencydistributionid;

    private String distributionvehicleadministrationid;

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