/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.carfinset.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Payment {
    /*Transaction details*/
    @MetaField(0)
    private String participantPaymentTransaction;

    public void setParticipantPaymentTransaction(String participantPaymentTransaction) {
        this.participantPaymentTransaction = participantPaymentTransaction;
    }

    public String getParticipantPaymentTransaction() {
        return participantPaymentTransaction;
    }
}