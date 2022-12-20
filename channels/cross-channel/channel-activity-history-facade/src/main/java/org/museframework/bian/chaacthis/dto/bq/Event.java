/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.chaacthis.dto.bq;

public class Event extends org.museframework.bian.classes.Event {
    /*The servicing resource for assisted customer exchanges*/
    private org.museframework.bian.classes.Object employeeReference;

    /*The type of product involved*/
    private org.museframework.bian.classes.Object productReference;

    /*Reference to the specific product accessed by the proposed transaction*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the contact record for the active contact where the transaction is sourced*/
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*The contact record consolidates all aspects of the contact that is cross-referenced by all  contact functions and called servicing sessions that make up the contact*/
    private String customerContactRecord;

    /*The customer reference as provided by the contacting party and verified by the authentication function*/
    private org.museframework.bian.classes.Object customerContactRecordCustomerReference;

    /*The contact device can be determined by the channel operations facilities (e.g. URL/ANI-phone number)*/
    private String customerContactRecordContactDevice;

    /*The contact authentication level is determined by the authentication function and can be updated during the contact*/
    private String customerContactRecordAuthenticationStatus;

    /*The routing selections made through the contact*/
    private String customerContactRecordRoutingSelectionStatus;

    /*The requested service from a menu option can be indicated by the customer when initiating or during contact*/
    private String customerContactRecordMenuSelection;

    /*The customer may provide details of servicing resource request when initiating or during contact*/
    private String customerContactRecordServicingRequest;

    /*Contact Handler can reference recent servicing activity for routing, security and servicing purposes (obtained from Service Domain Channel Activity History)*/
    private String customerContactRecordServicingEventHistory;

    /*Reference to the servicing position - can be where an inbound contact is routed, or the source of an outbound contact request*/
    private org.museframework.bian.classes.Object customerContactRecordServicingPositionReference;

    /*Reference to the servicing resource - can be to handle an inbound contact or the source of an outbound contact request*/
    private org.museframework.bian.classes.Object customerContactRecordServicingResourceReference;

    /*Records the actions performed during contact, including all dialogue sessions*/
    private String customerContactRecordActivityRecord;

    /*Reference to any contact session dialogue records created during the contact - there can be several*/
    private org.museframework.bian.classes.Object customerSessionDialogueReference;

    /*The session dialogue log of actions is returned to SD-Contact Handler and added to the contact record*/
    private String customerSessionDialogueRecord;

    /*Records the start and end date times for the contact*/
    private String customerContactRecordDuration;

    /*Description of all actions performed during the contact, including all sessions*/
    private String customerContactActivityRecord;

    /*The interim result of the contact (subject to transaction approval)*/
    private String customerContactResult;

    /*Reference to a channel activity report extracted for the customer*/
    private org.museframework.bian.classes.Object channelActivityHistoryReportReference;

    /*The period for the channel activity report*/
    private String channelActivityHistoryReportFromto;

    /*The content of the report extracting recent channel activity records to support the transaction authorization decision*/
    private String channelActivityHistoryReport;

    /*Indicates success or failure or required increased authentication level to be acquired for authorization*/
    private String transactionAuthorizationResult;

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

    public void setTransactionAuthorizationResult(String transactionAuthorizationResult) {
        this.transactionAuthorizationResult = transactionAuthorizationResult;
    }

    public String getTransactionAuthorizationResult() {
        return transactionAuthorizationResult;
    }
}