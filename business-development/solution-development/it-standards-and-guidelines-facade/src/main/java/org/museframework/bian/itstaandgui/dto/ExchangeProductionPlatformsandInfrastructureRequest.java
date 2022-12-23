package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeProductionPlatformsandInfrastructureRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String productionplatformsandinfrastructureid;

    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure productionPlatformsandInfrastructure;

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

    public void setProductionPlatformsandInfrastructure(org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure productionPlatformsandInfrastructure) {
        this.productionPlatformsandInfrastructure = productionPlatformsandInfrastructure;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure getProductionPlatformsandInfrastructure() {
        return productionPlatformsandInfrastructure;
    }
}