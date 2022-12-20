/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.cusbehmod.dto.bq;

public class Testing {
    /*Reference to a type of test*/
    private org.museframework.bian.classes.Object customerBehaviorModelTestReference;

    /*Defines the type of test (e.g. unit, integration, load, user acceptance etc.)*/
    private String customerBehaviorModelTestType;

    /*Reference to the testing environment used to apply the test*/
    private org.museframework.bian.classes.Object customerBehaviorModelTestHarnessReference;

    /*Record of testing applied to the model*/
    private String customerBehaviorModelTestResult;

    /*Reference to a type of testing activity*/
    private org.museframework.bian.classes.Object customerBehaviorModelTestingTaskReference;

    /*The record of work products used for this testing activity*/
    private String customerBehaviorModelTestingTaskRecord;

    /*Reference to compliance conformance check for the specification*/
    private org.museframework.bian.classes.Object customerBehaviorModelComplianceTaskReference;

    /*Record of the compliance conformance check for the specification*/
    private String customerBehaviorModelComplianceTaskRecord;

    /*Reference to a compliance task performed against the specification*/
    private org.museframework.bian.classes.Object customerBehaviorModelComplianceTestReference;

    /*Record of the compliance test applied to the specification*/
    private String customerBehaviorModelComplianceTestType;

    public void setCustomerBehaviorModelTestReference(org.museframework.bian.classes.Object customerBehaviorModelTestReference) {
        this.customerBehaviorModelTestReference = customerBehaviorModelTestReference;
    }

    public org.museframework.bian.classes.Object getCustomerBehaviorModelTestReference() {
        return customerBehaviorModelTestReference;
    }

    public void setCustomerBehaviorModelTestType(String customerBehaviorModelTestType) {
        this.customerBehaviorModelTestType = customerBehaviorModelTestType;
    }

    public String getCustomerBehaviorModelTestType() {
        return customerBehaviorModelTestType;
    }

    public void setCustomerBehaviorModelTestHarnessReference(org.museframework.bian.classes.Object customerBehaviorModelTestHarnessReference) {
        this.customerBehaviorModelTestHarnessReference = customerBehaviorModelTestHarnessReference;
    }

    public org.museframework.bian.classes.Object getCustomerBehaviorModelTestHarnessReference() {
        return customerBehaviorModelTestHarnessReference;
    }

    public void setCustomerBehaviorModelTestResult(String customerBehaviorModelTestResult) {
        this.customerBehaviorModelTestResult = customerBehaviorModelTestResult;
    }

    public String getCustomerBehaviorModelTestResult() {
        return customerBehaviorModelTestResult;
    }

    public void setCustomerBehaviorModelTestingTaskReference(org.museframework.bian.classes.Object customerBehaviorModelTestingTaskReference) {
        this.customerBehaviorModelTestingTaskReference = customerBehaviorModelTestingTaskReference;
    }

    public org.museframework.bian.classes.Object getCustomerBehaviorModelTestingTaskReference() {
        return customerBehaviorModelTestingTaskReference;
    }

    public void setCustomerBehaviorModelTestingTaskRecord(String customerBehaviorModelTestingTaskRecord) {
        this.customerBehaviorModelTestingTaskRecord = customerBehaviorModelTestingTaskRecord;
    }

    public String getCustomerBehaviorModelTestingTaskRecord() {
        return customerBehaviorModelTestingTaskRecord;
    }

    public void setCustomerBehaviorModelComplianceTaskReference(org.museframework.bian.classes.Object customerBehaviorModelComplianceTaskReference) {
        this.customerBehaviorModelComplianceTaskReference = customerBehaviorModelComplianceTaskReference;
    }

    public org.museframework.bian.classes.Object getCustomerBehaviorModelComplianceTaskReference() {
        return customerBehaviorModelComplianceTaskReference;
    }

    public void setCustomerBehaviorModelComplianceTaskRecord(String customerBehaviorModelComplianceTaskRecord) {
        this.customerBehaviorModelComplianceTaskRecord = customerBehaviorModelComplianceTaskRecord;
    }

    public String getCustomerBehaviorModelComplianceTaskRecord() {
        return customerBehaviorModelComplianceTaskRecord;
    }

    public void setCustomerBehaviorModelComplianceTestReference(org.museframework.bian.classes.Object customerBehaviorModelComplianceTestReference) {
        this.customerBehaviorModelComplianceTestReference = customerBehaviorModelComplianceTestReference;
    }

    public org.museframework.bian.classes.Object getCustomerBehaviorModelComplianceTestReference() {
        return customerBehaviorModelComplianceTestReference;
    }

    public void setCustomerBehaviorModelComplianceTestType(String customerBehaviorModelComplianceTestType) {
        this.customerBehaviorModelComplianceTestType = customerBehaviorModelComplianceTestType;
    }

    public String getCustomerBehaviorModelComplianceTestType() {
        return customerBehaviorModelComplianceTestType;
    }
}