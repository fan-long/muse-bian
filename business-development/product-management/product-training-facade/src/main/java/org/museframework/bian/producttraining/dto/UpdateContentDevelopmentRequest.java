package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateContentDevelopmentRequest {
    @MetaField
    private String producttrainingid;

    @MetaField
    private String contentdevelopmentid;

    @MetaField(ref=true)
    private org.museframework.bian.producttraining.dto.bq.ContentDevelopment contentDevelopment;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setContentdevelopmentid(String contentdevelopmentid) {
        this.contentdevelopmentid = contentdevelopmentid;
    }

    public String getContentdevelopmentid() {
        return contentdevelopmentid;
    }

    public void setContentDevelopment(org.museframework.bian.producttraining.dto.bq.ContentDevelopment contentDevelopment) {
        this.contentDevelopment = contentDevelopment;
    }

    public org.museframework.bian.producttraining.dto.bq.ContentDevelopment getContentDevelopment() {
        return contentDevelopment;
    }
}