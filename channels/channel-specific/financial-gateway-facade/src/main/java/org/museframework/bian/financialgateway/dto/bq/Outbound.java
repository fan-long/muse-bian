/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.financialgateway.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Outbound {
    /*Reference to the type of message (defines format)*/
    @MetaField
    private String financialGatewayOutboundMessageType;

    /*The message content in any suitable format*/
    @MetaField
    private String financialGatewayOutboundMessageRecord;

    /*Employee/Business unit sending the message*/
    @MetaField
    private String financialGatewayOutboundMessageSender;

    /*The addressee of the message (identified by the financial gateway recognized party reference)*/
    @MetaField
    private String financialGatewayOutboundMessageReceiver;

    /*Used to track delivery  (e.g. pending, delivered, possible duplicate, error)*/
    @MetaField
    private String financialGatewayOutboundMessageStatus;

    public void setFinancialGatewayOutboundMessageType(String financialGatewayOutboundMessageType) {
        this.financialGatewayOutboundMessageType = financialGatewayOutboundMessageType;
    }

    public String getFinancialGatewayOutboundMessageType() {
        return financialGatewayOutboundMessageType;
    }

    public void setFinancialGatewayOutboundMessageRecord(String financialGatewayOutboundMessageRecord) {
        this.financialGatewayOutboundMessageRecord = financialGatewayOutboundMessageRecord;
    }

    public String getFinancialGatewayOutboundMessageRecord() {
        return financialGatewayOutboundMessageRecord;
    }

    public void setFinancialGatewayOutboundMessageSender(String financialGatewayOutboundMessageSender) {
        this.financialGatewayOutboundMessageSender = financialGatewayOutboundMessageSender;
    }

    public String getFinancialGatewayOutboundMessageSender() {
        return financialGatewayOutboundMessageSender;
    }

    public void setFinancialGatewayOutboundMessageReceiver(String financialGatewayOutboundMessageReceiver) {
        this.financialGatewayOutboundMessageReceiver = financialGatewayOutboundMessageReceiver;
    }

    public String getFinancialGatewayOutboundMessageReceiver() {
        return financialGatewayOutboundMessageReceiver;
    }

    public void setFinancialGatewayOutboundMessageStatus(String financialGatewayOutboundMessageStatus) {
        this.financialGatewayOutboundMessageStatus = financialGatewayOutboundMessageStatus;
    }

    public String getFinancialGatewayOutboundMessageStatus() {
        return financialGatewayOutboundMessageStatus;
    }
}