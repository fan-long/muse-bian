/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.financialgateway.dto.bq;

public class Inbound {
    /*Reference to the type of message (defines format)*/
    private String financialGatewayInboundMessageType;

    /*The message content in any suitable format*/
    private String financialGatewayInboundMessageRecord;

    /*Employee/Business unit addressed by the message*/
    private String financialGatewayInboundMessageReceiver;

    /*Used to track delivery  (e.g. pending, delivered, possible duplicate, error)*/
    private String financialGatewayInboundMessageStatus;

    public void setFinancialGatewayInboundMessageType(String financialGatewayInboundMessageType) {
        this.financialGatewayInboundMessageType = financialGatewayInboundMessageType;
    }

    public String getFinancialGatewayInboundMessageType() {
        return financialGatewayInboundMessageType;
    }

    public void setFinancialGatewayInboundMessageRecord(String financialGatewayInboundMessageRecord) {
        this.financialGatewayInboundMessageRecord = financialGatewayInboundMessageRecord;
    }

    public String getFinancialGatewayInboundMessageRecord() {
        return financialGatewayInboundMessageRecord;
    }

    public void setFinancialGatewayInboundMessageReceiver(String financialGatewayInboundMessageReceiver) {
        this.financialGatewayInboundMessageReceiver = financialGatewayInboundMessageReceiver;
    }

    public String getFinancialGatewayInboundMessageReceiver() {
        return financialGatewayInboundMessageReceiver;
    }

    public void setFinancialGatewayInboundMessageStatus(String financialGatewayInboundMessageStatus) {
        this.financialGatewayInboundMessageStatus = financialGatewayInboundMessageStatus;
    }

    public String getFinancialGatewayInboundMessageStatus() {
        return financialGatewayInboundMessageStatus;
    }
}