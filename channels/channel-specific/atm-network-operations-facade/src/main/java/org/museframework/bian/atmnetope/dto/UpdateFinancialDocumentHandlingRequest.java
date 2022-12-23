package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFinancialDocumentHandlingRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String financialdocumenthandlingid;

    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling financialDocumentHandling;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setFinancialdocumenthandlingid(String financialdocumenthandlingid) {
        this.financialdocumenthandlingid = financialdocumenthandlingid;
    }

    public String getFinancialdocumenthandlingid() {
        return financialdocumenthandlingid;
    }

    public void setFinancialDocumentHandling(org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling financialDocumentHandling) {
        this.financialDocumentHandling = financialDocumentHandling;
    }

    public org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling getFinancialDocumentHandling() {
        return financialDocumentHandling;
    }
}