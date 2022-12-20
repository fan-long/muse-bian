/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.consumerinvestments.dto.bq;

public class Compliance {
    /*The type of compliance check performed (e.g. AML, Watch lists)*/
    private String consumerSecuritiesOrderTransactionComplianceCheckType;

    /*The outcome of the compliance check*/
    private String consumerSecuritiesOrderTransactionComplianceCheckResult;

    /*Details of the overall compliance checking process*/
    private String consumerSecuritiesOrderTransactionComplianceTaskResult;

    public void setConsumerSecuritiesOrderTransactionComplianceCheckType(String consumerSecuritiesOrderTransactionComplianceCheckType) {
        this.consumerSecuritiesOrderTransactionComplianceCheckType = consumerSecuritiesOrderTransactionComplianceCheckType;
    }

    public String getConsumerSecuritiesOrderTransactionComplianceCheckType() {
        return consumerSecuritiesOrderTransactionComplianceCheckType;
    }

    public void setConsumerSecuritiesOrderTransactionComplianceCheckResult(String consumerSecuritiesOrderTransactionComplianceCheckResult) {
        this.consumerSecuritiesOrderTransactionComplianceCheckResult = consumerSecuritiesOrderTransactionComplianceCheckResult;
    }

    public String getConsumerSecuritiesOrderTransactionComplianceCheckResult() {
        return consumerSecuritiesOrderTransactionComplianceCheckResult;
    }

    public void setConsumerSecuritiesOrderTransactionComplianceTaskResult(String consumerSecuritiesOrderTransactionComplianceTaskResult) {
        this.consumerSecuritiesOrderTransactionComplianceTaskResult = consumerSecuritiesOrderTransactionComplianceTaskResult;
    }

    public String getConsumerSecuritiesOrderTransactionComplianceTaskResult() {
        return consumerSecuritiesOrderTransactionComplianceTaskResult;
    }
}