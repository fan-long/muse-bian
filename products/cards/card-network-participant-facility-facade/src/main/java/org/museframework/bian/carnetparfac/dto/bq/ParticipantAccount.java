/*The product features/services available with a financical facility*/
package org.museframework.bian.carnetparfac.dto.bq;

public class ParticipantAccount {
    /*Reference to the posting transaction against the network participant account*/
    private String participantAccountPostingTransaction;

    /*Annotation of the reason for the positing (e.g. posting for fees, chargebacks, settlement)*/
    private String networkParticipantFacilityAccountPostingPurpose;

    /*Posted amount  (probably captured as a credit/debit pair)*/
    private String networkParticipantFacilityAccountPostingAmount;

    /*The value date for the posting*/
    private String networkParticipantFacilityAccountPostingValueDate;

    /*Confirmation of the posting action*/
    private String networkParticipantFacilityAccountPostingResult;

    public void setParticipantAccountPostingTransaction(String participantAccountPostingTransaction) {
        this.participantAccountPostingTransaction = participantAccountPostingTransaction;
    }

    public String getParticipantAccountPostingTransaction() {
        return participantAccountPostingTransaction;
    }

    public void setNetworkParticipantFacilityAccountPostingPurpose(String networkParticipantFacilityAccountPostingPurpose) {
        this.networkParticipantFacilityAccountPostingPurpose = networkParticipantFacilityAccountPostingPurpose;
    }

    public String getNetworkParticipantFacilityAccountPostingPurpose() {
        return networkParticipantFacilityAccountPostingPurpose;
    }

    public void setNetworkParticipantFacilityAccountPostingAmount(String networkParticipantFacilityAccountPostingAmount) {
        this.networkParticipantFacilityAccountPostingAmount = networkParticipantFacilityAccountPostingAmount;
    }

    public String getNetworkParticipantFacilityAccountPostingAmount() {
        return networkParticipantFacilityAccountPostingAmount;
    }

    public void setNetworkParticipantFacilityAccountPostingValueDate(String networkParticipantFacilityAccountPostingValueDate) {
        this.networkParticipantFacilityAccountPostingValueDate = networkParticipantFacilityAccountPostingValueDate;
    }

    public String getNetworkParticipantFacilityAccountPostingValueDate() {
        return networkParticipantFacilityAccountPostingValueDate;
    }

    public void setNetworkParticipantFacilityAccountPostingResult(String networkParticipantFacilityAccountPostingResult) {
        this.networkParticipantFacilityAccountPostingResult = networkParticipantFacilityAccountPostingResult;
    }

    public String getNetworkParticipantFacilityAccountPostingResult() {
        return networkParticipantFacilityAccountPostingResult;
    }
}