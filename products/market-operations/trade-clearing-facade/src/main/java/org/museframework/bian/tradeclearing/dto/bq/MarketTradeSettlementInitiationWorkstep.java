/*A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep*/
package org.museframework.bian.tradeclearing.dto.bq;

public class MarketTradeSettlementInitiationWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Market Trade Settlement Initiation Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Market Trade Settlement Initiation Workstep*/
    private org.museframework.bian.classes.Procedure tradeClearingProcedureReference;

    /*Reference to Market Trade Settlement Initiation Workstep*/
    private org.museframework.bian.classes.Workstep marketTradeSettlementInitiationWorkstepReference;

    /*The type of Market Trade Settlement Initiation Workstep*/
    private String marketTradeSettlementInitiationWorkstepType;

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

    public void setMarketTradeSettlementInitiationWorkstepReference(org.museframework.bian.classes.Workstep marketTradeSettlementInitiationWorkstepReference) {
        this.marketTradeSettlementInitiationWorkstepReference = marketTradeSettlementInitiationWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getMarketTradeSettlementInitiationWorkstepReference() {
        return marketTradeSettlementInitiationWorkstepReference;
    }

    public void setMarketTradeSettlementInitiationWorkstepType(String marketTradeSettlementInitiationWorkstepType) {
        this.marketTradeSettlementInitiationWorkstepType = marketTradeSettlementInitiationWorkstepType;
    }

    public String getMarketTradeSettlementInitiationWorkstepType() {
        return marketTradeSettlementInitiationWorkstepType;
    }
}