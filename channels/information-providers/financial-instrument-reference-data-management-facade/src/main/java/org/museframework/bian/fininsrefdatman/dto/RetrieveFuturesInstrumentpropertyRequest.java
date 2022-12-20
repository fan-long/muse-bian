package org.museframework.bian.fininsrefdatman.dto;

public class RetrieveFuturesInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String futuresinstrumentpropertyid;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setFuturesinstrumentpropertyid(String futuresinstrumentpropertyid) {
        this.futuresinstrumentpropertyid = futuresinstrumentpropertyid;
    }

    public String getFuturesinstrumentpropertyid() {
        return futuresinstrumentpropertyid;
    }
}