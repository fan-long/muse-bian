package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestMaintenanceandAccessAdministrationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration maintenanceandAccessAdministration;

    public void setMaintenanceandAccessAdministration(org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration maintenanceandAccessAdministration) {
        this.maintenanceandAccessAdministration = maintenanceandAccessAdministration;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.MaintenanceandAccessAdministration getMaintenanceandAccessAdministration() {
        return maintenanceandAccessAdministration;
    }
}