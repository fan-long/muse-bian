package org.museframework.bian.sessiondialogue.dto;

public class RetrieveCaseResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.Case caseObject;

    public void setCaseObject(org.museframework.bian.sessiondialogue.dto.bq.Case caseObject) {
        this.caseObject = caseObject;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Case getCaseObject() {
        return caseObject;
    }
}