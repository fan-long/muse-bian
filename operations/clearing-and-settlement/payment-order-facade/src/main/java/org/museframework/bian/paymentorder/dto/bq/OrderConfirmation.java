/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.paymentorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OrderConfirmation {
    /*The type of compliance check performed (e.g. AML, Watchlists)*/
    @MetaField
    private String paymentOrderComplianceCheckType;

    /*The outcome of the compliance check*/
    @MetaField
    private String paymentOrderComplianceCheckResult;

    /*Details of the overall confirmation checking process*/
    @MetaField
    private String orderConfirmationTaskResult;

    public void setPaymentOrderComplianceCheckType(String paymentOrderComplianceCheckType) {
        this.paymentOrderComplianceCheckType = paymentOrderComplianceCheckType;
    }

    public String getPaymentOrderComplianceCheckType() {
        return paymentOrderComplianceCheckType;
    }

    public void setPaymentOrderComplianceCheckResult(String paymentOrderComplianceCheckResult) {
        this.paymentOrderComplianceCheckResult = paymentOrderComplianceCheckResult;
    }

    public String getPaymentOrderComplianceCheckResult() {
        return paymentOrderComplianceCheckResult;
    }

    public void setOrderConfirmationTaskResult(String orderConfirmationTaskResult) {
        this.orderConfirmationTaskResult = orderConfirmationTaskResult;
    }

    public String getOrderConfirmationTaskResult() {
        return orderConfirmationTaskResult;
    }
}