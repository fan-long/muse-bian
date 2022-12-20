/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.achoperations.dto.bq;

public class Reconciliation {
    /*Details of the reconciliation resolution*/
    private String ACHReconciliationTaskResult;

    public void setACHReconciliationTaskResult(String ACHReconciliationTaskResult) {
        this.ACHReconciliationTaskResult = ACHReconciliationTaskResult;
    }

    public String getACHReconciliationTaskResult() {
        return ACHReconciliationTaskResult;
    }
}