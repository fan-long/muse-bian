package org.museframework.bian.ecmanddcm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInstrumentDefinitionRequest {
    @MetaField
    private String ecmanddcmid;

    @MetaField
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