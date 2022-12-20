/**/
package org.museframework.bian.classes;

public class TransactionStep {
    /**/
    private String transactionStepType;

    /**/
    private String transactionStepResult;

    /**/
    private String transactionStepStatus;

    public void setTransactionStepType(String transactionStepType) {
        this.transactionStepType = transactionStepType;
    }

    public String getTransactionStepType() {
        return transactionStepType;
    }

    public void setTransactionStepResult(String transactionStepResult) {
        this.transactionStepResult = transactionStepResult;
    }

    public String getTransactionStepResult() {
        return transactionStepResult;
    }

    public void setTransactionStepStatus(String transactionStepStatus) {
        this.transactionStepStatus = transactionStepStatus;
    }

    public String getTransactionStepStatus() {
        return transactionStepStatus;
    }
}