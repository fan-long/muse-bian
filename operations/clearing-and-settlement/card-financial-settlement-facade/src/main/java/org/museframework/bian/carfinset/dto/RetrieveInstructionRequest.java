package org.museframework.bian.carfinset.dto;

public class RetrieveInstructionRequest {
    private String cardfinancialsettlementid;

    private String instructionid;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setInstructionid(String instructionid) {
        this.instructionid = instructionid;
    }

    public String getInstructionid() {
        return instructionid;
    }
}