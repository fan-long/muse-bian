package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterSalesandMarketingRequest {
    @MetaField
    private String productdirectoryid;

    @MetaField
    private String salesandmarketingid;

    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.bq.SalesandMarketing salesandMarketing;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setSalesandmarketingid(String salesandmarketingid) {
        this.salesandmarketingid = salesandmarketingid;
    }

    public String getSalesandmarketingid() {
        return salesandmarketingid;
    }

    public void setSalesandMarketing(org.museframework.bian.productdirectory.dto.bq.SalesandMarketing salesandMarketing) {
        this.salesandMarketing = salesandMarketing;
    }

    public org.museframework.bian.productdirectory.dto.bq.SalesandMarketing getSalesandMarketing() {
        return salesandMarketing;
    }
}