package org.museframework.bian.managementmanual.dto;

public class InitiateOperationalandProductionProceduresandGuidelinesRequest {
    private String managementmanualid;

    private String operationalandproductionproceduresandguidelinesid;

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