package org.museframework.bian.invporpla.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInvestmentTermsRequest {
    @MetaField
    private String investmentportfolioplanningid;

    @MetaField
    private String investmenttermsid;

    public void setInvestmentportfolioplanningid(String investmentportfolioplanningid) {
        this.investmentportfolioplanningid = investmentportfolioplanningid;
    }

    public String getInvestmentportfolioplanningid() {
        return investmentportfolioplanningid;
    }

    public void setInvestmenttermsid(String investmenttermsid) {
        this.investmenttermsid = investmenttermsid;
    }

    public String getInvestmenttermsid() {
        return investmenttermsid;
    }
}