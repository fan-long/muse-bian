package org.museframework.bian.invporpla.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInvestmentTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms;

    public void setInvestmentTerms(org.museframework.bian.invporpla.dto.bq.InvestmentTerms investmentTerms) {
        this.investmentTerms = investmentTerms;
    }

    public org.museframework.bian.invporpla.dto.bq.InvestmentTerms getInvestmentTerms() {
        return investmentTerms;
    }
}