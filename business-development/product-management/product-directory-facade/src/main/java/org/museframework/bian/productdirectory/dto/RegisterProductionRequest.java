package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterProductionRequest {
    @MetaField
    private String productdirectoryid;

    @MetaField
    private String productionid;

    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.bq.Production production;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setProductionid(String productionid) {
        this.productionid = productionid;
    }

    public String getProductionid() {
        return productionid;
    }

    public void setProduction(org.museframework.bian.productdirectory.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdirectory.dto.bq.Production getProduction() {
        return production;
    }
}