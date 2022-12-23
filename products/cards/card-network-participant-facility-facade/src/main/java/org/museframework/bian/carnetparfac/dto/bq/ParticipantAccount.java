/*The product features/services available with a financical facility*/
package org.museframework.bian.carnetparfac.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ParticipantAccount {
    /*Reference to the posting transaction against the network participant account*/
    @MetaField
    private String participantAccountPostingTransaction;

    /*Annotation of the reason for the positing (e.g. posting for fees, chargebacks, settlement)*/
    @MetaField
    private String networkParticipantFacilityAccountPostingPurpose;

    /*Posted amount  (probably captured as a credit/debit pair)*/
    @MetaField
    private String networkParticipantFacilityAccountPostingAmount;

    /*The value date for the posting*/
    @MetaField
    private String networkParticipantFacilityAccountPostingValueDate;

    /*Confirmation of the posting action*/
    @MetaField
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