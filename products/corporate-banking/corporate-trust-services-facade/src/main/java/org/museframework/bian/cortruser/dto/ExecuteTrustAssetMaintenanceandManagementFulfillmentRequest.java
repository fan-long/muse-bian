package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteTrustAssetMaintenanceandManagementFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String trustassetmaintenanceandmanagementfulfillmentid;

    @MetaField(ref=true)
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