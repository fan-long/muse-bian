/*Operate equipment and/or a largely automated facility within Card Transaction Switch. */
package org.museframework.bian.cartraswi.dto.cr;

public class CardTransactionSwitchOperatingSession {
    /*Refers to the card network*/
    private org.museframework.bian.classes.Object networkReference;

    /*Reference to the Acquiring bank for which the Network orchestrates transaction routing*/
    private org.museframework.bian.classes.Object participantAcquirerBankReference;

    /*Defines transaction routing details - referenced by the Network*/
    private String participantAcquirerBanktransactionRoutingDetails;

    /*Reference to the Issuing bank for which the Network orchestrates transaction routing*/
    private org.museframework.bian.classes.Object participantIssuerBankReference;

    /*Defines transaction routing details - referenced by the Network*/
    private String participantIssuerBankTransactionRoutingDetails;

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

    public void setParticipantAcquirerBanktransactionRoutingDetails(String participantAcquirerBanktransactionRoutingDetails) {
        this.participantAcquirerBanktransactionRoutingDetails = participantAcquirerBanktransactionRoutingDetails;
    }

    public String getParticipantAcquirerBanktransactionRoutingDetails() {
        return participantAcquirerBanktransactionRoutingDetails;
    }

    public void setParticipantIssuerBankReference(org.museframework.bian.classes.Object participantIssuerBankReference) {
        this.participantIssuerBankReference = participantIssuerBankReference;
    }

    public org.museframework.bian.classes.Object getParticipantIssuerBankReference() {
        return participantIssuerBankReference;
    }

    public void setParticipantIssuerBankTransactionRoutingDetails(String participantIssuerBankTransactionRoutingDetails) {
        this.participantIssuerBankTransactionRoutingDetails = participantIssuerBankTransactionRoutingDetails;
    }

    public String getParticipantIssuerBankTransactionRoutingDetails() {
        return participantIssuerBankTransactionRoutingDetails;
    }
}