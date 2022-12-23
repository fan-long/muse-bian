package org.museframework.bian.investmentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInvestmentAccountFacilityRequest {
    @MetaField
    private String investmentaccountid;

    @MetaField(ref=true)
    private org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility investmentAccountFacility;

    public void setInvestmentaccountid(String investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public String getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setInvestmentAccountFacility(org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility investmentAccountFacility) {
        this.investmentAccountFacility = investmentAccountFacility;
    }

    public org.museframework.bian.investmentaccount.dto.cr.InvestmentAccountFacility getInvestmentAccountFacility() {
        return investmentAccountFacility;
    }
}