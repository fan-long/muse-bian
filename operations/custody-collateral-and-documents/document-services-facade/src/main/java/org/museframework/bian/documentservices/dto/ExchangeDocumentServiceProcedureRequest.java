package org.museframework.bian.documentservices.dto;

public class ExchangeDocumentServiceProcedureRequest {
    private String documentservicesid;

    private org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure;

    public void setDocumentservicesid(String documentservicesid) {
        this.documentservicesid = documentservicesid;
    }

    public String getDocumentservicesid() {
        return documentservicesid;
    }

    public void setDocumentServiceProcedure(org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure) {
        this.documentServiceProcedure = documentServiceProcedure;
    }

    public org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure getDocumentServiceProcedure() {
        return documentServiceProcedure;
    }
}