package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureOperationalSecurityProceduresandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String operationalsecurityproceduresandguidelinesid;

    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.OperationalSecurityProceduresandGuidelines operationalSecurityProceduresandGuidelines;

    public void setManagementmanualid(String managementmanualid) {
        this.managementmanualid = managementmanualid;
    }

    public String getManagementmanualid() {
        return managementmanualid;
    }

    public void setOperationalsecurityproceduresandguidelinesid(String operationalsecurityproceduresandguidelinesid) {
        this.operationalsecurityproceduresandguidelinesid = operationalsecurityproceduresandguidelinesid;
    }

    public String getOperationalsecurityproceduresandguidelinesid() {
        return operationalsecurityproceduresandguidelinesid;
    }

    public void setOperationalSecurityProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.OperationalSecurityProceduresandGuidelines operationalSecurityProceduresandGuidelines) {
        this.operationalSecurityProceduresandGuidelines = operationalSecurityProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.OperationalSecurityProceduresandGuidelines getOperationalSecurityProceduresandGuidelines() {
        return operationalSecurityProceduresandGuidelines;
    }
}