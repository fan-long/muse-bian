package org.museframework.bian.financialaccounting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLedgerPostingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.financialaccounting.dto.bq.LedgerPosting ledgerPosting;

    public void setLedgerPosting(org.museframework.bian.financialaccounting.dto.bq.LedgerPosting ledgerPosting) {
        this.ledgerPosting = ledgerPosting;
    }

    public org.museframework.bian.financialaccounting.dto.bq.LedgerPosting getLedgerPosting() {
        return ledgerPosting;
    }
}