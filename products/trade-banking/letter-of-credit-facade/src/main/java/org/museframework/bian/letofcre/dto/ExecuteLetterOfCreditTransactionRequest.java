package org.museframework.bian.letofcre.dto;

public class ExecuteLetterOfCreditTransactionRequest {
    private String letterofcreditid;

    private org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setLetterOfCreditTransaction(org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction letterOfCreditTransaction) {
        this.letterOfCreditTransaction = letterOfCreditTransaction;
    }

    public org.museframework.bian.letofcre.dto.cr.LetterOfCreditTransaction getLetterOfCreditTransaction() {
        return letterOfCreditTransaction;
    }
}