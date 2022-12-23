/*A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep*/
package org.museframework.bian.corporateaction.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StockSplitorReversalActionWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String schedule;

    /*The Stock Split or Reversal Action Workstep specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Stock Split or Reversal Action Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure corporateActionProcedureReference;

    /*Reference to Stock Split or Reversal Action Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Workstep stockSplitorReversalActionWorkstepReference;

    /*The type of Stock Split or Reversal Action Workstep*/
    @MetaField
    private String stockSplitorReversalActionWorkstepType;

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

    public void setCorporateActionProcedureReference(org.museframework.bian.classes.Procedure corporateActionProcedureReference) {
        this.corporateActionProcedureReference = corporateActionProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getCorporateActionProcedureReference() {
        return corporateActionProcedureReference;
    }

    public void setStockSplitorReversalActionWorkstepReference(org.museframework.bian.classes.Workstep stockSplitorReversalActionWorkstepReference) {
        this.stockSplitorReversalActionWorkstepReference = stockSplitorReversalActionWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getStockSplitorReversalActionWorkstepReference() {
        return stockSplitorReversalActionWorkstepReference;
    }

    public void setStockSplitorReversalActionWorkstepType(String stockSplitorReversalActionWorkstepType) {
        this.stockSplitorReversalActionWorkstepType = stockSplitorReversalActionWorkstepType;
    }

    public String getStockSplitorReversalActionWorkstepType() {
        return stockSplitorReversalActionWorkstepType;
    }
}