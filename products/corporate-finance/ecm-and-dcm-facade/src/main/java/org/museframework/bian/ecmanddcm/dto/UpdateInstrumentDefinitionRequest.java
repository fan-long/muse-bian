package org.museframework.bian.ecmanddcm.dto;

public class UpdateInstrumentDefinitionRequest {
    private String ecmanddcmid;

    private String instrumentdefinitionid;

    private org.museframework.bian.ecmanddcm.dto.bq.InstrumentDefinition instrumentDefinition;

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

    public void setInstrumentDefinition(org.museframework.bian.ecmanddcm.dto.bq.InstrumentDefinition instrumentDefinition) {
        this.instrumentDefinition = instrumentDefinition;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.InstrumentDefinition getInstrumentDefinition() {
        return instrumentDefinition;
    }
}