package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBankRatesRequest {
    @MetaField
    private String corporatetreasuryid;

    @MetaField
    private String bankratesid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setBankratesid(String bankratesid) {
        this.bankratesid = bankratesid;
    }

    public String getBankratesid() {
        return bankratesid;
    }
}