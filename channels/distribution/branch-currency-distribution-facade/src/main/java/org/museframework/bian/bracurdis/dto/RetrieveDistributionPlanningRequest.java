package org.museframework.bian.bracurdis.dto;

public class RetrieveDistributionPlanningRequest {
    private String branchcurrencydistributionid;

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