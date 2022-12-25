/*An operational service or function supported within the Program Traded Portfolio Maintenance Function for doing Program Traded Portfolio Maintenance Function*/
package org.museframework.bian.programtrading.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProgramTradedPortfolioAlgorithmFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Program Traded Portfolio Algorithm Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Program Traded Portfolio Algorithm Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session programTradingOperatingSessionReference;

    /*Reference to Program Traded Portfolio Algorithm Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function programTradedPortfolioAlgorithmFunctionReference;

    /*The type of Program Traded Portfolio Algorithm Function*/
    @MetaField(0)
    private String programTradedPortfolioAlgorithmFunctionType;

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

    public void setProgramTradedPortfolioAlgorithmFunctionReference(org.museframework.bian.classes.Function programTradedPortfolioAlgorithmFunctionReference) {
        this.programTradedPortfolioAlgorithmFunctionReference = programTradedPortfolioAlgorithmFunctionReference;
    }

    public org.museframework.bian.classes.Function getProgramTradedPortfolioAlgorithmFunctionReference() {
        return programTradedPortfolioAlgorithmFunctionReference;
    }

    public void setProgramTradedPortfolioAlgorithmFunctionType(String programTradedPortfolioAlgorithmFunctionType) {
        this.programTradedPortfolioAlgorithmFunctionType = programTradedPortfolioAlgorithmFunctionType;
    }

    public String getProgramTradedPortfolioAlgorithmFunctionType() {
        return programTradedPortfolioAlgorithmFunctionType;
    }
}