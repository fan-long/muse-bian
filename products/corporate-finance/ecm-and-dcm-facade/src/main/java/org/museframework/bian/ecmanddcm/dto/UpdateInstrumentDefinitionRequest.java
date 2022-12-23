package org.museframework.bian.ecmanddcm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInstrumentDefinitionRequest {
    @MetaField
    private String ecmanddcmid;

    @MetaField
    private String instrumentdefinitionid;

    @MetaField(ref=true)
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