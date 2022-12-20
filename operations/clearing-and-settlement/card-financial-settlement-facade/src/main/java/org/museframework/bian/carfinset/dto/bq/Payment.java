/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.carfinset.dto.bq;

public class Payment {
    /*Transaction details*/
    private String participantPaymentTransaction;

    public void setParticipantPaymentTransaction(String participantPaymentTransaction) {
        this.participantPaymentTransaction = participantPaymentTransaction;
    }

    public String getParticipantPaymentTransaction() {
        return participantPaymentTransaction;
    }
}