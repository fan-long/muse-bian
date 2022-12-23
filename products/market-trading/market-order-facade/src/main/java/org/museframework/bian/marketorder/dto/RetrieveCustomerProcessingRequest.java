package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerProcessingRequest {
    @MetaField
    private String marketorderid;

    @MetaField
    private String customerprocessingid;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }

    public void setCustomerprocessingid(String customerprocessingid) {
        this.customerprocessingid = customerprocessingid;
    }

    public String getCustomerprocessingid() {
        return customerprocessingid;
    }
}