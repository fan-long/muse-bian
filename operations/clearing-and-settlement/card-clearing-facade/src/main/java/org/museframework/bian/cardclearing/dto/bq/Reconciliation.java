/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

public class Reconciliation {
    /*Details of the transaction matching processing*/
    private String reconciliationTaskResult;

    public void setReconciliationTaskResult(String reconciliationTaskResult) {
        this.reconciliationTaskResult = reconciliationTaskResult;
    }

    public String getReconciliationTaskResult() {
        return reconciliationTaskResult;
    }
}