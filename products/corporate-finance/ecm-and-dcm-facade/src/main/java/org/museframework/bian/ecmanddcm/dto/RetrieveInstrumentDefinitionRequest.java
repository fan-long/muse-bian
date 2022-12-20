package org.museframework.bian.ecmanddcm.dto;

public class RetrieveInstrumentDefinitionRequest {
    private String ecmanddcmid;

    private String instrumentdefinitionid;

    public void setEcmanddcmid(String ecmanddcmid) {
        this.ecmanddcmid = ecmanddcmid;
    }

    public String getEcmanddcmid() {
        return ecmanddcmid;
    }

    public void setInstrumentdefinitionid(String instrumentdefinitionid) {
        this.instrumentdefinitionid = instrumentdefinitionid;
    }

    public String getInstrumentdefinitionid() {
        return instrumentdefinitionid;
    }
}