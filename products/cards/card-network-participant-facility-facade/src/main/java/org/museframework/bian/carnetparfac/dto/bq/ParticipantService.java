/*The product features/services available with a financical facility*/
package org.museframework.bian.carnetparfac.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ParticipantService {
    /*Reference to the service request made by the network participant*/
    @MetaField
    private String participantServiceRecord;

    /*The type of request  (e.g. merchant alert, chargeback arbitration, chargeback reduction)*/
    @MetaField
    private String networkParticipantServiceType;

    /*Details of service charge levied against the Network Participant Facility*/
    @MetaField
    private String networkParticipantServiceCharge;

    /*Key dates and times associated with the provision of the service (e.g. initiation of service fulfillment)*/
    @MetaField
    private String networkParticipantServiceDateTime;

    /*Work documentation, forms and schedules produced and referenced during the network service delivery (includes charges, service activity log and results etc.)*/
    @MetaField
    private String networkParticipantNetworkServiceRequestWorkProduct;

    /*The result of the request in whatever form appropriate*/
    @MetaField
    private String networkParticipantNetworkServiceRequestResult;

    public void setParticipantServiceRecord(String participantServiceRecord) {
        this.participantServiceRecord = participantServiceRecord;
    }

    public String getParticipantServiceRecord() {
        return participantServiceRecord;
    }

    public void setNetworkParticipantServiceType(String networkParticipantServiceType) {
        this.networkParticipantServiceType = networkParticipantServiceType;
    }

    public String getNetworkParticipantServiceType() {
        return networkParticipantServiceType;
    }

    public void setNetworkParticipantServiceCharge(String networkParticipantServiceCharge) {
        this.networkParticipantServiceCharge = networkParticipantServiceCharge;
    }

    public String getNetworkParticipantServiceCharge() {
        return networkParticipantServiceCharge;
    }

    public void setNetworkParticipantServiceDateTime(String networkParticipantServiceDateTime) {
        this.networkParticipantServiceDateTime = networkParticipantServiceDateTime;
    }

    public String getNetworkParticipantServiceDateTime() {
        return networkParticipantServiceDateTime;
    }

    public void setNetworkParticipantNetworkServiceRequestWorkProduct(String networkParticipantNetworkServiceRequestWorkProduct) {
        this.networkParticipantNetworkServiceRequestWorkProduct = networkParticipantNetworkServiceRequestWorkProduct;
    }

    public String getNetworkParticipantNetworkServiceRequestWorkProduct() {
        return networkParticipantNetworkServiceRequestWorkProduct;
    }

    public void setNetworkParticipantNetworkServiceRequestResult(String networkParticipantNetworkServiceRequestResult) {
        this.networkParticipantNetworkServiceRequestResult = networkParticipantNetworkServiceRequestResult;
    }

    public String getNetworkParticipantNetworkServiceRequestResult() {
        return networkParticipantNetworkServiceRequestResult;
    }
}