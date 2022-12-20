/**/
package org.museframework.bian.classes;

public class MoneyTransferTransactionInvolvement {
    /**/
    private String moneyTransferInvolvementType;

    /**/
    private String moneyTransferInvolvedPartyReference;

    /**/
    private String moneyTransferTransactionReference;

    public void setMoneyTransferInvolvementType(String moneyTransferInvolvementType) {
        this.moneyTransferInvolvementType = moneyTransferInvolvementType;
    }

    public String getMoneyTransferInvolvementType() {
        return moneyTransferInvolvementType;
    }

    public void setMoneyTransferInvolvedPartyReference(String moneyTransferInvolvedPartyReference) {
        this.moneyTransferInvolvedPartyReference = moneyTransferInvolvedPartyReference;
    }

    public String getMoneyTransferInvolvedPartyReference() {
        return moneyTransferInvolvedPartyReference;
    }

    public void setMoneyTransferTransactionReference(String moneyTransferTransactionReference) {
        this.moneyTransferTransactionReference = moneyTransferTransactionReference;
    }

    public String getMoneyTransferTransactionReference() {
        return moneyTransferTransactionReference;
    }
}