/*Assessment of the acceptability of a disbursement instruction*/
package org.museframework.bian.classes;

public class DisbursementAssessment {
    /**/
    private String disbursementAuthorizingEmployeeReference;

    /**/
    private String disbursementAssessmentResult;

    public void setDisbursementAuthorizingEmployeeReference(String disbursementAuthorizingEmployeeReference) {
        this.disbursementAuthorizingEmployeeReference = disbursementAuthorizingEmployeeReference;
    }

    public String getDisbursementAuthorizingEmployeeReference() {
        return disbursementAuthorizingEmployeeReference;
    }

    public void setDisbursementAssessmentResult(String disbursementAssessmentResult) {
        this.disbursementAssessmentResult = disbursementAssessmentResult;
    }

    public String getDisbursementAssessmentResult() {
        return disbursementAssessmentResult;
    }
}