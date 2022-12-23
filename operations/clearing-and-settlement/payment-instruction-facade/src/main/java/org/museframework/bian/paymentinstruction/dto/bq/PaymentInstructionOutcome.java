/*A course of action for doing Payment Instruction Workstep in the context of executing the Payment Instruction Workstep*/
package org.museframework.bian.paymentinstruction.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaymentInstructionOutcome {
    /**/
    @MetaField
    private String paymentInstructionWorkProduct;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure paymentInstructionProcedure;

    public void setPaymentInstructionWorkProduct(String paymentInstructionWorkProduct) {
        this.paymentInstructionWorkProduct = paymentInstructionWorkProduct;
    }

    public String getPaymentInstructionWorkProduct() {
        return paymentInstructionWorkProduct;
    }

    public void setPaymentInstructionProcedure(org.museframework.bian.classes.Procedure paymentInstructionProcedure) {
        this.paymentInstructionProcedure = paymentInstructionProcedure;
    }

    public org.museframework.bian.classes.Procedure getPaymentInstructionProcedure() {
        return paymentInstructionProcedure;
    }
}