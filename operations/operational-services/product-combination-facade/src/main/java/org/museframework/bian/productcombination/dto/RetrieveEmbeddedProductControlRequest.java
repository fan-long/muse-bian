package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEmbeddedProductControlRequest {
    @MetaField
    private String productcombinationid;

    @MetaField
    private String embeddedproductcontrolid;

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
}