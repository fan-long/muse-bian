package org.museframework.bian.fininsrefdatman.dto;

public class ExecuteEquityInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String equityinstrumentpropertyid;

    private org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty equityInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setEquityinstrumentpropertyid(String equityinstrumentpropertyid) {
        this.equityinstrumentpropertyid = equityinstrumentpropertyid;
    }

    public String getEquityinstrumentpropertyid() {
        return equityinstrumentpropertyid;
    }

    public void setEquityInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty equityInstrumentproperty) {
        this.equityInstrumentproperty = equityInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.EquityInstrumentproperty getEquityInstrumentproperty() {
        return equityInstrumentproperty;
    }
}