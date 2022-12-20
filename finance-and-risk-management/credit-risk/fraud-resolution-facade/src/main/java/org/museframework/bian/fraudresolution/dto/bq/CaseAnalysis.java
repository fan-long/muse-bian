/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.fraudresolution.dto.bq;

public class CaseAnalysis {
    /*The result of the case analysis*/
    private String fraudCaseRootCause;

    public void setFraudCaseRootCause(String fraudCaseRootCause) {
        this.fraudCaseRootCause = fraudCaseRootCause;
    }

    public String getFraudCaseRootCause() {
        return fraudCaseRootCause;
    }
}