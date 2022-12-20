/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Card Financial Settlement. */
package org.museframework.bian.carfinset.dto.cr;

public class CardFinancialSettlementProcedure {
    /*Refers to the card network*/
    private org.museframework.bian.classes.Object networkReference;

    /*Defines the type of settlement process (e.g. scheduled processing, ad-hoc processing)*/
    private String cardFinancialSettlementProcessType;

    /*The scheduled time for the process - likely initiation time*/
    private String cardFinancialSettlementProcessDateTime;

    /*Defines the type and scheduling of card settlement processing, includes Issuer and Acquirer involvement/scheduling details as necessary*/
    private String cardFinancialSettlementServiceSchedule;

    /*Refers to the Acquiring bank for which the Network orchestrates settlement processing*/
    private org.museframework.bian.classes.Object participantAcquirerBankReference;

    /*Refers to the Issuing bank for which the Network orchestrates settlement processing*/
    private org.museframework.bian.classes.Object participantIssuerBankReference;

    public void setNetworkReference(org.museframework.bian.classes.Object networkReference) {
        this.networkReference = networkReference;
    }

    public org.museframework.bian.classes.Object getNetworkReference() {
        return networkReference;
    }

    public void setCardFinancialSettlementProcessType(String cardFinancialSettlementProcessType) {
        this.cardFinancialSettlementProcessType = cardFinancialSettlementProcessType;
    }

    public String getCardFinancialSettlementProcessType() {
        return cardFinancialSettlementProcessType;
    }

    public void setCardFinancialSettlementProcessDateTime(String cardFinancialSettlementProcessDateTime) {
        this.cardFinancialSettlementProcessDateTime = cardFinancialSettlementProcessDateTime;
    }

    public String getCardFinancialSettlementProcessDateTime() {
        return cardFinancialSettlementProcessDateTime;
    }

    public void setCardFinancialSettlementServiceSchedule(String cardFinancialSettlementServiceSchedule) {
        this.cardFinancialSettlementServiceSchedule = cardFinancialSettlementServiceSchedule;
    }

    public String getCardFinancialSettlementServiceSchedule() {
        return cardFinancialSettlementServiceSchedule;
    }

    public void setParticipantAcquirerBankReference(org.museframework.bian.classes.Object participantAcquirerBankReference) {
        this.participantAcquirerBankReference = participantAcquirerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantAcquirerBankReference() {
        return participantAcquirerBankReference;
    }

    public void setParticipantIssuerBankReference(org.museframework.bian.classes.Object participantIssuerBankReference) {
        this.participantIssuerBankReference = participantIssuerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantIssuerBankReference() {
        return participantIssuerBankReference;
    }
}