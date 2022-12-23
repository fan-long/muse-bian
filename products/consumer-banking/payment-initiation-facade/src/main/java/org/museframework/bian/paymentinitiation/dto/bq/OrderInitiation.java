/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.paymentinitiation.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OrderInitiation {
    /*The reference to the payment order processing task*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentOrderProcedureInstanceReference;

    /*The returned status of the payment order processing*/
    @MetaField
    private String paymentOrderProcedureInstanceStatus;

    /*Details of the payment order initiation task*/
    @MetaField
    private String orderInitiationTaskResult;

    public void setPaymentOrderProcedureInstanceReference(org.museframework.bian.classes.Object paymentOrderProcedureInstanceReference) {
        this.paymentOrderProcedureInstanceReference = paymentOrderProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getPaymentOrderProcedureInstanceReference() {
        return paymentOrderProcedureInstanceReference;
    }

    public void setPaymentOrderProcedureInstanceStatus(String paymentOrderProcedureInstanceStatus) {
        this.paymentOrderProcedureInstanceStatus = paymentOrderProcedureInstanceStatus;
    }

    public String getPaymentOrderProcedureInstanceStatus() {
        return paymentOrderProcedureInstanceStatus;
    }

    public void setOrderInitiationTaskResult(String orderInitiationTaskResult) {
        this.orderInitiationTaskResult = orderInitiationTaskResult;
    }

    public String getOrderInitiationTaskResult() {
        return orderInitiationTaskResult;
    }
}