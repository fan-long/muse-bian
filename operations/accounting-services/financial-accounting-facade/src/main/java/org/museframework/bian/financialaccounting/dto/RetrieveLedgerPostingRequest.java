package org.museframework.bian.financialaccounting.dto;

public class RetrieveLedgerPostingRequest {
    private String financialaccountingid;

    private String ledgerpostingid;

    public void setFinancialaccountingid(String financialaccountingid) {
        this.financialaccountingid = financialaccountingid;
    }

    public String getFinancialaccountingid() {
        return financialaccountingid;
    }

    public void setLedgerpostingid(String ledgerpostingid) {
        this.ledgerpostingid = ledgerpostingid;
    }

    public String getLedgerpostingid() {
        return ledgerpostingid;
    }
}