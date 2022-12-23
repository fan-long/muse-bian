package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBankRatesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.bq.BankRates bankRates;

    public void setBankRates(org.museframework.bian.corporatetreasury.dto.bq.BankRates bankRates) {
        this.bankRates = bankRates;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.BankRates getBankRates() {
        return bankRates;
    }
}