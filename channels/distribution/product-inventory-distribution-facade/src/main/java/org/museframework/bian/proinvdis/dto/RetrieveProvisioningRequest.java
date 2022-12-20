package org.museframework.bian.proinvdis.dto;

public class RetrieveProvisioningRequest {
    private String productinventorydistributionid;

    private String provisioningid;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setProvisioningid(String provisioningid) {
        this.provisioningid = provisioningid;
    }

    public String getProvisioningid() {
        return provisioningid;
    }
}