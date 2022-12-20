/*Party who plays a specific role in a specific payment instruction. */
package org.museframework.bian.classes;

public class PaymentInstructionInvolvement {
    /**/
    private String paymentInstructionInvolvementName;

    /**/
    private org.museframework.bian.enumerations.Paymentinstructioninvolvementtypevalues paymentInstructionInvolvementType;

    public void setPaymentInstructionInvolvementName(String paymentInstructionInvolvementName) {
        this.paymentInstructionInvolvementName = paymentInstructionInvolvementName;
    }

    public String getPaymentInstructionInvolvementName() {
        return paymentInstructionInvolvementName;
    }

    public void setPaymentInstructionInvolvementType(org.museframework.bian.enumerations.Paymentinstructioninvolvementtypevalues paymentInstructionInvolvementType) {
        this.paymentInstructionInvolvementType = paymentInstructionInvolvementType;
    }

    public org.museframework.bian.enumerations.Paymentinstructioninvolvementtypevalues getPaymentInstructionInvolvementType() {
        return paymentInstructionInvolvementType;
    }
}