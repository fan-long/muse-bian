package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveIntelligenceRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String intelligenceid;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setIntelligenceid(String intelligenceid) {
        this.intelligenceid = intelligenceid;
    }

    public String getIntelligenceid() {
        return intelligenceid;
    }
}