package org.museframework.bian.fraudmodel.dto;

public class RetrieveFunctionalRequirementsRequest {
    private String fraudmodelid;

    private String functionalrequirementsid;

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
}