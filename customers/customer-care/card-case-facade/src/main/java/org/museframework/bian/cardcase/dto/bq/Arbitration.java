/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcase.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Arbitration {
    /*Reference to the card transaction for the arbitration*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object arbitrationCardTransactionRecordReference;

    /*Reference to participant's use of a Network service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object networkParticipantNetworkServiceRequestReference;

    /*The record for the network service delivery, includes charges, service activity log and results etc.*/
    @MetaField(0)
    private String networkParticipantNetworkServiceRequestRecord;

    /*The requested service type (e.g. merchant alert, chargeback arbitration, chargeback reduction, arbitration)*/
    @MetaField(0)
    private String networkParticipantServiceType;

    /*The time the service was requested*/
    @MetaField(0)
    private String networkParticipantServiceDateTime;

    /*The outcome of the arbitration service request*/
    @MetaField(0)
    private String networkParticipantServiceResult;

    public void setArbitrationCardTransactionRecordReference(org.museframework.bian.classes.Object arbitrationCardTransactionRecordReference) {
        this.arbitrationCardTransactionRecordReference = arbitrationCardTransactionRecordReference;
    }

    public org.museframework.bian.classes.Object getArbitrationCardTransactionRecordReference() {
        return arbitrationCardTransactionRecordReference;
    }

    public void setNetworkParticipantNetworkServiceRequestReference(org.museframework.bian.classes.Object networkParticipantNetworkServiceRequestReference) {
        this.networkParticipantNetworkServiceRequestReference = networkParticipantNetworkServiceRequestReference;
    }

    public org.museframework.bian.classes.Object getNetworkParticipantNetworkServiceRequestReference() {
        return networkParticipantNetworkServiceRequestReference;
    }

    public void setNetworkParticipantNetworkServiceRequestRecord(String networkParticipantNetworkServiceRequestRecord) {
        this.networkParticipantNetworkServiceRequestRecord = networkParticipantNetworkServiceRequestRecord;
    }

    public String getNetworkParticipantNetworkServiceRequestRecord() {
        return networkParticipantNetworkServiceRequestRecord;
    }

    public void setNetworkParticipantServiceType(String networkParticipantServiceType) {
        this.networkParticipantServiceType = networkParticipantServiceType;
    }

    public String getNetworkParticipantServiceType() {
        return networkParticipantServiceType;
    }

    public void setNetworkParticipantServiceDateTime(String networkParticipantServiceDateTime) {
        this.networkParticipantServiceDateTime = networkParticipantServiceDateTime;
    }

    public String getNetworkParticipantServiceDateTime() {
        return networkParticipantServiceDateTime;
    }

    public void setNetworkParticipantServiceResult(String networkParticipantServiceResult) {
        this.networkParticipantServiceResult = networkParticipantServiceResult;
    }

    public String getNetworkParticipantServiceResult() {
        return networkParticipantServiceResult;
    }
}