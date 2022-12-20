package org.museframework.bian.productdesign.dto;

public class RetrieveFunctionalRequirementsRequest {
    private String productdesignid;

    private String functionalrequirementsid;

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
}