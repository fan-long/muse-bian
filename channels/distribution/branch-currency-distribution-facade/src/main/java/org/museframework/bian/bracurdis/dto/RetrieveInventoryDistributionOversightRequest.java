package org.museframework.bian.bracurdis.dto;

public class RetrieveInventoryDistributionOversightRequest {
    private String branchcurrencydistributionid;

    private String inventorydistributionoversightid;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setInventorydistributionoversightid(String inventorydistributionoversightid) {
        this.inventorydistributionoversightid = inventorydistributionoversightid;
    }

    public String getInventorydistributionoversightid() {
        return inventorydistributionoversightid;
    }
}