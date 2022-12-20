package org.museframework.bian.fininsrefdatman.dto;

public class ExecuteFuturesInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String futuresinstrumentpropertyid;

    private org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty futuresInstrumentproperty;

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

    public void setFuturesInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty futuresInstrumentproperty) {
        this.futuresInstrumentproperty = futuresInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.FuturesInstrumentproperty getFuturesInstrumentproperty() {
        return futuresInstrumentproperty;
    }
}