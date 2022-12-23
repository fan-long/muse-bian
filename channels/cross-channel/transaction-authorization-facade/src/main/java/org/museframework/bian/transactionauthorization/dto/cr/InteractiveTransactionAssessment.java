/*To test or assess an entity, possibly against some formal qualification or certification requirement within Transaction Authorization. */
package org.museframework.bian.transactionauthorization.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InteractiveTransactionAssessment {
    /*Reference to the customer requesting the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The servicing resource for assisted customer exchanges*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeReference;

    /*The type of product involved*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productReference;

    /*Reference to the specific product accessed by the proposed transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The general type of action proposed (e.g. balance report, payment, change of address)*/
    @MetaField
    private String proposedTransactionType;

    /*Details key values in the transaction (e.g. amount for a payment, dates for reporting, counterparties)*/
    @MetaField
    private String proposedTransactionValue;

    /*Reference to the contact record for the active contact where the transaction is sourced*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*The contact record consolidates all aspects of the contact that is cross-referenced by all  contact functions and called servicing sessions that make up the contact*/
    @MetaField
    private String customerContactRecord;

    /*The customer reference as provided by the contacting party and verified by the authentication function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordCustomerReference;

    /*The contact device can be determined by the channel operations facilities (e.g. URL/ANI-phone number)*/
    @MetaField
    private String customerContactRecordContactDevice;

    /*The contact authentication level is determined by the authentication function and can be updated during the contact*/
    @MetaField
    private String customerContactRecordAuthenticationStatus_asobtainedbySD_ContactHandler_;

    /*The routing selections made through the contact*/
    @MetaField
    private String customerContactRecordRoutingSelectionStatus;

    /*The requested service from a menu option can be indicated by the customer when initiating or during contact*/
    @MetaField
    private String customerContactRecordMenuSelection;

    /*The customer may provide details of servicing resource request when initiating or during contact*/
    @MetaField
    private String customerContactRecordServicingRequest;

    /*Contact Handler can reference recent servicing activity for routing, security and servicing purposes (obtained from Service Domain Channel Activity History)*/
    @MetaField
    private String customerContactRecordServicingEventHistory;

    /*Reference to the servicing position - can be where an inbound contact is routed, or the source of an outbound contact request*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordServicingPositionReference;

    /*Reference to the servicing resource - can be to handle an inbound contact or the source of an outbound contact request*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordServicingResourceReference;

    /*Records the actions performed during contact, including all dialogue sessions*/
    @MetaField
    private String customerContactRecordActivityRecord;

    /*Reference to any contact session dialogue records created during the contact - there can be several*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerSessionDialogueReference;

    /*The session dialogue log of actions is returned to SD-Contact Handler and added to the contact record*/
    @MetaField
    private String customerSessionDialogueRecord;

    /*The general type of customer exchange (e.g. verified customer, anonymous contact, topic - used to structure/script dialogue)*/
    @MetaField
    private String sessionDialogueType;

    /*In cases a prompt or script can provided to structure the interaction for self-service and assisted interactions*/
    @MetaField
    private String sessionDialogueScript;

    /*Reference to a dialogue log that is built up*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object sessionDialogueLogReference;

    /*The dialogue log, used for training and root cause analysis etc.  (e.g. click-stream, video/audio recording)*/
    @MetaField
    private String sessionDialogueLog;

    /*The mechanism for the session (e.g.. web, phone, chat, video, VOIP, face to face at a branch - note there can be concurrent sessions within a single customer contact)*/
    @MetaField
    private String sessionDialogueSessionMechanism;

    /*The start and end times for the session*/
    @MetaField
    private String sessionDialogueRecordSessionStartEndTime;

    /*The outcome of the dialogue (e.g. customer satisfied, on-ward routing, hang-up)*/
    @MetaField
    private String sessionDialogueResult;

    /*Records the start and end date times for the contact*/
    @MetaField
    private String customerContactRecordDuration;

    /*Description of all actions performed during the contact, including all sessions*/
    @MetaField
    private String customerContactActivityRecord;

    /*The interim result of the contact (subject to transaction approval)*/
    @MetaField
    private String customerContactResult;

    /*Reference to a channel activity report extracted for the customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object channelActivityHistoryReportReference;

    /*The period for the channel activity report*/
    @MetaField
    private String channelActivityHistoryReportFromto;

    /*The content of the report extracting recent channel activity records to support the transaction authorization decision*/
    @MetaField
    private String channelActivityHistoryReport;

    /*In case of failure, the guidance explains reason and details if additional information can be considered*/
    @MetaField
    private String transactionAuthorizationGuidance;

    /*Indicates success or failure or required increased authentication level to be acquired for authorization*/
    @MetaField
    private String transactionAuthorizationResult;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setEmployeeReference(org.museframework.bian.classes.Object employeeReference) {
        this.employeeReference = employeeReference;
    }

    public org.museframework.bian.classes.Object getEmployeeReference() {
        return employeeReference;
    }

    public void setProductReference(org.museframework.bian.classes.Object productReference) {
        this.productReference = productReference;
    }

    public org.museframework.bian.classes.Object getProductReference() {
        return productReference;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProposedTransactionType(String proposedTransactionType) {
        this.proposedTransactionType = proposedTransactionType;
    }

    public String getProposedTransactionType() {
        return proposedTransactionType;
    }

    public void setProposedTransactionValue(String proposedTransactionValue) {
        this.proposedTransactionValue = proposedTransactionValue;
    }

    public String getProposedTransactionValue() {
        return proposedTransactionValue;
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

    public void setCustomerContactRecordAuthenticationStatus_asobtainedbySD_ContactHandler_(String customerContactRecordAuthenticationStatus_asobtainedbySD_ContactHandler_) {
        this.customerContactRecordAuthenticationStatus_asobtainedbySD_ContactHandler_ = customerContactRecordAuthenticationStatus_asobtainedbySD_ContactHandler_;
    }

    public String getCustomerContactRecordAuthenticationStatus_asobtainedbySD_ContactHandler_() {
        return customerContactRecordAuthenticationStatus_asobtainedbySD_ContactHandler_;
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

    public void setSessionDialogueType(String sessionDialogueType) {
        this.sessionDialogueType = sessionDialogueType;
    }

    public String getSessionDialogueType() {
        return sessionDialogueType;
    }

    public void setSessionDialogueScript(String sessionDialogueScript) {
        this.sessionDialogueScript = sessionDialogueScript;
    }

    public String getSessionDialogueScript() {
        return sessionDialogueScript;
    }

    public void setSessionDialogueLogReference(org.museframework.bian.classes.Object sessionDialogueLogReference) {
        this.sessionDialogueLogReference = sessionDialogueLogReference;
    }

    public org.museframework.bian.classes.Object getSessionDialogueLogReference() {
        return sessionDialogueLogReference;
    }

    public void setSessionDialogueLog(String sessionDialogueLog) {
        this.sessionDialogueLog = sessionDialogueLog;
    }

    public String getSessionDialogueLog() {
        return sessionDialogueLog;
    }

    public void setSessionDialogueSessionMechanism(String sessionDialogueSessionMechanism) {
        this.sessionDialogueSessionMechanism = sessionDialogueSessionMechanism;
    }

    public String getSessionDialogueSessionMechanism() {
        return sessionDialogueSessionMechanism;
    }

    public void setSessionDialogueRecordSessionStartEndTime(String sessionDialogueRecordSessionStartEndTime) {
        this.sessionDialogueRecordSessionStartEndTime = sessionDialogueRecordSessionStartEndTime;
    }

    public String getSessionDialogueRecordSessionStartEndTime() {
        return sessionDialogueRecordSessionStartEndTime;
    }

    public void setSessionDialogueResult(String sessionDialogueResult) {
        this.sessionDialogueResult = sessionDialogueResult;
    }

    public String getSessionDialogueResult() {
        return sessionDialogueResult;
    }

    public void setCustomerContactRecordDuration(String customerContactRecordDuration) {
        this.customerContactRecordDuration = customerContactRecordDuration;
    }

    public String getCustomerContactRecordDuration() {
        return customerContactRecordDuration;
    }

    public void setCustomerContactActivityRecord(String customerContactActivityRecord) {
        this.customerContactActivityRecord = customerContactActivityRecord;
    }

    public String getCustomerContactActivityRecord() {
        return customerContactActivityRecord;
    }

    public void setCustomerContactResult(String customerContactResult) {
        this.customerContactResult = customerContactResult;
    }

    public String getCustomerContactResult() {
        return customerContactResult;
    }

    public void setChannelActivityHistoryReportReference(org.museframework.bian.classes.Object channelActivityHistoryReportReference) {
        this.channelActivityHistoryReportReference = channelActivityHistoryReportReference;
    }

    public org.museframework.bian.classes.Object getChannelActivityHistoryReportReference() {
        return channelActivityHistoryReportReference;
    }

    public void setChannelActivityHistoryReportFromto(String channelActivityHistoryReportFromto) {
        this.channelActivityHistoryReportFromto = channelActivityHistoryReportFromto;
    }

    public String getChannelActivityHistoryReportFromto() {
        return channelActivityHistoryReportFromto;
    }

    public void setChannelActivityHistoryReport(String channelActivityHistoryReport) {
        this.channelActivityHistoryReport = channelActivityHistoryReport;
    }

    public String getChannelActivityHistoryReport() {
        return channelActivityHistoryReport;
    }

    public void setTransactionAuthorizationGuidance(String transactionAuthorizationGuidance) {
        this.transactionAuthorizationGuidance = transactionAuthorizationGuidance;
    }

    public String getTransactionAuthorizationGuidance() {
        return transactionAuthorizationGuidance;
    }

    public void setTransactionAuthorizationResult(String transactionAuthorizationResult) {
        this.transactionAuthorizationResult = transactionAuthorizationResult;
    }

    public String getTransactionAuthorizationResult() {
        return transactionAuthorizationResult;
    }
}