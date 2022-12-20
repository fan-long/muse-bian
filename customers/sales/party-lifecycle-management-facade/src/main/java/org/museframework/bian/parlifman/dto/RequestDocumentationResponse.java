package org.museframework.bian.parlifman.dto;

public class RequestDocumentationResponse {
    private org.museframework.bian.parlifman.dto.bq.Documentation documentation;

    public void setDocumentation(org.museframework.bian.parlifman.dto.bq.Documentation documentation) {
        this.documentation = documentation;
    }

    public org.museframework.bian.parlifman.dto.bq.Documentation getDocumentation() {
        return documentation;
    }
}