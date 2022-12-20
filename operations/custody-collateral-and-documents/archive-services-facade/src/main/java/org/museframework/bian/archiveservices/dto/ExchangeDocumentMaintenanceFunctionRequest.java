package org.museframework.bian.archiveservices.dto;

public class ExchangeDocumentMaintenanceFunctionRequest {
    private String archiveservicesid;

    private String documentmaintenancefunctionid;

    private org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction documentMaintenanceFunction;

    public void setArchiveservicesid(String archiveservicesid) {
        this.archiveservicesid = archiveservicesid;
    }

    public String getArchiveservicesid() {
        return archiveservicesid;
    }

    public void setDocumentmaintenancefunctionid(String documentmaintenancefunctionid) {
        this.documentmaintenancefunctionid = documentmaintenancefunctionid;
    }

    public String getDocumentmaintenancefunctionid() {
        return documentmaintenancefunctionid;
    }

    public void setDocumentMaintenanceFunction(org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction documentMaintenanceFunction) {
        this.documentMaintenanceFunction = documentMaintenanceFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction getDocumentMaintenanceFunction() {
        return documentMaintenanceFunction;
    }
}