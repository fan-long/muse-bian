package org.museframework.bian.financialaccounting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureLedgerPostingRequest {
    @MetaField
    private String financialaccountingid;

    @MetaField
    private String ledgerpostingid;

    @MetaField(ref=true)
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