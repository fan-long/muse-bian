/**/
package org.museframework.bian.classes;

public class CardNetworkParticpantService {
    /*The type of Network Participant Service  (e.g. merchant alert, chargeback arbitration, chargeback reduction)*/
    private String networkParticipantServiceType;

    /*Details of service charge levied against the Network Participant Facility.*/
    private String networkParticipantServiceCharge;

    /*Key dates and times associated with the provision of the service (e.g. initiation of service fulfillment)*/
    private String networkParticipantServiceDateOrTime;

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

    public void setNetworkParticipantServiceDateOrTime(String networkParticipantServiceDateOrTime) {
        this.networkParticipantServiceDateOrTime = networkParticipantServiceDateOrTime;
    }

    public String getNetworkParticipantServiceDateOrTime() {
        return networkParticipantServiceDateOrTime;
    }
}