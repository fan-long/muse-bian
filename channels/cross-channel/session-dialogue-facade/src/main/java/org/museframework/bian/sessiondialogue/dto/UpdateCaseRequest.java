package org.museframework.bian.sessiondialogue.dto;

public class UpdateCaseRequest {
    private String sessiondialogueid;

    private String caseid;

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