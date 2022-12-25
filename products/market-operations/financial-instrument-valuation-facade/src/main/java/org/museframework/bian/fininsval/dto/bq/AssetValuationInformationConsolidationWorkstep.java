/*A course of action for doing Asset Valuation Workstep in the context of executing the Asset Valuation Workstep*/
package org.museframework.bian.fininsval.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AssetValuationInformationConsolidationWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String schedule;

    /*The Asset Valuation Information Consolidation Workstep specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Asset Valuation Information Consolidation Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure marketAssetValuationProcedureReference;

    /*Reference to Asset Valuation Information Consolidation Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Workstep assetValuationInformationConsolidationWorkstepReference;

    /*The type of Asset Valuation Information Consolidation Workstep*/
    @MetaField(0)
    private String assetValuationInformationConsolidationWorkstepType;

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

    public void setAssetValuationInformationConsolidationWorkstepReference(org.museframework.bian.classes.Workstep assetValuationInformationConsolidationWorkstepReference) {
        this.assetValuationInformationConsolidationWorkstepReference = assetValuationInformationConsolidationWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getAssetValuationInformationConsolidationWorkstepReference() {
        return assetValuationInformationConsolidationWorkstepReference;
    }

    public void setAssetValuationInformationConsolidationWorkstepType(String assetValuationInformationConsolidationWorkstepType) {
        this.assetValuationInformationConsolidationWorkstepType = assetValuationInformationConsolidationWorkstepType;
    }

    public String getAssetValuationInformationConsolidationWorkstepType() {
        return assetValuationInformationConsolidationWorkstepType;
    }
}