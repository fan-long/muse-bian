package org.museframework.bian.bankdrafts.dto;

public class UpdateBearerDocumentTransactionRequest {
    private String bankdraftsid;

    private org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction bearerDocumentTransaction;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setBearerDocumentTransaction(org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction bearerDocumentTransaction) {
        this.bearerDocumentTransaction = bearerDocumentTransaction;
    }

    public org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction getBearerDocumentTransaction() {
        return bearerDocumentTransaction;
    }
}