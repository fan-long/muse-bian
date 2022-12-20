package org.museframework.bian.cortruser.dto;

public class ExecuteTrustAssetMaintenanceandManagementFulfillmentRequest {
    private String corporatetrustservicesid;

    private String trustassetmaintenanceandmanagementfulfillmentid;

    private org.museframework.bian.cortruser.dto.bq.TrustAssetMaintenanceandManagementFulfillment trustAssetMaintenanceandManagementFulfillment;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setTrustassetmaintenanceandmanagementfulfillmentid(String trustassetmaintenanceandmanagementfulfillmentid) {
        this.trustassetmaintenanceandmanagementfulfillmentid = trustassetmaintenanceandmanagementfulfillmentid;
    }

    public String getTrustassetmaintenanceandmanagementfulfillmentid() {
        return trustassetmaintenanceandmanagementfulfillmentid;
    }

    public void setTrustAssetMaintenanceandManagementFulfillment(org.museframework.bian.cortruser.dto.bq.TrustAssetMaintenanceandManagementFulfillment trustAssetMaintenanceandManagementFulfillment) {
        this.trustAssetMaintenanceandManagementFulfillment = trustAssetMaintenanceandManagementFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustAssetMaintenanceandManagementFulfillment getTrustAssetMaintenanceandManagementFulfillment() {
        return trustAssetMaintenanceandManagementFulfillment;
    }
}