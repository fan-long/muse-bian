package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductandServicePlanningRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField
    private String productandserviceplanningid;

    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning productandServicePlanning;

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

    public void setProductandServicePlanning(org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning productandServicePlanning) {
        this.productandServicePlanning = productandServicePlanning;
    }

    public org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning getProductandServicePlanning() {
        return productandServicePlanning;
    }
}