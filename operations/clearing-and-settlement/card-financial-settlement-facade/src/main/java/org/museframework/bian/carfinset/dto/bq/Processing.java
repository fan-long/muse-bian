/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.carfinset.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Processing {
    /*Defines the card settlement fees/terms in force*/
    @MetaField(0)
    private String participantAcquirerBankSettlementTerms;

    /*Defines card settlement fees/terms in force*/
    @MetaField(0)
    private String participantIssuerBankSettlementTerms;

    public void setParticipantAcquirerBankSettlementTerms(String participantAcquirerBankSettlementTerms) {
        this.participantAcquirerBankSettlementTerms = participantAcquirerBankSettlementTerms;
    }

    public String getParticipantAcquirerBankSettlementTerms() {
        return participantAcquirerBankSettlementTerms;
    }

    public void setParticipantIssuerBankSettlementTerms(String participantIssuerBankSettlementTerms) {
        this.participantIssuerBankSettlementTerms = participantIssuerBankSettlementTerms;
    }

    public String getParticipantIssuerBankSettlementTerms() {
        return participantIssuerBankSettlementTerms;
    }
}