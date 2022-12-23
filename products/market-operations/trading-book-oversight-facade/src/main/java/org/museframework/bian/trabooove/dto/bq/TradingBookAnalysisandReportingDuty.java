/*The Trading Book Risk Mitigation Duty is a specific role or responsibility that is one aspect of Trading Book Risk Mitigation Duty*/
package org.museframework.bian.trabooove.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradingBookAnalysisandReportingDuty {
    /*The required status/situation before the duty/obligation can be met*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    @MetaField
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    @MetaField
    private String schedule;

    /*The Trading Book Analysis and Reporting Duty specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Trading Book Analysis and Reporting Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan tradingPositionManagementPlanReference;

    /*Reference to Trading Book Analysis and Reporting Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction tradingBookAnalysisandReportingDutyReference;

    /*The type of Trading Book Analysis and Reporting Duty*/
    @MetaField
    private String tradingBookAnalysisandReportingDutyType;

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

    public void setTradingPositionManagementPlanReference(org.museframework.bian.classes.Plan tradingPositionManagementPlanReference) {
        this.tradingPositionManagementPlanReference = tradingPositionManagementPlanReference;
    }

    public org.museframework.bian.classes.Plan getTradingPositionManagementPlanReference() {
        return tradingPositionManagementPlanReference;
    }

    public void setTradingBookAnalysisandReportingDutyReference(org.museframework.bian.classes.PlannedAction tradingBookAnalysisandReportingDutyReference) {
        this.tradingBookAnalysisandReportingDutyReference = tradingBookAnalysisandReportingDutyReference;
    }

    public org.museframework.bian.classes.PlannedAction getTradingBookAnalysisandReportingDutyReference() {
        return tradingBookAnalysisandReportingDutyReference;
    }

    public void setTradingBookAnalysisandReportingDutyType(String tradingBookAnalysisandReportingDutyType) {
        this.tradingBookAnalysisandReportingDutyType = tradingBookAnalysisandReportingDutyType;
    }

    public String getTradingBookAnalysisandReportingDutyType() {
        return tradingBookAnalysisandReportingDutyType;
    }
}