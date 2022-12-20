package org.museframework.bian.productdesign.dto;

public class UpdateTestingRequest {
    private String productdesignid;

    private String testingid;

    private org.museframework.bian.productdesign.dto.bq.Testing testing;

    public void setProductdesignid(String productdesignid) {
        this.productdesignid = productdesignid;
    }

    public String getProductdesignid() {
        return productdesignid;
    }

    public void setTestingid(String testingid) {
        this.testingid = testingid;
    }

    public String getTestingid() {
        return testingid;
    }

    public void setTesting(org.museframework.bian.productdesign.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.productdesign.dto.bq.Testing getTesting() {
        return testing;
    }
}