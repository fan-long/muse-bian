package org.museframework.bian.fininsrefdatman.dto;

public class RetrieveOptionInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String optioninstrumentpropertyid;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setOptioninstrumentpropertyid(String optioninstrumentpropertyid) {
        this.optioninstrumentpropertyid = optioninstrumentpropertyid;
    }

    public String getOptioninstrumentpropertyid() {
        return optioninstrumentpropertyid;
    }
}