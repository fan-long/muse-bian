package org.museframework.bian.mortgageloan.dto;

public class RetrieveFinancialInstrumentRequest {
    private String mortgageloanid;

    private String financialinstrumentid;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setFinancialinstrumentid(String financialinstrumentid) {
        this.financialinstrumentid = financialinstrumentid;
    }

    public String getFinancialinstrumentid() {
        return financialinstrumentid;
    }
}