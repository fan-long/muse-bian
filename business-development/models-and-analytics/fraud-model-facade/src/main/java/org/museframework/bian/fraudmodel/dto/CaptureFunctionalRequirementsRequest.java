package org.museframework.bian.fraudmodel.dto;

public class CaptureFunctionalRequirementsRequest {
    private String fraudmodelid;

    private String functionalrequirementsid;

    private org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements functionalRequirements;

    public void setFraudmodelid(String fraudmodelid) {
        this.fraudmodelid = fraudmodelid;
    }

    public String getFraudmodelid() {
        return fraudmodelid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.fraudmodel.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}