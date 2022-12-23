package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureProductionEnvironmentandSupportServicesRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String productionenvironmentandsupportservicesid;

    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices productionEnvironmentandSupportServices;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setProductionenvironmentandsupportservicesid(String productionenvironmentandsupportservicesid) {
        this.productionenvironmentandsupportservicesid = productionenvironmentandsupportservicesid;
    }

    public String getProductionenvironmentandsupportservicesid() {
        return productionenvironmentandsupportservicesid;
    }

    public void setProductionEnvironmentandSupportServices(org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices productionEnvironmentandSupportServices) {
        this.productionEnvironmentandSupportServices = productionEnvironmentandSupportServices;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices getProductionEnvironmentandSupportServices() {
        return productionEnvironmentandSupportServices;
    }
}