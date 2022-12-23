package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCorporateFinanceServicesAdviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.cr.CorporateFinanceServicesAdvice corporateFinanceServicesAdvice;

    public void setCorporateFinanceServicesAdvice(org.museframework.bian.corporatefinance.dto.cr.CorporateFinanceServicesAdvice corporateFinanceServicesAdvice) {
        this.corporateFinanceServicesAdvice = corporateFinanceServicesAdvice;
    }

    public org.museframework.bian.corporatefinance.dto.cr.CorporateFinanceServicesAdvice getCorporateFinanceServicesAdvice() {
        return corporateFinanceServicesAdvice;
    }
}