package org.museframework.bian.parlifman.dto;

public class RetrieveDocumentationResponse {
    private org.museframework.bian.parlifman.dto.bq.Documentation documentation;

    public void setDocumentation(org.museframework.bian.parlifman.dto.bq.Documentation documentation) {
        this.documentation = documentation;
    }

    public org.museframework.bian.parlifman.dto.bq.Documentation getDocumentation() {
        return documentation;
    }
}