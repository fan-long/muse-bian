package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveOperationalandProductionProceduresandGuidelinesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.OperationalandProductionProceduresandGuidelines operationalandProductionProceduresandGuidelines;

    public void setOperationalandProductionProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.OperationalandProductionProceduresandGuidelines operationalandProductionProceduresandGuidelines) {
        this.operationalandProductionProceduresandGuidelines = operationalandProductionProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.OperationalandProductionProceduresandGuidelines getOperationalandProductionProceduresandGuidelines() {
        return operationalandProductionProceduresandGuidelines;
    }
}