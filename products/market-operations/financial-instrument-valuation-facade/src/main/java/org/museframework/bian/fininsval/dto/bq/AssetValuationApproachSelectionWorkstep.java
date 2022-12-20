/*A course of action for doing Asset Valuation Workstep in the context of executing the Asset Valuation Workstep*/
package org.museframework.bian.fininsval.dto.bq;

public class AssetValuationApproachSelectionWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Asset Valuation Approach Selection Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Asset Valuation Approach Selection Workstep*/
    private org.museframework.bian.classes.Procedure marketAssetValuationProcedureReference;

    /*Reference to Asset Valuation Approach Selection Workstep*/
    private org.museframework.bian.classes.Workstep assetValuationApproachSelectionWorkstepReference;

    /*The type of Asset Valuation Approach Selection Workstep*/
    private String assetValuationApproachSelectionWorkstepType;

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

    public void setMarketAssetValuationProcedureReference(org.museframework.bian.classes.Procedure marketAssetValuationProcedureReference) {
        this.marketAssetValuationProcedureReference = marketAssetValuationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getMarketAssetValuationProcedureReference() {
        return marketAssetValuationProcedureReference;
    }

    public void setAssetValuationApproachSelectionWorkstepReference(org.museframework.bian.classes.Workstep assetValuationApproachSelectionWorkstepReference) {
        this.assetValuationApproachSelectionWorkstepReference = assetValuationApproachSelectionWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getAssetValuationApproachSelectionWorkstepReference() {
        return assetValuationApproachSelectionWorkstepReference;
    }

    public void setAssetValuationApproachSelectionWorkstepType(String assetValuationApproachSelectionWorkstepType) {
        this.assetValuationApproachSelectionWorkstepType = assetValuationApproachSelectionWorkstepType;
    }

    public String getAssetValuationApproachSelectionWorkstepType() {
        return assetValuationApproachSelectionWorkstepType;
    }
}