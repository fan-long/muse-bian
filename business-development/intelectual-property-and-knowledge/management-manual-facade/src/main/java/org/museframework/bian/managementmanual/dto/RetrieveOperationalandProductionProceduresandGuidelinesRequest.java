package org.museframework.bian.managementmanual.dto;

public class RetrieveOperationalandProductionProceduresandGuidelinesRequest {
    private String managementmanualid;

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