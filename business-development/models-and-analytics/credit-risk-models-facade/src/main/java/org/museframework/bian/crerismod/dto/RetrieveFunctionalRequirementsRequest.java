package org.museframework.bian.crerismod.dto;

public class RetrieveFunctionalRequirementsRequest {
    private String creditriskmodelsid;

    private String functionalrequirementsid;

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
}