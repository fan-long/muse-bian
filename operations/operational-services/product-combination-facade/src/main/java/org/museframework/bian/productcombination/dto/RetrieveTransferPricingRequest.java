package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransferPricingRequest {
    @MetaField
    private String productcombinationid;

    @MetaField
    private String transferpricingid;

    public void setProductcombinationid(String productcombinationid) {
        this.productcombinationid = productcombinationid;
    }

    public String getProductcombinationid() {
        return productcombinationid;
    }

    public void setTransferpricingid(String transferpricingid) {
        this.transferpricingid = transferpricingid;
    }

    public String getTransferpricingid() {
        return transferpricingid;
    }
}