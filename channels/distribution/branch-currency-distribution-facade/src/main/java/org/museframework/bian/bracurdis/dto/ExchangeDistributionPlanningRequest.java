package org.museframework.bian.bracurdis.dto;

public class ExchangeDistributionPlanningRequest {
    private String branchcurrencydistributionid;

    private String distributionplanningid;

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