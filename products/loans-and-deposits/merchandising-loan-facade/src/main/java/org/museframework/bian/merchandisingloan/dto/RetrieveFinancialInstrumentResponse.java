package org.museframework.bian.merchandisingloan.dto;

public class RetrieveFinancialInstrumentResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument financialInstrument;

    public void setFinancialInstrument(org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}