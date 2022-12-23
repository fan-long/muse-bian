/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.advvoiserope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Outbound {
    /*The source of the outbound connection request*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the customer contact record used accessing outbound channel*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*The record used to handle the contact (see Service Domain-Contact Handler for complete definition)*/
    @MetaField
    private String customerSessionDialogueRecord;

    /*The target device being accessed*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object VChannelCustomerDeviceReference;

    /*Detail used for statistics*/
    @MetaField
    private String VChannelOutboundConnectionStartTime;

    /*Detail used for statistics*/
    @MetaField
    private String VChannelOutboundConnectionDuration;

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

    public void setVChannelCustomerDeviceReference(org.museframework.bian.classes.Object VChannelCustomerDeviceReference) {
        this.VChannelCustomerDeviceReference = VChannelCustomerDeviceReference;
    }

    public org.museframework.bian.classes.Object getVChannelCustomerDeviceReference() {
        return VChannelCustomerDeviceReference;
    }

    public void setVChannelOutboundConnectionStartTime(String VChannelOutboundConnectionStartTime) {
        this.VChannelOutboundConnectionStartTime = VChannelOutboundConnectionStartTime;
    }

    public String getVChannelOutboundConnectionStartTime() {
        return VChannelOutboundConnectionStartTime;
    }

    public void setVChannelOutboundConnectionDuration(String VChannelOutboundConnectionDuration) {
        this.VChannelOutboundConnectionDuration = VChannelOutboundConnectionDuration;
    }

    public String getVChannelOutboundConnectionDuration() {
        return VChannelOutboundConnectionDuration;
    }
}