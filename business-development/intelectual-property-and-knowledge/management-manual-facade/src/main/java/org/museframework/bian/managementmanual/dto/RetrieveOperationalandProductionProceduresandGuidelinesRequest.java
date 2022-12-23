package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOperationalandProductionProceduresandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String operationalandproductionproceduresandguidelinesid;

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
}