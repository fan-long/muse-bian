/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.paymentorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ExecutionInitiation {
    /*The reference to the payment execution processing task*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentExecutionProcedureInstanceReference;

    /*The returned status of the payment execution processing*/
    @MetaField(0)
    private String paymentExecutionProcedureInstanceStatus;

    /*Details of the execution initiation task*/
    @MetaField(0)
    private String executionInitiationTaskResult;

    public void setPaymentExecutionProcedureInstanceReference(org.museframework.bian.classes.Object paymentExecutionProcedureInstanceReference) {
        this.paymentExecutionProcedureInstanceReference = paymentExecutionProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getPaymentExecutionProcedureInstanceReference() {
        return paymentExecutionProcedureInstanceReference;
    }

    public void setPaymentExecutionProcedureInstanceStatus(String paymentExecutionProcedureInstanceStatus) {
        this.paymentExecutionProcedureInstanceStatus = paymentExecutionProcedureInstanceStatus;
    }

    public String getPaymentExecutionProcedureInstanceStatus() {
        return paymentExecutionProcedureInstanceStatus;
    }

    public void setExecutionInitiationTaskResult(String executionInitiationTaskResult) {
        this.executionInitiationTaskResult = executionInitiationTaskResult;
    }

    public String getExecutionInitiationTaskResult() {
        return executionInitiationTaskResult;
    }
}