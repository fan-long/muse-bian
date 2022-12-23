package org.museframework.bian.invporpla.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInvestmentTermsRequest {
    @MetaField
    private String investmentportfolioplanningid;

    @MetaField
    private String investmenttermsid;

    @MetaField(ref=true)
    private org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms;

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

    public void setInvestmentTerms(org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms) {
        this.investmentTerms = investmentTerms;
    }

    public org.museframework.bian.invporpla.dto.bq.InvestmentTerms getInvestmentTerms() {
        return investmentTerms;
    }
}