package org.museframework.bian.merchandisingloan.dto;

public class InitiateFinancialInstrumentRequest {
    private String merchandisingloanid;

    private String financialinstrumentid;

    private org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument financialInstrument;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setFinancialinstrumentid(String financialinstrumentid) {
        this.financialinstrumentid = financialinstrumentid;
    }

    public String getFinancialinstrumentid() {
        return financialinstrumentid;
    }

    public void setFinancialInstrument(org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}