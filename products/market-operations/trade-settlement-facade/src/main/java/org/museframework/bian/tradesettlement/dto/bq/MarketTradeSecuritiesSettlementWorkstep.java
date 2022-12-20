/*A course of action for doing Market Trade Cash Settlement Workstep in the context of executing the Market Trade Cash Settlement Workstep*/
package org.museframework.bian.tradesettlement.dto.bq;

public class MarketTradeSecuritiesSettlementWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Market Trade Securities Settlement Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Market Trade Securities Settlement Workstep*/
    private org.museframework.bian.classes.Procedure tradeSettlementProcedureReference;

    /*Reference to Market Trade Securities Settlement Workstep*/
    private org.museframework.bian.classes.Workstep marketTradeSecuritiesSettlementWorkstepReference;

    /*The type of Market Trade Securities Settlement Workstep*/
    private String marketTradeSecuritiesSettlementWorkstepType;

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

    public void setTradeSettlementProcedureReference(org.museframework.bian.classes.Procedure tradeSettlementProcedureReference) {
        this.tradeSettlementProcedureReference = tradeSettlementProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getTradeSettlementProcedureReference() {
        return tradeSettlementProcedureReference;
    }

    public void setMarketTradeSecuritiesSettlementWorkstepReference(org.museframework.bian.classes.Workstep marketTradeSecuritiesSettlementWorkstepReference) {
        this.marketTradeSecuritiesSettlementWorkstepReference = marketTradeSecuritiesSettlementWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getMarketTradeSecuritiesSettlementWorkstepReference() {
        return marketTradeSecuritiesSettlementWorkstepReference;
    }

    public void setMarketTradeSecuritiesSettlementWorkstepType(String marketTradeSecuritiesSettlementWorkstepType) {
        this.marketTradeSecuritiesSettlementWorkstepType = marketTradeSecuritiesSettlementWorkstepType;
    }

    public String getMarketTradeSecuritiesSettlementWorkstepType() {
        return marketTradeSecuritiesSettlementWorkstepType;
    }
}