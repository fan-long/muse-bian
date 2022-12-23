package org.museframework.bian.financialaccounting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLedgerPostingRequest {
    @MetaField
    private String financialaccountingid;

    @MetaField
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