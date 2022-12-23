/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.fraudmodel.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Testing {
    /*Reference to a type of test*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudModelTestReference;

    /*Defines the type of test (e.g. unit, integration, load, user acceptance etc.)*/
    @MetaField
    private String fraudModelTestType;

    /*Reference to the testing environment used to apply the test*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudModelTestHarnessReference;

    /*Record of testing applied to the model*/
    @MetaField
    private String fraudModelTestResult;

    /*Reference to a type of testing activity*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudModelTestingTaskReference;

    /*The record of work products used for this testing activity*/
    @MetaField
    private String fraudModelTestingTaskRecord;

    /*Reference to compliance conformance check for the specification*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudModelComplianceTaskReference;

    /*Record of the compliance conformance check for the specification*/
    @MetaField
    private String fraudModelComplianceTaskRecord;

    /*Reference to a compliance task performed against the specification*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudModelComplianceTestReference;

    /*Record of the compliance test applied to the specification*/
    @MetaField
    private String fraudModelComplianceTestType;

    public void setFraudModelTestReference(org.museframework.bian.classes.Object fraudModelTestReference) {
        this.fraudModelTestReference = fraudModelTestReference;
    }

    public org.museframework.bian.classes.Object getFraudModelTestReference() {
        return fraudModelTestReference;
    }

    public void setFraudModelTestType(String fraudModelTestType) {
        this.fraudModelTestType = fraudModelTestType;
    }

    public String getFraudModelTestType() {
        return fraudModelTestType;
    }

    public void setFraudModelTestHarnessReference(org.museframework.bian.classes.Object fraudModelTestHarnessReference) {
        this.fraudModelTestHarnessReference = fraudModelTestHarnessReference;
    }

    public org.museframework.bian.classes.Object getFraudModelTestHarnessReference() {
        return fraudModelTestHarnessReference;
    }

    public void setFraudModelTestResult(String fraudModelTestResult) {
        this.fraudModelTestResult = fraudModelTestResult;
    }

    public String getFraudModelTestResult() {
        return fraudModelTestResult;
    }

    public void setFraudModelTestingTaskReference(org.museframework.bian.classes.Object fraudModelTestingTaskReference) {
        this.fraudModelTestingTaskReference = fraudModelTestingTaskReference;
    }

    public org.museframework.bian.classes.Object getFraudModelTestingTaskReference() {
        return fraudModelTestingTaskReference;
    }

    public void setFraudModelTestingTaskRecord(String fraudModelTestingTaskRecord) {
        this.fraudModelTestingTaskRecord = fraudModelTestingTaskRecord;
    }

    public String getFraudModelTestingTaskRecord() {
        return fraudModelTestingTaskRecord;
    }

    public void setFraudModelComplianceTaskReference(org.museframework.bian.classes.Object fraudModelComplianceTaskReference) {
        this.fraudModelComplianceTaskReference = fraudModelComplianceTaskReference;
    }

    public org.museframework.bian.classes.Object getFraudModelComplianceTaskReference() {
        return fraudModelComplianceTaskReference;
    }

    public void setFraudModelComplianceTaskRecord(String fraudModelComplianceTaskRecord) {
        this.fraudModelComplianceTaskRecord = fraudModelComplianceTaskRecord;
    }

    public String getFraudModelComplianceTaskRecord() {
        return fraudModelComplianceTaskRecord;
    }

    public void setFraudModelComplianceTestReference(org.museframework.bian.classes.Object fraudModelComplianceTestReference) {
        this.fraudModelComplianceTestReference = fraudModelComplianceTestReference;
    }

    public org.museframework.bian.classes.Object getFraudModelComplianceTestReference() {
        return fraudModelComplianceTestReference;
    }

    public void setFraudModelComplianceTestType(String fraudModelComplianceTestType) {
        this.fraudModelComplianceTestType = fraudModelComplianceTestType;
    }

    public String getFraudModelComplianceTestType() {
        return fraudModelComplianceTestType;
    }
}