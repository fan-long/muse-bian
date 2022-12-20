package org.museframework.bian.fininsrefdatman.dto;

public class RetrieveEquityInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String equityinstrumentpropertyid;

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
}