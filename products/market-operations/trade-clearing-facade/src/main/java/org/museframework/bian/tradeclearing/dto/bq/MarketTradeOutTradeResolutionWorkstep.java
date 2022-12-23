/*A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep*/
package org.museframework.bian.tradeclearing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketTradeOutTradeResolutionWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String schedule;

    /*The Market Trade Out Trade Resolution Workstep specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Market Trade Out Trade Resolution Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure tradeClearingProcedureReference;

    /*Reference to Market Trade Out Trade Resolution Workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Workstep marketTradeOutTradeResolutionWorkstepReference;

    /*The type of Market Trade Out Trade Resolution Workstep*/
    @MetaField
    private String marketTradeOutTradeResolutionWorkstepType;

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

    public void setTradeClearingProcedureReference(org.museframework.bian.classes.Procedure tradeClearingProcedureReference) {
        this.tradeClearingProcedureReference = tradeClearingProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getTradeClearingProcedureReference() {
        return tradeClearingProcedureReference;
    }

    public void setMarketTradeOutTradeResolutionWorkstepReference(org.museframework.bian.classes.Workstep marketTradeOutTradeResolutionWorkstepReference) {
        this.marketTradeOutTradeResolutionWorkstepReference = marketTradeOutTradeResolutionWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getMarketTradeOutTradeResolutionWorkstepReference() {
        return marketTradeOutTradeResolutionWorkstepReference;
    }

    public void setMarketTradeOutTradeResolutionWorkstepType(String marketTradeOutTradeResolutionWorkstepType) {
        this.marketTradeOutTradeResolutionWorkstepType = marketTradeOutTradeResolutionWorkstepType;
    }

    public String getMarketTradeOutTradeResolutionWorkstepType() {
        return marketTradeOutTradeResolutionWorkstepType;
    }
}