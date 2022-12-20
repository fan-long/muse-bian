package org.museframework.bian.managementmanual.dto;

public class CaptureOperationalSecurityProceduresandGuidelinesRequest {
    private String managementmanualid;

    private String operationalsecurityproceduresandguidelinesid;

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