package org.museframework.bian.financialaccounting.dto;

public class CaptureLedgerPostingRequest {
    private String financialaccountingid;

    private String ledgerpostingid;

    private org.museframework.bian.financialaccounting.dto.bq.LedgerPosting ledgerPosting;

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

    public void setLedgerPosting(org.museframework.bian.financialaccounting.dto.bq.LedgerPosting ledgerPosting) {
        this.ledgerPosting = ledgerPosting;
    }

    public org.museframework.bian.financialaccounting.dto.bq.LedgerPosting getLedgerPosting() {
        return ledgerPosting;
    }
}