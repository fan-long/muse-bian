package org.museframework.bian.bracurdis.dto;

public class RequestInventoryDistributionOversightRequest {
    private String branchcurrencydistributionid;

    private String inventorydistributionoversightid;

    private org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight inventoryDistributionOversight;

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

    public void setInventoryDistributionOversight(org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight inventoryDistributionOversight) {
        this.inventoryDistributionOversight = inventoryDistributionOversight;
    }

    public org.museframework.bian.bracurdis.dto.bq.InventoryDistributionOversight getInventoryDistributionOversight() {
        return inventoryDistributionOversight;
    }
}