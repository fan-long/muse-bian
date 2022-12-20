/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.productdesign.dto.bq;

public class Testing {
    /*Reference to a type of product or service specification test*/
    private org.museframework.bian.classes.Object productandServiceSpecificationTestReference;

    /*Defines the type of test (e.g. user/consumer checks, profitability simulations, business acceptance etc.)*/
    private String productandServiceSpecificationTestType;

    /*Reference to the testing environment used to apply the test (can include production events and transactions to simulate performance)*/
    private org.museframework.bian.classes.Object productandServiceSpecificationTestHarnessReference;

    /*Record of testing applied to the product or service specification*/
    private String productandServiceSpecificationTestResult;

    /*Reference to a type of testing activity*/
    private org.museframework.bian.classes.Object productandServiceSpecificationTestingTaskReference;

    /*The record of work products used for this testing activity*/
    private String productandServiceSpecificationTestingTaskRecord;

    /*Reference to compliance conformance check for the specification*/
    private org.museframework.bian.classes.Object productandServiceSpecificationComplianceTaskReference;

    /*Record of the compliance conformance check for the specification*/
    private String productandServiceSpecificationComplianceTaskRecord;

    /*Reference to a compliance task performed against the specification*/
    private org.museframework.bian.classes.Object productandServiceSpecificationComplianceTestReference;

    /*Record of the compliance test applied to the specification*/
    private String productandServiceSpecificationComplianceTestType;

    public void setProductandServiceSpecificationTestReference(org.museframework.bian.classes.Object productandServiceSpecificationTestReference) {
        this.productandServiceSpecificationTestReference = productandServiceSpecificationTestReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceSpecificationTestReference() {
        return productandServiceSpecificationTestReference;
    }

    public void setProductandServiceSpecificationTestType(String productandServiceSpecificationTestType) {
        this.productandServiceSpecificationTestType = productandServiceSpecificationTestType;
    }

    public String getProductandServiceSpecificationTestType() {
        return productandServiceSpecificationTestType;
    }

    public void setProductandServiceSpecificationTestHarnessReference(org.museframework.bian.classes.Object productandServiceSpecificationTestHarnessReference) {
        this.productandServiceSpecificationTestHarnessReference = productandServiceSpecificationTestHarnessReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceSpecificationTestHarnessReference() {
        return productandServiceSpecificationTestHarnessReference;
    }

    public void setProductandServiceSpecificationTestResult(String productandServiceSpecificationTestResult) {
        this.productandServiceSpecificationTestResult = productandServiceSpecificationTestResult;
    }

    public String getProductandServiceSpecificationTestResult() {
        return productandServiceSpecificationTestResult;
    }

    public void setProductandServiceSpecificationTestingTaskReference(org.museframework.bian.classes.Object productandServiceSpecificationTestingTaskReference) {
        this.productandServiceSpecificationTestingTaskReference = productandServiceSpecificationTestingTaskReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceSpecificationTestingTaskReference() {
        return productandServiceSpecificationTestingTaskReference;
    }

    public void setProductandServiceSpecificationTestingTaskRecord(String productandServiceSpecificationTestingTaskRecord) {
        this.productandServiceSpecificationTestingTaskRecord = productandServiceSpecificationTestingTaskRecord;
    }

    public String getProductandServiceSpecificationTestingTaskRecord() {
        return productandServiceSpecificationTestingTaskRecord;
    }

    public void setProductandServiceSpecificationComplianceTaskReference(org.museframework.bian.classes.Object productandServiceSpecificationComplianceTaskReference) {
        this.productandServiceSpecificationComplianceTaskReference = productandServiceSpecificationComplianceTaskReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceSpecificationComplianceTaskReference() {
        return productandServiceSpecificationComplianceTaskReference;
    }

    public void setProductandServiceSpecificationComplianceTaskRecord(String productandServiceSpecificationComplianceTaskRecord) {
        this.productandServiceSpecificationComplianceTaskRecord = productandServiceSpecificationComplianceTaskRecord;
    }

    public String getProductandServiceSpecificationComplianceTaskRecord() {
        return productandServiceSpecificationComplianceTaskRecord;
    }

    public void setProductandServiceSpecificationComplianceTestReference(org.museframework.bian.classes.Object productandServiceSpecificationComplianceTestReference) {
        this.productandServiceSpecificationComplianceTestReference = productandServiceSpecificationComplianceTestReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceSpecificationComplianceTestReference() {
        return productandServiceSpecificationComplianceTestReference;
    }

    public void setProductandServiceSpecificationComplianceTestType(String productandServiceSpecificationComplianceTestType) {
        this.productandServiceSpecificationComplianceTestType = productandServiceSpecificationComplianceTestType;
    }

    public String getProductandServiceSpecificationComplianceTestType() {
        return productandServiceSpecificationComplianceTestType;
    }
}