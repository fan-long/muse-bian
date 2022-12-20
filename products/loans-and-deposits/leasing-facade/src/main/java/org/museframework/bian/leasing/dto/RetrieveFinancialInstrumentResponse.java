package org.museframework.bian.leasing.dto;

public class RetrieveFinancialInstrumentResponse {
    private org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument;

    public void setFinancialInstrument(org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.leasing.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}