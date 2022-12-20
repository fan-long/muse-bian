/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Card Network Participant Facility. */
package org.museframework.bian.carnetparfac.dto.cr;

public class CardNetworkParticipantFacility {
    /*Reference to the participant facility product instance*/
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Reference to the participant primary party/owner*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the legal entity (typically the customer)*/
    private org.museframework.bian.classes.Object partyReference;

    /*The operational configuration terms/options that govern the participant facility arrangement*/
    private String facilityTerms;

    /*Reference to the Acquiring bank for which the Network orchestrates clearing and settlement processing*/
    private org.museframework.bian.classes.Object participantAcquirerBankReference;

    /*Defines the card clearing fees/terms in force*/
    private String participantAcquirerBankClearingandSettlementTerms;

    /*Defines the tasks and processing schedule for the participant*/
    private String participantAcquirerBankServiceSchedule;

    /*Reference to the Issuing bank for which the Network orchestrates clearing and settlement processing*/
    private org.museframework.bian.classes.Object participantIssuerBankReference;

    /*Defines the card clearing fees/terms in force*/
    private String participantIssuerBankClearingandSettlementTerms;

    /*Defines the tasks and processing schedule for the participant)*/
    private String participantIssuerBankServiceSchedule;

    public void setProductandServiceReference(org.museframework.bian.classes.Object productandServiceReference) {
        this.productandServiceReference = productandServiceReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceReference() {
        return productandServiceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setPartyReference(org.museframework.bian.classes.Object partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Object getPartyReference() {
        return partyReference;
    }

    public void setFacilityTerms(String facilityTerms) {
        this.facilityTerms = facilityTerms;
    }

    public String getFacilityTerms() {
        return facilityTerms;
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

    public void setParticipantAcquirerBankServiceSchedule(String participantAcquirerBankServiceSchedule) {
        this.participantAcquirerBankServiceSchedule = participantAcquirerBankServiceSchedule;
    }

    public String getParticipantAcquirerBankServiceSchedule() {
        return participantAcquirerBankServiceSchedule;
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

    public void setParticipantIssuerBankServiceSchedule(String participantIssuerBankServiceSchedule) {
        this.participantIssuerBankServiceSchedule = participantIssuerBankServiceSchedule;
    }

    public String getParticipantIssuerBankServiceSchedule() {
        return participantIssuerBankServiceSchedule;
    }
}