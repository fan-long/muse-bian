package org.museframework.bian.fraudresolution.dto;

public class RetrieveFraudResolutionProcedureResponse {
    private org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure;

    public void setFraudResolutionProcedure(org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure) {
        this.fraudResolutionProcedure = fraudResolutionProcedure;
    }

    public org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure getFraudResolutionProcedure() {
        return fraudResolutionProcedure;
    }
}