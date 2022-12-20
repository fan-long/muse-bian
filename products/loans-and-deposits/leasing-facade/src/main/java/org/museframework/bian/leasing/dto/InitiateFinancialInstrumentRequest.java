package org.museframework.bian.leasing.dto;

public class InitiateFinancialInstrumentRequest {
    private String leasingid;

    private String financialinstrumentid;

    private org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setFinancialinstrumentid(String financialinstrumentid) {
        this.financialinstrumentid = financialinstrumentid;
    }

    public String getFinancialinstrumentid() {
        return financialinstrumentid;
    }

    public void setFinancialInstrument(org.museframework.bian.leasing.dto.bq.FinancialInstrument financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.leasing.dto.bq.FinancialInstrument getFinancialInstrument() {
        return financialInstrument;
    }
}