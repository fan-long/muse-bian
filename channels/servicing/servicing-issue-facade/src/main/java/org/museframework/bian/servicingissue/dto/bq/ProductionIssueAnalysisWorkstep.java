/*A course of action for doing Production Issue Resolution Workstep in the context of executing the Production Issue Resolution Workstep*/
package org.museframework.bian.servicingissue.dto.bq;

public class ProductionIssueAnalysisWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Production Issue Analysis Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Production Issue Analysis Workstep*/
    private org.museframework.bian.classes.Procedure servicingIssueProcedureReference;

    /*Reference to Production Issue Analysis Workstep*/
    private org.museframework.bian.classes.Workstep productionIssueAnalysisWorkstepReference;

    /*The type of Production Issue Analysis Workstep*/
    private String productionIssueAnalysisWorkstepType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setServicingIssueProcedureReference(org.museframework.bian.classes.Procedure servicingIssueProcedureReference) {
        this.servicingIssueProcedureReference = servicingIssueProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getServicingIssueProcedureReference() {
        return servicingIssueProcedureReference;
    }

    public void setProductionIssueAnalysisWorkstepReference(org.museframework.bian.classes.Workstep productionIssueAnalysisWorkstepReference) {
        this.productionIssueAnalysisWorkstepReference = productionIssueAnalysisWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getProductionIssueAnalysisWorkstepReference() {
        return productionIssueAnalysisWorkstepReference;
    }

    public void setProductionIssueAnalysisWorkstepType(String productionIssueAnalysisWorkstepType) {
        this.productionIssueAnalysisWorkstepType = productionIssueAnalysisWorkstepType;
    }

    public String getProductionIssueAnalysisWorkstepType() {
        return productionIssueAnalysisWorkstepType;
    }
}