/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Clearing. */
package org.museframework.bian.cardclearing.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CardClearingProcedure
@MetaDto
public class CardClearingProcedure {
    /*Refers to the card network*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object networkReference;

    /*Reference to the Acquiring bank for which the Network orchestrates clearing processing*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object participantAcquirerBankReference;

    /*Defines card clearing fees/terms in force - referenced by Network*/
    @MetaField(0)
    private String participantAcquirerBankClearingandSettlementTerms;

    /*Reference to the Issuing bank for which the Network orchestrates clearing processing*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object participantIssuerBankReference;

    /*Defines card clearing fees/terms in force - referenced by Network*/
    @MetaField(0)
    private String participantIssuerBankClearingandSettlementTerms;

    /*Defines the type of clearing process - e.g. capture, batch, chargeback between combinations of N,I&A*/
    @MetaField(0)
    private String cardClearingProcessType;

    /*The scheduled time for the process - likely initiation time*/
    @MetaField(0)
    private String cardClearingProcessDateTime;

    /*The schedule of activities for card clearing*/
    @MetaField(0)
    private String cardClearingServiceSchedule;

    public void setNetworkReference(org.museframework.bian.classes.Object networkReference) {
        this.networkReference = networkReference;
    }

    public org.museframework.bian.classes.Object getNetworkReference() {
        return networkReference;
    }

    public void setParticipantAcquirerBankReference(org.museframework.bian.classes.Object participantAcquirerBankReference) {
        this.participantAcquirerBankReference = participantAcquirerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantAcquirerBankReference() {
        return participantAcquirerBankReference;
    }

    public void setParticipantAcquirerBankClearingandSettlementTerms(String participantAcquirerBankClearingandSettlementTerms) {
        this.participantAcquirerBankClearingandSettlementTerms = participantAcquirerBankClearingandSettlementTerms;
    }

    public String getParticipantAcquirerBankClearingandSettlementTerms() {
        return participantAcquirerBankClearingandSettlementTerms;
    }

    public void setParticipantIssuerBankReference(org.museframework.bian.classes.Object participantIssuerBankReference) {
        this.participantIssuerBankReference = participantIssuerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantIssuerBankReference() {
        return participantIssuerBankReference;
    }

    public void setParticipantIssuerBankClearingandSettlementTerms(String participantIssuerBankClearingandSettlementTerms) {
        this.participantIssuerBankClearingandSettlementTerms = participantIssuerBankClearingandSettlementTerms;
    }

    public String getParticipantIssuerBankClearingandSettlementTerms() {
        return participantIssuerBankClearingandSettlementTerms;
    }

    public void setCardClearingProcessType(String cardClearingProcessType) {
        this.cardClearingProcessType = cardClearingProcessType;
    }

    public String getCardClearingProcessType() {
        return cardClearingProcessType;
    }

    public void setCardClearingProcessDateTime(String cardClearingProcessDateTime) {
        this.cardClearingProcessDateTime = cardClearingProcessDateTime;
    }

    public String getCardClearingProcessDateTime() {
        return cardClearingProcessDateTime;
    }

    public void setCardClearingServiceSchedule(String cardClearingServiceSchedule) {
        this.cardClearingServiceSchedule = cardClearingServiceSchedule;
    }

    public String getCardClearingServiceSchedule() {
        return cardClearingServiceSchedule;
    }
}