package org.museframework.bian.cortruser.dto;

public class NotifyTrustAssetMaintenanceandManagementFulfillmentRequest {
    private String corporatetrustservicesid;

    private String trustassetmaintenanceandmanagementfulfillmentid;

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
}