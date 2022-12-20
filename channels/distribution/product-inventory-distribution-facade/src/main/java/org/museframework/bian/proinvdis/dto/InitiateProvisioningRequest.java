package org.museframework.bian.proinvdis.dto;

public class InitiateProvisioningRequest {
    private String productinventorydistributionid;

    private String provisioningid;

    private org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning;

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

    public void setProvisioning(org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning) {
        this.provisioning = provisioning;
    }

    public org.museframework.bian.proinvdis.dto.bq.Provisioning getProvisioning() {
        return provisioning;
    }
}