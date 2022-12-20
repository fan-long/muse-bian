package org.museframework.bian.letofcre.dto;

public class InitiateLetterOfCreditTransactionResponse {
    private org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction;

    public void setLetterOfCreditTransaction(org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction) {
        this.letterOfCreditTransaction = letterOfCreditTransaction;
    }

    public org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction getLetterOfCreditTransaction() {
        return letterOfCreditTransaction;
    }
}