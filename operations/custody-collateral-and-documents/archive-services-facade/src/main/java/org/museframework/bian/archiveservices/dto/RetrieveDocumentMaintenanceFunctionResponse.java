package org.museframework.bian.archiveservices.dto;

public class RetrieveDocumentMaintenanceFunctionResponse {
    private org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction documentMaintenanceFunction;

    public void setDocumentMaintenanceFunction(org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction documentMaintenanceFunction) {
        this.documentMaintenanceFunction = documentMaintenanceFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentMaintenanceFunction getDocumentMaintenanceFunction() {
        return documentMaintenanceFunction;
    }
}