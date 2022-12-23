/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.advvoiserope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Inbound {
    /*Details of the device being used for access*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object VChannelDeviceReference;

    /*Property of the device that can be used in identification ( e.g. ANI phone number)*/
    @MetaField
    private String VChannelDevicePropertyValue;

    /*Detail used for statistics*/
    @MetaField
    private String VChannelInboundConnectionStartTime;

    /*Detain used for statistics*/
    @MetaField
    private String VChannelInboundConnectionDuration;

    /*Internal reference retuned by Service Domain-Contact Handler for routing*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object VChannelInboundConnectionContactReference;

    public void setVChannelDeviceReference(org.museframework.bian.classes.Object VChannelDeviceReference) {
        this.VChannelDeviceReference = VChannelDeviceReference;
    }

    public org.museframework.bian.classes.Object getVChannelDeviceReference() {
        return VChannelDeviceReference;
    }

    public void setVChannelDevicePropertyValue(String VChannelDevicePropertyValue) {
        this.VChannelDevicePropertyValue = VChannelDevicePropertyValue;
    }

    public String getVChannelDevicePropertyValue() {
        return VChannelDevicePropertyValue;
    }

    public void setVChannelInboundConnectionStartTime(String VChannelInboundConnectionStartTime) {
        this.VChannelInboundConnectionStartTime = VChannelInboundConnectionStartTime;
    }

    public String getVChannelInboundConnectionStartTime() {
        return VChannelInboundConnectionStartTime;
    }

    public void setVChannelInboundConnectionDuration(String VChannelInboundConnectionDuration) {
        this.VChannelInboundConnectionDuration = VChannelInboundConnectionDuration;
    }

    public String getVChannelInboundConnectionDuration() {
        return VChannelInboundConnectionDuration;
    }

    public void setVChannelInboundConnectionContactReference(org.museframework.bian.classes.Object VChannelInboundConnectionContactReference) {
        this.VChannelInboundConnectionContactReference = VChannelInboundConnectionContactReference;
    }

    public org.museframework.bian.classes.Object getVChannelInboundConnectionContactReference() {
        return VChannelInboundConnectionContactReference;
    }
}