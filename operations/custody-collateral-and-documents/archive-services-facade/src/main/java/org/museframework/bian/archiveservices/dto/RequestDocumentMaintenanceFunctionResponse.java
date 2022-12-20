package org.museframework.bian.archiveservices.dto;

public class RequestDocumentMaintenanceFunctionResponse {
    private org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction documentMaintenanceFunction;

    public void setDocumentMaintenanceFunction(org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction documentMaintenanceFunction) {
        this.documentMaintenanceFunction = documentMaintenanceFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction getDocumentMaintenanceFunction() {
        return documentMaintenanceFunction;
    }
}