package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveServiceEvaluationRequest {
    @MetaField
    private String producttrainingid;

    @MetaField
    private String serviceevaluationid;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setServiceevaluationid(String serviceevaluationid) {
        this.serviceevaluationid = serviceevaluationid;
    }

    public String getServiceevaluationid() {
        return serviceevaluationid;
    }
}