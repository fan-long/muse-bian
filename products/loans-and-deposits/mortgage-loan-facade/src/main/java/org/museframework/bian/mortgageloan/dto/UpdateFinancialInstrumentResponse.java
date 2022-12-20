package org.museframework.bian.mortgageloan.dto;

public class UpdateFinancialInstrumentResponse {
    private org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument;

    public void setFinancialInstrument(org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.mortgageloan.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}