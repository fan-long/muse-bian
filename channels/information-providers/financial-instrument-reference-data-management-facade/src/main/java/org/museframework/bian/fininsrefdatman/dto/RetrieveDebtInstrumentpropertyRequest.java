package org.museframework.bian.fininsrefdatman.dto;

public class RetrieveDebtInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String debtinstrumentpropertyid;

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
}