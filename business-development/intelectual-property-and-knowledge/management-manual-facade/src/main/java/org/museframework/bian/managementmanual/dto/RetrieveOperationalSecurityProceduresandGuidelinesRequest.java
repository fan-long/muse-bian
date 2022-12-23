package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOperationalSecurityProceduresandGuidelinesRequest {
    @MetaField
    private String managementmanualid;

    @MetaField
    private String operationalsecurityproceduresandguidelinesid;

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
}