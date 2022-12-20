package org.museframework.bian.producttraining.dto;

public class InitiateProductTrainingProcedureRequest {
    private org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure productTrainingProcedure;

    public void setProductTrainingProcedure(org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure productTrainingProcedure) {
        this.productTrainingProcedure = productTrainingProcedure;
    }

    public org.museframework.bian.producttraining.dto.cr.ProductTrainingProcedure getProductTrainingProcedure() {
        return productTrainingProcedure;
    }
}