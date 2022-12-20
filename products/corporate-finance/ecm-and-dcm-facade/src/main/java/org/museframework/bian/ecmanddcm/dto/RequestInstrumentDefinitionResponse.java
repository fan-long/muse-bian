package org.museframework.bian.ecmanddcm.dto;

public class RequestInstrumentDefinitionResponse {
    private org.museframework.bian.ecmanddcm.dto.bq.InstrumentDefinition instrumentDefinition;

    public void setInstrumentDefinition(org.museframework.bian.ecmanddcm.dto.bq.InstrumentDefinition instrumentDefinition) {
        this.instrumentDefinition = instrumentDefinition;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.InstrumentDefinition getInstrumentDefinition() {
        return instrumentDefinition;
    }
}