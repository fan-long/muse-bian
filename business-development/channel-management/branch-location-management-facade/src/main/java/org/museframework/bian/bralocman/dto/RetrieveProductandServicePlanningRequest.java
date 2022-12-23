package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductandServicePlanningRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField
    private String productandserviceplanningid;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setProductandserviceplanningid(String productandserviceplanningid) {
        this.productandserviceplanningid = productandserviceplanningid;
    }

    public String getProductandserviceplanningid() {
        return productandserviceplanningid;
    }
}