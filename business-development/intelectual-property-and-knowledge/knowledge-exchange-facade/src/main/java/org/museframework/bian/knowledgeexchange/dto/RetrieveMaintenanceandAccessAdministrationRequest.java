package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMaintenanceandAccessAdministrationRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
    private String maintenanceandaccessadministrationid;

    public void setKnowledgeexchangeid(String knowledgeexchangeid) {
        this.knowledgeexchangeid = knowledgeexchangeid;
    }

    public String getKnowledgeexchangeid() {
        return knowledgeexchangeid;
    }

    public void setMaintenanceandaccessadministrationid(String maintenanceandaccessadministrationid) {
        this.maintenanceandaccessadministrationid = maintenanceandaccessadministrationid;
    }

    public String getMaintenanceandaccessadministrationid() {
        return maintenanceandaccessadministrationid;
    }
}