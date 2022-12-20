package org.museframework.bian.documentdirectory.dto;

public class NotifyDocumentVersionPropertiesResponse {
    private org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties;

    public void setDocumentVersionProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties) {
        this.documentVersionProperties = documentVersionProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties getDocumentVersionProperties() {
        return documentVersionProperties;
    }
}