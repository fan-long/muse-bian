package org.museframework.bian.carfinset.dto;

public class UpdateCardFinancialSettlementProcedureRequest {
    private String cardfinancialsettlementid;

    private org.museframework.bian.carfinset.dto.cr.CardFinancialSettlementProcedure cardFinancialSettlementProcedure;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setCardFinancialSettlementProcedure(org.museframework.bian.carfinset.dto.cr.CardFinancialSettlementProcedure cardFinancialSettlementProcedure) {
        this.cardFinancialSettlementProcedure = cardFinancialSettlementProcedure;
    }

    public org.museframework.bian.carfinset.dto.cr.CardFinancialSettlementProcedure getCardFinancialSettlementProcedure() {
        return cardFinancialSettlementProcedure;
    }
}