/*A request to settle the transaction.
A request to fulfil the completion of a transaction or to discharge participants obligations through the transfer of funds and/or securities. (adapted from ECB)*/
package org.museframework.bian.classes;

public class SettlementInstruction {
    /*Identifier of the settlement instruction. */
    private String settlementInstructionIdentifier;

    /*Amount of money moved between the instructing agent and the instructed agent. (ISO20022)*/
    private String interbankSettlementAmount;

    /*Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due. (ISO20022)*/
    private String interbankSettlementDate;

    /*Method used to settle the (batch of) payment instructions. (ISO20022)*/
    private String settlementMethod;

    /*Information on the requested settlement time of the instruction. (ISO20022)*/
    private String settlementTimeRequest;

    /*Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction. (ISO20022)*/
    private String settlementPriority;

    public void setSettlementInstructionIdentifier(String settlementInstructionIdentifier) {
        this.settlementInstructionIdentifier = settlementInstructionIdentifier;
    }

    public String getSettlementInstructionIdentifier() {
        return settlementInstructionIdentifier;
    }

    public void setInterbankSettlementAmount(String interbankSettlementAmount) {
        this.interbankSettlementAmount = interbankSettlementAmount;
    }

    public String getInterbankSettlementAmount() {
        return interbankSettlementAmount;
    }

    public void setInterbankSettlementDate(String interbankSettlementDate) {
        this.interbankSettlementDate = interbankSettlementDate;
    }

    public String getInterbankSettlementDate() {
        return interbankSettlementDate;
    }

    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public String getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementTimeRequest(String settlementTimeRequest) {
        this.settlementTimeRequest = settlementTimeRequest;
    }

    public String getSettlementTimeRequest() {
        return settlementTimeRequest;
    }

    public void setSettlementPriority(String settlementPriority) {
        this.settlementPriority = settlementPriority;
    }

    public String getSettlementPriority() {
        return settlementPriority;
    }
}