package org.museframework.bian.proinvdis.dto;

public class ControlProductInventoryDistributionAdministrativePlanRequest {
    private String productinventorydistributionid;

    private org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan productInventoryDistributionAdministrativePlan;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setProductInventoryDistributionAdministrativePlan(org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan productInventoryDistributionAdministrativePlan) {
        this.productInventoryDistributionAdministrativePlan = productInventoryDistributionAdministrativePlan;
    }

    public org.museframework.bian.proinvdis.dto.cr.ProductInventoryDistributionAdministrativePlan getProductInventoryDistributionAdministrativePlan() {
        return productInventoryDistributionAdministrativePlan;
    }
}