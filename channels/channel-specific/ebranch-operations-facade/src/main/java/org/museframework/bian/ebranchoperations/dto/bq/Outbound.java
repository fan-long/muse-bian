/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.ebranchoperations.dto.bq;

public class Outbound {
    /*Reference to the source of outbound connection*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The outbound connection will be part of a customer contact to ensure all logging is performed*/
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*This is the payload of the exchange - it is the specific session within the contact that handles the customer interaction. Content passes through the E-Branch facility transparently*/
    private String customerSessionDialogueRecord;

    /*Reference to the device being connected to*/
    private org.museframework.bian.classes.Object EBranchCustomerDeviceReference;

    /*Log of the initial connection*/
    private String EBranchOutboundConnectionStartTime;

    /*Connection duration for capacity planning purposes*/
    private String EBranchOutboundConnectionDuration;

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
    }

    public void setCustomerSessionDialogueRecord(String customerSessionDialogueRecord) {
        this.customerSessionDialogueRecord = customerSessionDialogueRecord;
    }

    public String getCustomerSessionDialogueRecord() {
        return customerSessionDialogueRecord;
    }

    public void setEBranchCustomerDeviceReference(org.museframework.bian.classes.Object EBranchCustomerDeviceReference) {
        this.EBranchCustomerDeviceReference = EBranchCustomerDeviceReference;
    }

    public org.museframework.bian.classes.Object getEBranchCustomerDeviceReference() {
        return EBranchCustomerDeviceReference;
    }

    public void setEBranchOutboundConnectionStartTime(String EBranchOutboundConnectionStartTime) {
        this.EBranchOutboundConnectionStartTime = EBranchOutboundConnectionStartTime;
    }

    public String getEBranchOutboundConnectionStartTime() {
        return EBranchOutboundConnectionStartTime;
    }

    public void setEBranchOutboundConnectionDuration(String EBranchOutboundConnectionDuration) {
        this.EBranchOutboundConnectionDuration = EBranchOutboundConnectionDuration;
    }

    public String getEBranchOutboundConnectionDuration() {
        return EBranchOutboundConnectionDuration;
    }
}