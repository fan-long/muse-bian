package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestMaintenanceandAccessAdministrationRequest {
    @MetaField
    private String knowledgeexchangeid;

    @MetaField
    private String maintenanceandaccessadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration maintenanceandAccessAdministration;

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

    public void setMaintenanceandAccessAdministration(org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration maintenanceandAccessAdministration) {
        this.maintenanceandAccessAdministration = maintenanceandAccessAdministration;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration getMaintenanceandAccessAdministration() {
        return maintenanceandAccessAdministration;
    }
}