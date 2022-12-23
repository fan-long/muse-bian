package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialDocumentHandlingRequest {
    @MetaField
    private String atmnetworkoperationsid;

    @MetaField
    private String financialdocumenthandlingid;

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
}