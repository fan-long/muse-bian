package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCaseRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String caseid;

    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Case caseObject;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseObject(org.museframework.bian.sessiondialogue.dto.bq.Case caseObject) {
        this.caseObject = caseObject;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Case getCaseObject() {
        return caseObject;
    }
}