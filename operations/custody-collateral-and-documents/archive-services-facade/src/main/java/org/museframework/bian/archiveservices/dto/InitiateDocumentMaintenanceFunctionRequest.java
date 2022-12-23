package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateDocumentMaintenanceFunctionRequest {
    @MetaField
    private String archiveservicesid;

    @MetaField
    private String documentmaintenancefunctionid;

    @MetaField(ref=true)
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