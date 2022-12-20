package org.museframework.bian.documentdirectory.dto;

public class RegisterDocumentVerificationPropertiesResponse {
    private org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties;

    public void setDocumentVerificationProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties) {
        this.documentVerificationProperties = documentVerificationProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties getDocumentVerificationProperties() {
        return documentVerificationProperties;
    }
}