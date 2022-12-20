package org.museframework.bian.bankdrafts.dto;

public class ExchangeBearerDocumentTransactionResponse {
    private org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction bearerDocumentTransaction;

    public void setBearerDocumentTransaction(org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction bearerDocumentTransaction) {
        this.bearerDocumentTransaction = bearerDocumentTransaction;
    }

    public org.museframework.bian.bankdrafts.dto.cr.BearerDocumentTransaction getBearerDocumentTransaction() {
        return bearerDocumentTransaction;
    }
}