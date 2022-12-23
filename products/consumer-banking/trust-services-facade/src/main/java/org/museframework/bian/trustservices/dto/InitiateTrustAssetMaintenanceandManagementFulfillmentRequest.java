package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTrustAssetMaintenanceandManagementFulfillmentRequest {
    @MetaField
    private String trustservicesid;

    @MetaField
    private String trustassetmaintenanceandmanagementfulfillmentid;

    @MetaField(ref=true)
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