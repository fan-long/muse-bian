package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateOperationalandProductionProceduresandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String operationalandproductionproceduresandguidelinesid;

    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.OperationalandProductionProceduresandGuidelines operationalandProductionProceduresandGuidelines;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setOperationalandproductionproceduresandguidelinesid(String operationalandproductionproceduresandguidelinesid) {
        this.operationalandproductionproceduresandguidelinesid = operationalandproductionproceduresandguidelinesid;
    }

    public String getOperationalandproductionproceduresandguidelinesid() {
        return operationalandproductionproceduresandguidelinesid;
    }

    public void setOperationalandProductionProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.OperationalandProductionProceduresandGuidelines operationalandProductionProceduresandGuidelines) {
        this.operationalandProductionProceduresandGuidelines = operationalandProductionProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.OperationalandProductionProceduresandGuidelines getOperationalandProductionProceduresandGuidelines() {
        return operationalandProductionProceduresandGuidelines;
    }
}