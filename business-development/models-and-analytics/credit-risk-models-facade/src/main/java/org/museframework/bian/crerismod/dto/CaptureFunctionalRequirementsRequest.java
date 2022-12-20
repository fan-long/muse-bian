package org.museframework.bian.crerismod.dto;

public class CaptureFunctionalRequirementsRequest {
    private String creditriskmodelsid;

    private String functionalrequirementsid;

    private org.museframework.bian.crerismod.dto.bq.FunctionalRequirements functionalRequirements;

    public void setCreditriskmodelsid(String creditriskmodelsid) {
        this.creditriskmodelsid = creditriskmodelsid;
    }

    public String getCreditriskmodelsid() {
        return creditriskmodelsid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.crerismod.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.crerismod.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}