/*Financial institution servicing an account for the payer. (adapted from ISO20022)*/
package org.museframework.bian.classes;

public class PayerBank {
    /*Identifier of the payer bank.*/
    private String payerBankIdentifier;

    public void setPayerBankIdentifier(String payerBankIdentifier) {
        this.payerBankIdentifier = payerBankIdentifier;
    }

    public String getPayerBankIdentifier() {
        return payerBankIdentifier;
    }
}