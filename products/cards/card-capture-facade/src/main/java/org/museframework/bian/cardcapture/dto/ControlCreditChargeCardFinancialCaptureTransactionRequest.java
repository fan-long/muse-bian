package org.museframework.bian.cardcapture.dto;

public class ControlCreditChargeCardFinancialCaptureTransactionRequest {
    private String cardcaptureid;

    private org.museframework.bian.cardcapture.dto.cr.CreditChargeCardFinancialCaptureTransaction creditChargeCardFinancialCaptureTransaction;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setCreditChargeCardFinancialCaptureTransaction(org.museframework.bian.cardcapture.dto.cr.CreditChargeCardFinancialCaptureTransaction creditChargeCardFinancialCaptureTransaction) {
        this.creditChargeCardFinancialCaptureTransaction = creditChargeCardFinancialCaptureTransaction;
    }

    public org.museframework.bian.cardcapture.dto.cr.CreditChargeCardFinancialCaptureTransaction getCreditChargeCardFinancialCaptureTransaction() {
        return creditChargeCardFinancialCaptureTransaction;
    }
}