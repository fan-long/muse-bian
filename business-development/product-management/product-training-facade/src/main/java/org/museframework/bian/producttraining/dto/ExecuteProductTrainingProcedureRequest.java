package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductTrainingProcedureRequest {
    @MetaField
    private String producttrainingid;

    @MetaField(ref=true)
    private org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure productTrainingProcedure;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setProductTrainingProcedure(org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure productTrainingProcedure) {
        this.productTrainingProcedure = productTrainingProcedure;
    }

    public org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure getProductTrainingProcedure() {
        return productTrainingProcedure;
    }
}