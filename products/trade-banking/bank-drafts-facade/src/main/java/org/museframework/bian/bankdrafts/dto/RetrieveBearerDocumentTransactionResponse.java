package org.museframework.bian.bankdrafts.dto;

public class RetrieveBearerDocumentTransactionResponse {
    private org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction bearerDocumentTransaction;

    public void setBearerDocumentTransaction(org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction bearerDocumentTransaction) {
        this.bearerDocumentTransaction = bearerDocumentTransaction;
    }

    public org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction getBearerDocumentTransaction() {
        return bearerDocumentTransaction;
    }
}