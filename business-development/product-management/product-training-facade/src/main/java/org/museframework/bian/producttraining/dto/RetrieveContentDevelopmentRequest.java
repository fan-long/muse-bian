package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveContentDevelopmentRequest {
    @MetaField
    private String producttrainingid;

    @MetaField
    private String contentdevelopmentid;

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
}