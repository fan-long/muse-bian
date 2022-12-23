/*An operational service or function supported within the Program Traded Portfolio Maintenance Function for doing Program Traded Portfolio Maintenance Function*/
package org.museframework.bian.programtrading.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProgramTradedPortfolioMaintenanceFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Program Traded Portfolio Maintenance Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Program Traded Portfolio Maintenance Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session programTradingOperatingSessionReference;

    /*Reference to Program Traded Portfolio Maintenance Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function programTradedPortfolioMaintenanceFunctionReference;

    /*The type of Program Traded Portfolio Maintenance Function*/
    @MetaField
    private String programTradedPortfolioMaintenanceFunctionType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
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

    public void setProgramTradingOperatingSessionReference(org.museframework.bian.classes.Session programTradingOperatingSessionReference) {
        this.programTradingOperatingSessionReference = programTradingOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getProgramTradingOperatingSessionReference() {
        return programTradingOperatingSessionReference;
    }

    public void setProgramTradedPortfolioMaintenanceFunctionReference(org.museframework.bian.classes.Function programTradedPortfolioMaintenanceFunctionReference) {
        this.programTradedPortfolioMaintenanceFunctionReference = programTradedPortfolioMaintenanceFunctionReference;
    }

    public org.museframework.bian.classes.Function getProgramTradedPortfolioMaintenanceFunctionReference() {
        return programTradedPortfolioMaintenanceFunctionReference;
    }

    public void setProgramTradedPortfolioMaintenanceFunctionType(String programTradedPortfolioMaintenanceFunctionType) {
        this.programTradedPortfolioMaintenanceFunctionType = programTradedPortfolioMaintenanceFunctionType;
    }

    public String getProgramTradedPortfolioMaintenanceFunctionType() {
        return programTradedPortfolioMaintenanceFunctionType;
    }
}