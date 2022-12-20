package org.museframework.bian.atmnetope.dto;

public class RetrieveFinancialDocumentHandlingRequest {
    private String atmnetworkoperationsid;

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