/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.paymentinitiation.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Compliance {
    /*The type of compliance check performed (e.g. AML, Watchlists)*/
    @MetaField
    private String paymentTransactionComplianceCheckType;

    /*The outcome of the compliance check*/
    @MetaField
    private String paymentTransactionComplianceCheckResult;

    /*Details of the overall compliance checking process*/
    @MetaField
    private String paymentTransactionComplianceTaskResult;

    public void setPaymentTransactionComplianceCheckType(String paymentTransactionComplianceCheckType) {
        this.paymentTransactionComplianceCheckType = paymentTransactionComplianceCheckType;
    }

    public String getPaymentTransactionComplianceCheckType() {
        return paymentTransactionComplianceCheckType;
    }

    public void setPaymentTransactionComplianceCheckResult(String paymentTransactionComplianceCheckResult) {
        this.paymentTransactionComplianceCheckResult = paymentTransactionComplianceCheckResult;
    }

    public String getPaymentTransactionComplianceCheckResult() {
        return paymentTransactionComplianceCheckResult;
    }

    public void setPaymentTransactionComplianceTaskResult(String paymentTransactionComplianceTaskResult) {
        this.paymentTransactionComplianceTaskResult = paymentTransactionComplianceTaskResult;
    }

    public String getPaymentTransactionComplianceTaskResult() {
        return paymentTransactionComplianceTaskResult;
    }
}