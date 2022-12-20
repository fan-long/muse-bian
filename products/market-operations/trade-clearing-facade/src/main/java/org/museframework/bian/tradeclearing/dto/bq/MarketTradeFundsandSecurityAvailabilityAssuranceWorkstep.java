/*A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep*/
package org.museframework.bian.tradeclearing.dto.bq;

public class MarketTradeFundsandSecurityAvailabilityAssuranceWorkstep {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for the workstep*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String schedule;

    /*The Market Trade Funds and Security Availability Assurance Workstep specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Market Trade Funds and Security Availability Assurance Workstep*/
    private org.museframework.bian.classes.Procedure tradeClearingProcedureReference;

    /*Reference to Market Trade Funds and Security Availability Assurance Workstep*/
    private org.museframework.bian.classes.Workstep marketTradeFundsandSecurityAvailabilityAssuranceWorkstepReference;

    /*The type of Market Trade Funds and Security Availability Assurance Workstep*/
    private String marketTradeFundsandSecurityAvailabilityAssuranceWorkstepType;

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

    public void setMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepReference(org.museframework.bian.classes.Workstep marketTradeFundsandSecurityAvailabilityAssuranceWorkstepReference) {
        this.marketTradeFundsandSecurityAvailabilityAssuranceWorkstepReference = marketTradeFundsandSecurityAvailabilityAssuranceWorkstepReference;
    }

    public org.museframework.bian.classes.Workstep getMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepReference() {
        return marketTradeFundsandSecurityAvailabilityAssuranceWorkstepReference;
    }

    public void setMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepType(String marketTradeFundsandSecurityAvailabilityAssuranceWorkstepType) {
        this.marketTradeFundsandSecurityAvailabilityAssuranceWorkstepType = marketTradeFundsandSecurityAvailabilityAssuranceWorkstepType;
    }

    public String getMarketTradeFundsandSecurityAvailabilityAssuranceWorkstepType() {
        return marketTradeFundsandSecurityAvailabilityAssuranceWorkstepType;
    }
}