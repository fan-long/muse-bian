package org.museframework.bian.producttraining.dto;

public class ControlProductTrainingProcedureRequest {
    private String producttrainingid;

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