package org.museframework.bian.salproagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateSalesProductAgreementRequest {
    @MetaField(ref=true)
    private org.museframework.bian.salproagr.dto.cr.SalesProductAgreement salesProductAgreement;

    public void setSalesProductAgreement(org.museframework.bian.salproagr.dto.cr.SalesProductAgreement salesProductAgreement) {
        this.salesProductAgreement = salesProductAgreement;
    }

    public org.museframework.bian.salproagr.dto.cr.SalesProductAgreement getSalesProductAgreement() {
        return salesProductAgreement;
    }
}