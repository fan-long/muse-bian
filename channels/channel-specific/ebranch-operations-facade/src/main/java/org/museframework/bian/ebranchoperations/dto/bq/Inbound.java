/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.ebranchoperations.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Inbound {
    /*Reference to the device being used for access (captured for security and identification)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object EBranchDeviceReference;

    /*Property of the Device e.g. URL if available*/
    @MetaField(0)
    private String EBranchDevicePropertyValue;

    /*Log of the initial connection*/
    @MetaField(0)
    private String EBranchInboundConnectionStartTime;

    /*Connection duration for capacity planning purposes*/
    @MetaField(0)
    private String EBranchInboundConnectionDuration;

    /*This is returned by SD-Contact Handler for reference if the connection leads to a log-in session*/
    @MetaField(ref=true)
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