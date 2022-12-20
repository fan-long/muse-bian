package org.museframework.bian.proinvdis.dto;

public class UpdateProvisioningResponse {
    private org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning;

    public void setProvisioning(org.museframework.bian.proinvdis.dto.bq.Provisioning provisioning) {
        this.provisioning = provisioning;
    }

    public org.museframework.bian.proinvdis.dto.bq.Provisioning getProvisioning() {
        return provisioning;
    }
}