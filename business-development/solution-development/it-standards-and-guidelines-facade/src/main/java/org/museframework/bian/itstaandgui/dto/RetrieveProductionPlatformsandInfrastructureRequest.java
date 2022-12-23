package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductionPlatformsandInfrastructureRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String productionplatformsandinfrastructureid;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setProductionplatformsandinfrastructureid(String productionplatformsandinfrastructureid) {
        this.productionplatformsandinfrastructureid = productionplatformsandinfrastructureid;
    }

    public String getProductionplatformsandinfrastructureid() {
        return productionplatformsandinfrastructureid;
    }
}