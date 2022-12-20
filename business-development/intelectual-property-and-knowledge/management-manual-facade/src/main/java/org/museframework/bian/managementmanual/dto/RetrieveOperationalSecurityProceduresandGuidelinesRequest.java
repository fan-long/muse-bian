package org.museframework.bian.managementmanual.dto;

public class RetrieveOperationalSecurityProceduresandGuidelinesRequest {
    private String managementmanualid;

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