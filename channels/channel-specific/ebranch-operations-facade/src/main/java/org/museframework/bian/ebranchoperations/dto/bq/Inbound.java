/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.ebranchoperations.dto.bq;

public class Inbound {
    /*Reference to the device being used for access (captured for security and identification)*/
    private org.museframework.bian.classes.Object EBranchDeviceReference;

    /*Property of the Device e.g. URL if available*/
    private String EBranchDevicePropertyValue;

    /*Log of the initial connection*/
    private String EBranchInboundConnectionStartTime;

    /*Connection duration for capacity planning purposes*/
    private String EBranchInboundConnectionDuration;

    /*This is returned by SD-Contact Handler for reference if the connection leads to a log-in session*/
    private org.museframework.bian.classes.Object EBranchInboundConnectionContactRecordReference;

    public void setEBranchDeviceReference(org.museframework.bian.classes.Object EBranchDeviceReference) {
        this.EBranchDeviceReference = EBranchDeviceReference;
    }

    public org.museframework.bian.classes.Object getEBranchDeviceReference() {
        return EBranchDeviceReference;
    }

    public void setEBranchDevicePropertyValue(String EBranchDevicePropertyValue) {
        this.EBranchDevicePropertyValue = EBranchDevicePropertyValue;
    }

    public String getEBranchDevicePropertyValue() {
        return EBranchDevicePropertyValue;
    }

    public void setEBranchInboundConnectionStartTime(String EBranchInboundConnectionStartTime) {
        this.EBranchInboundConnectionStartTime = EBranchInboundConnectionStartTime;
    }

    public String getEBranchInboundConnectionStartTime() {
        return EBranchInboundConnectionStartTime;
    }

    public void setEBranchInboundConnectionDuration(String EBranchInboundConnectionDuration) {
        this.EBranchInboundConnectionDuration = EBranchInboundConnectionDuration;
    }

    public String getEBranchInboundConnectionDuration() {
        return EBranchInboundConnectionDuration;
    }

    public void setEBranchInboundConnectionContactRecordReference(org.museframework.bian.classes.Object EBranchInboundConnectionContactRecordReference) {
        this.EBranchInboundConnectionContactRecordReference = EBranchInboundConnectionContactRecordReference;
    }

    public org.museframework.bian.classes.Object getEBranchInboundConnectionContactRecordReference() {
        return EBranchInboundConnectionContactRecordReference;
    }
}