/*Operate equipment and/or a largely automated facility within Contact Handler. */
package org.museframework.bian.contacthandler.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerContactOperatingSession {
    /*Indicates whether this is an inbound or outbound contact (inbound is customer initiated, outbound is servicing resource initiated)*/
    @MetaField(0)
    private String customerContactInboundorOutboundIndicator;

    /*Reference to the active network operating session used to access customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object eBranchOperatingSessionReference;

    /*Reference to the active voice network used to access customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object advancedVoiceServiceOperatingSessionReference;

    /*Reference to the contact record assembled during the customer contact*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*The contact record consolidates all aspects of the contact that is cross-referenced by all  contact functions and called servicing sessions that make up the contact*/
    @MetaField(0)
    private String customerContactRecord;

    /*The customer reference as provided by the contacting party and verified by the authentication function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordCustomerReference;

    /*The contact device can be determined by the channel operations facilities (e.g. URL/ANI-phone number)*/
    @MetaField(0)
    private String customerContactRecordContactDevice;

    /*The contact authentication level is determined by the authentication function and can be updated during the contact*/
    @MetaField(0)
    private String customerContactRecordAuthenticationStatus;

    /*The routing selections made through the contact*/
    @MetaField(0)
    private String customerContactRecordRoutingSelectionStatus;

    /*The requested service from a menu option can be indicated by the customer when initiating or during contact*/
    @MetaField(0)
    private String customerContactRecordMenuSelection;

    /*The customer may provide details of servicing resource request when initiating or during contact*/
    @MetaField(0)
    private String customerContactRecordServicingRequest;

    /*Contact Handler can reference recent servicing activity for routing, security and servicing purposes (obtained from Service Domain Channel Activity History)*/
    @MetaField(0)
    private String customerContactRecordServicingEventHistory;

    /*Reference to the servicing position - can be where an inbound contact is routed, or the source of an outbound contact request*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordServicingPositionReference;

    /*Reference to the servicing resource - can be to handle an inbound contact or the source of an outbound contact request*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordServicingResourceReference;

    /*Records the actions performed during contact, including all dialogue sessions*/
    @MetaField(0)
    private String customerContactRecordActivityRecord;

    /*Reference to any contact session dialogue records created during the contact - there can be several*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerSessionDialogueReference;

    /*The customer session dialogue details and log*/
    @MetaField(0)
    private String customerSessionDialogueRecord;

    /*Records the start and end date times for the contact*/
    @MetaField(0)
    private String customerContactRecordDuration;

    /*Describes the interpreted result of the contact (e.g. completed, customer terminated, timed-out)*/
    @MetaField(0)
    private String customerContactRecordResult;

    public void setCustomerContactInboundorOutboundIndicator(String customerContactInboundorOutboundIndicator) {
        this.customerContactInboundorOutboundIndicator = customerContactInboundorOutboundIndicator;
    }

    public String getCustomerContactInboundorOutboundIndicator() {
        return customerContactInboundorOutboundIndicator;
    }

    public void seteBranchOperatingSessionReference(org.museframework.bian.classes.Object eBranchOperatingSessionReference) {
        this.eBranchOperatingSessionReference = eBranchOperatingSessionReference;
    }

    public org.museframework.bian.classes.Object geteBranchOperatingSessionReference() {
        return eBranchOperatingSessionReference;
    }

    public void setAdvancedVoiceServiceOperatingSessionReference(org.museframework.bian.classes.Object advancedVoiceServiceOperatingSessionReference) {
        this.advancedVoiceServiceOperatingSessionReference = advancedVoiceServiceOperatingSessionReference;
    }

    public org.museframework.bian.classes.Object getAdvancedVoiceServiceOperatingSessionReference() {
        return advancedVoiceServiceOperatingSessionReference;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
    }

    public void setCustomerContactRecord(String customerContactRecord) {
        this.customerContactRecord = customerContactRecord;
    }

    public String getCustomerContactRecord() {
        return customerContactRecord;
    }

    public void setCustomerContactRecordCustomerReference(org.museframework.bian.classes.Object customerContactRecordCustomerReference) {
        this.customerContactRecordCustomerReference = customerContactRecordCustomerReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordCustomerReference() {
        return customerContactRecordCustomerReference;
    }

    public void setCustomerContactRecordContactDevice(String customerContactRecordContactDevice) {
        this.customerContactRecordContactDevice = customerContactRecordContactDevice;
    }

    public String getCustomerContactRecordContactDevice() {
        return customerContactRecordContactDevice;
    }

    public void setCustomerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
        this.customerContactRecordAuthenticationStatus = customerContactRecordAuthenticationStatus;
    }

    public String getCustomerContactRecordAuthenticationStatus() {
        return customerContactRecordAuthenticationStatus;
    }

    public void setCustomerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
        this.customerContactRecordRoutingSelectionStatus = customerContactRecordRoutingSelectionStatus;
    }

    public String getCustomerContactRecordRoutingSelectionStatus() {
        return customerContactRecordRoutingSelectionStatus;
    }

    public void setCustomerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
        this.customerContactRecordMenuSelection = customerContactRecordMenuSelection;
    }

    public String getCustomerContactRecordMenuSelection() {
        return customerContactRecordMenuSelection;
    }

    public void setCustomerContactRecordServicingRequest(String customerContactRecordServicingRequest) {
        this.customerContactRecordServicingRequest = customerContactRecordServicingRequest;
    }

    public String getCustomerContactRecordServicingRequest() {
        return customerContactRecordServicingRequest;
    }

    public void setCustomerContactRecordServicingEventHistory(String customerContactRecordServicingEventHistory) {
        this.customerContactRecordServicingEventHistory = customerContactRecordServicingEventHistory;
    }

    public String getCustomerContactRecordServicingEventHistory() {
        return customerContactRecordServicingEventHistory;
    }

    public void setCustomerContactRecordServicingPositionReference(org.museframework.bian.classes.Object customerContactRecordServicingPositionReference) {
        this.customerContactRecordServicingPositionReference = customerContactRecordServicingPositionReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordServicingPositionReference() {
        return customerContactRecordServicingPositionReference;
    }

    public void setCustomerContactRecordServicingResourceReference(org.museframework.bian.classes.Object customerContactRecordServicingResourceReference) {
        this.customerContactRecordServicingResourceReference = customerContactRecordServicingResourceReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordServicingResourceReference() {
        return customerContactRecordServicingResourceReference;
    }

    public void setCustomerContactRecordActivityRecord(String customerContactRecordActivityRecord) {
        this.customerContactRecordActivityRecord = customerContactRecordActivityRecord;
    }

    public String getCustomerContactRecordActivityRecord() {
        return customerContactRecordActivityRecord;
    }

    public void setCustomerSessionDialogueReference(org.museframework.bian.classes.Object customerSessionDialogueReference) {
        this.customerSessionDialogueReference = customerSessionDialogueReference;
    }

    public org.museframework.bian.classes.Object getCustomerSessionDialogueReference() {
        return customerSessionDialogueReference;
    }

    public void setCustomerSessionDialogueRecord(String customerSessionDialogueRecord) {
        this.customerSessionDialogueRecord = customerSessionDialogueRecord;
    }

    public String getCustomerSessionDialogueRecord() {
        return customerSessionDialogueRecord;
    }

    public void setCustomerContactRecordDuration(String customerContactRecordDuration) {
        this.customerContactRecordDuration = customerContactRecordDuration;
    }

    public String getCustomerContactRecordDuration() {
        return customerContactRecordDuration;
    }

    public void setCustomerContactRecordResult(String customerContactRecordResult) {
        this.customerContactRecordResult = customerContactRecordResult;
    }

    public String getCustomerContactRecordResult() {
        return customerContactRecordResult;
    }
}