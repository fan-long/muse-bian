package org.museframework.bian.fininsrefdatman.dto;

public class RequestDebtInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String debtinstrumentpropertyid;

    private org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty debtInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setDebtinstrumentpropertyid(String debtinstrumentpropertyid) {
        this.debtinstrumentpropertyid = debtinstrumentpropertyid;
    }

    public String getDebtinstrumentpropertyid() {
        return debtinstrumentpropertyid;
    }

    public void setDebtInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty debtInstrumentproperty) {
        this.debtInstrumentproperty = debtInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.DebtInstrumentproperty getDebtInstrumentproperty() {
        return debtInstrumentproperty;
    }
}