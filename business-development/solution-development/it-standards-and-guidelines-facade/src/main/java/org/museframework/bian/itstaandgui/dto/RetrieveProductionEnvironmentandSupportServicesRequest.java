package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductionEnvironmentandSupportServicesRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String productionenvironmentandsupportservicesid;

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
}