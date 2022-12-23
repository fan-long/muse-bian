package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateProductTrainingProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure productTrainingProcedure;

    public void setProductTrainingProcedure(org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure productTrainingProcedure) {
        this.productTrainingProcedure = productTrainingProcedure;
    }

    public org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure getProductTrainingProcedure() {
        return productTrainingProcedure;
    }
}