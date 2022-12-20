/*Task to negotiate repayment terms with the customer - which may include waiving delinquency charges as motivation.*/
package org.museframework.bian.classes;

public class PaymentTermsNegotiationWorkstep {
    /*The payment terms renegotiation decision, includes renegotiated terms and repayment schedule. */
    private String paymentTermsRenegotiationDecision;

    /*Work documentation, forms and schedules produced and referenced during the task. */
    private String paymentTermsWorkProduct;

    public void setPaymentTermsRenegotiationDecision(String paymentTermsRenegotiationDecision) {
        this.paymentTermsRenegotiationDecision = paymentTermsRenegotiationDecision;
    }

    public String getPaymentTermsRenegotiationDecision() {
        return paymentTermsRenegotiationDecision;
    }

    public void setPaymentTermsWorkProduct(String paymentTermsWorkProduct) {
        this.paymentTermsWorkProduct = paymentTermsWorkProduct;
    }

    public String getPaymentTermsWorkProduct() {
        return paymentTermsWorkProduct;
    }
}