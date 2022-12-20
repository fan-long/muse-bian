package org.museframework.bian.documentservices.dto;

public class ExecuteDocumentServiceProcedureResponse {
    private org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure;

    public void setDocumentServiceProcedure(org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure) {
        this.documentServiceProcedure = documentServiceProcedure;
    }

    public org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure getDocumentServiceProcedure() {
        return documentServiceProcedure;
    }
}