package org.museframework.bian.bankdrafts.dto;

public class NotifyBearerDocumentTransactionRequest {
    private String bankdraftsid;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }
}