package org.museframework.bian.mortgageloan.dto;

public class UpdateFinancialInstrumentRequest {
    private String mortgageloanid;

    private String financialinstrumentid;

    private org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument;

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

    public void setFinancialInstrument(org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}