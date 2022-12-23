package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTrustAssetMaintenanceandManagementFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.TrustAssetMaintenanceandManagementFulfillment trustAssetMaintenanceandManagementFulfillment;

    public void setTrustAssetMaintenanceandManagementFulfillment(org.museframework.bian.cortruser.dto.bq.TrustAssetMaintenanceandManagementFulfillment trustAssetMaintenanceandManagementFulfillment) {
        this.trustAssetMaintenanceandManagementFulfillment = trustAssetMaintenanceandManagementFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustAssetMaintenanceandManagementFulfillment getTrustAssetMaintenanceandManagementFulfillment() {
        return trustAssetMaintenanceandManagementFulfillment;
    }
}