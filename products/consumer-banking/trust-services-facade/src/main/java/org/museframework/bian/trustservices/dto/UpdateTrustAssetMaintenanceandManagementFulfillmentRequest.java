package org.museframework.bian.trustservices.dto;

public class UpdateTrustAssetMaintenanceandManagementFulfillmentRequest {
    private String trustservicesid;

    private String trustassetmaintenanceandmanagementfulfillmentid;

    private org.museframework.bian.trustservices.dto.bq.TrustAssetMaintenanceandManagementFulfillment trustAssetMaintenanceandManagementFulfillment;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setTrustassetmaintenanceandmanagementfulfillmentid(String trustassetmaintenanceandmanagementfulfillmentid) {
        this.trustassetmaintenanceandmanagementfulfillmentid = trustassetmaintenanceandmanagementfulfillmentid;
    }

    public String getTrustassetmaintenanceandmanagementfulfillmentid() {
        return trustassetmaintenanceandmanagementfulfillmentid;
    }

    public void setTrustAssetMaintenanceandManagementFulfillment(org.museframework.bian.trustservices.dto.bq.TrustAssetMaintenanceandManagementFulfillment trustAssetMaintenanceandManagementFulfillment) {
        this.trustAssetMaintenanceandManagementFulfillment = trustAssetMaintenanceandManagementFulfillment;
    }

    public org.museframework.bian.trustservices.dto.bq.TrustAssetMaintenanceandManagementFulfillment getTrustAssetMaintenanceandManagementFulfillment() {
        return trustAssetMaintenanceandManagementFulfillment;
    }
}