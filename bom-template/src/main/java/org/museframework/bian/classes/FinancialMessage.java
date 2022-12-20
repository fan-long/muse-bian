/*Message containing financial information 


such as financial instructions or reports about financial transactions*/
package org.museframework.bian.classes;

public class FinancialMessage {
    /*Type of FinancialMessage, defining the type of content of the message

and related format

*/
    private String financialMessageType;

    /*Indication of the direction of the message

in or outbound*/
    private String financialMessageDirection;

    /*Content of the financial message*/
    private String financialMessageContent;

    /*Status of the delivery of the financial message

e.g. pending, delivered, possible error*/
    private String financialMessageDeliveryStatus;

    public void setFinancialMessageType(String financialMessageType) {
        this.financialMessageType = financialMessageType;
    }

    public String getFinancialMessageType() {
        return financialMessageType;
    }

    public void setFinancialMessageDirection(String financialMessageDirection) {
        this.financialMessageDirection = financialMessageDirection;
    }

    public String getFinancialMessageDirection() {
        return financialMessageDirection;
    }

    public void setFinancialMessageContent(String financialMessageContent) {
        this.financialMessageContent = financialMessageContent;
    }

    public String getFinancialMessageContent() {
        return financialMessageContent;
    }

    public void setFinancialMessageDeliveryStatus(String financialMessageDeliveryStatus) {
        this.financialMessageDeliveryStatus = financialMessageDeliveryStatus;
    }

    public String getFinancialMessageDeliveryStatus() {
        return financialMessageDeliveryStatus;
    }
}