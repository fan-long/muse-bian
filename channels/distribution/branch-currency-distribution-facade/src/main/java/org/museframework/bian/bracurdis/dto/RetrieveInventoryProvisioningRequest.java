package org.museframework.bian.bracurdis.dto;

public class RetrieveInventoryProvisioningRequest {
    private String branchcurrencydistributionid;

    private String inventoryprovisioningid;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setInventoryprovisioningid(String inventoryprovisioningid) {
        this.inventoryprovisioningid = inventoryprovisioningid;
    }

    public String getInventoryprovisioningid() {
        return inventoryprovisioningid;
    }
}