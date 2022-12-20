package org.museframework.bian.fraudresolution.dto;

public class RetrieveCaseDeterminationRequest {
    private String fraudresolutionid;

    private String casedeterminationid;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setCasedeterminationid(String casedeterminationid) {
        this.casedeterminationid = casedeterminationid;
    }

    public String getCasedeterminationid() {
        return casedeterminationid;
    }
}