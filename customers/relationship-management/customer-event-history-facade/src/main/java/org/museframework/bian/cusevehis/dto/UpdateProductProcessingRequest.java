package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductProcessingRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String productprocessingid;

    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setProductprocessingid(String productprocessingid) {
        this.productprocessingid = productprocessingid;
    }

    public String getProductprocessingid() {
        return productprocessingid;
    }

    public void setProductProcessing(org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing) {
        this.productProcessing = productProcessing;
    }

    public org.museframework.bian.cusevehis.dto.bq.ProductProcessing getProductProcessing() {
        return productProcessing;
    }
}