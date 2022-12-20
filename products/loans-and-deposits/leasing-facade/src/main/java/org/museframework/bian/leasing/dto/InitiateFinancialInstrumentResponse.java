package org.museframework.bian.leasing.dto;

public class InitiateFinancialInstrumentResponse {
    private org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument;

    public void setFinancialInstrument(org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.leasing.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}