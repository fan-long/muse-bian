package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTrustAssetMaintenanceandManagementFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
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