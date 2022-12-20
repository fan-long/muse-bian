package org.museframework.bian.productdesign.dto;

public class RequestFunctionalRequirementsRequest {
    private String productdesignid;

    private String functionalrequirementsid;

    private org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements;

    public void setProductdesignid(String productdesignid) {
        this.productdesignid = productdesignid;
    }

    public String getProductdesignid() {
        return productdesignid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.productdesign.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}