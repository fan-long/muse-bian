package org.museframework.bian.fraudresolution.dto;

public class UpdateFraudResolutionProcedureRequest {
    private String fraudresolutionid;

    private org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setFraudResolutionProcedure(org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure) {
        this.fraudResolutionProcedure = fraudResolutionProcedure;
    }

    public org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure getFraudResolutionProcedure() {
        return fraudResolutionProcedure;
    }
}