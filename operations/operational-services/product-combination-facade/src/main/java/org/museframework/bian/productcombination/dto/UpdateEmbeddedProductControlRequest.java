package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateEmbeddedProductControlRequest {
    @MetaField
    private String productcombinationid;

    @MetaField
    private String embeddedproductcontrolid;

    @MetaField(ref=true)
    private org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl;

    public void setProductcombinationid(String productcombinationid) {
        this.productcombinationid = productcombinationid;
    }

    public String getProductcombinationid() {
        return productcombinationid;
    }

    public void setEmbeddedproductcontrolid(String embeddedproductcontrolid) {
        this.embeddedproductcontrolid = embeddedproductcontrolid;
    }

    public String getEmbeddedproductcontrolid() {
        return embeddedproductcontrolid;
    }

    public void setEmbeddedProductControl(org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl) {
        this.embeddedProductControl = embeddedProductControl;
    }

    public org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl getEmbeddedProductControl() {
        return embeddedProductControl;
    }
}