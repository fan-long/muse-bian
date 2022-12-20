package org.museframework.bian.financialaccounting.dto;

public class RetrieveLedgerPostingResponse {
    private org.museframework.bian.financialaccounting.dto.bq.LedgerPosting ledgerPosting;

    public void setLedgerPosting(org.museframework.bian.financialaccounting.dto.bq.LedgerPosting ledgerPosting) {
        this.ledgerPosting = ledgerPosting;
    }

    public org.museframework.bian.financialaccounting.dto.bq.LedgerPosting getLedgerPosting() {
        return ledgerPosting;
    }
}