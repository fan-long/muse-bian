package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSalesandMarketingRequest {
    @MetaField
    private String productdeploymentid;

    @MetaField
    private String salesandmarketingid;

    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.SalesandMarketing salesandMarketing;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setSalesandmarketingid(String salesandmarketingid) {
        this.salesandmarketingid = salesandmarketingid;
    }

    public String getSalesandmarketingid() {
        return salesandmarketingid;
    }

    public void setSalesandMarketing(org.museframework.bian.productdeployment.dto.bq.SalesandMarketing salesandMarketing) {
        this.salesandMarketing = salesandMarketing;
    }

    public org.museframework.bian.productdeployment.dto.bq.SalesandMarketing getSalesandMarketing() {
        return salesandMarketing;
    }
}