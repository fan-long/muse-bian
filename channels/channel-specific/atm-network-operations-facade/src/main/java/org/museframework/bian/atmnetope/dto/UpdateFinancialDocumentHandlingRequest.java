package org.museframework.bian.atmnetope.dto;

public class UpdateFinancialDocumentHandlingRequest {
    private String atmnetworkoperationsid;

    private String financialdocumenthandlingid;

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