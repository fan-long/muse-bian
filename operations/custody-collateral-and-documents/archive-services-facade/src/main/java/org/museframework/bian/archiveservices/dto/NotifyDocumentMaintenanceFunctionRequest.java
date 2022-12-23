package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyDocumentMaintenanceFunctionRequest {
    @MetaField
    private String archiveservicesid;

    @MetaField
    private String documentmaintenancefunctionid;

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
}