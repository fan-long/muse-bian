package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeFinancialDocumentHandlingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling financialDocumentHandling;

    public void setFinancialDocumentHandling(org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling financialDocumentHandling) {
        this.financialDocumentHandling = financialDocumentHandling;
    }

    public org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling getFinancialDocumentHandling() {
        return financialDocumentHandling;
    }
}