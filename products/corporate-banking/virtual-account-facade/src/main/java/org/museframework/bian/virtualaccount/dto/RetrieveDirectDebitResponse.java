package org.museframework.bian.virtualaccount.dto;

public class RetrieveDirectDebitResponse {
    private org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit;

    public void setDirectDebit(org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit) {
        this.directDebit = directDebit;
    }

    public org.museframework.bian.virtualaccount.dto.bq.DirectDebit getDirectDebit() {
        return directDebit;
    }
}