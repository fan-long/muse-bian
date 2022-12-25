/*Analyze the performance or behavior of some on-going activity or entity  within Case Root Cause Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.casroocauana.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CustomerCaseRootCauseAnalysis
@MetaDto
public class CustomerCaseRootCauseAnalysis {
    /*A Classification value that distinguishes between Analysis according to the type of business services and/or type of concern defined within Customer Case Root Cause Analysis . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc.*/
    @MetaField(0)
    private String customerCaseRootCauseAnalysisParameterType;

    /*A selected optional business service as subject matter of analysis*/
    @MetaField(0)
    private String customerCaseRootCauseAnalysisSelectedOption;

    /*Request to perform Customer Case Root Cause Analysis*/
    @MetaField(0)
    private String customerCaseRootCauseAnalysisRequest;

    /*Timetable to perform Customer Case Root Cause Analysis*/
    @MetaField(0)
    private String customerCaseRootCauseAnalysisSchedule;

    /*The status of Customer Case Root Cause Analysis*/
    @MetaField(0)
    private String customerCaseRootCauseAnalysisStatus;

    /*Reference to the log of (usage) ativities/events of Customer Case Root Cause Analysis*/
    @MetaField(0)
    private String customerCaseRootCauseAnalysisUsageLog;

    /*Reference to the party who has requested Customer Case Root Cause Analysis*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerCaseRootCauseAnalysisRequesterReference;

    public void setCustomerCaseRootCauseAnalysisParameterType(String customerCaseRootCauseAnalysisParameterType) {
        this.customerCaseRootCauseAnalysisParameterType = customerCaseRootCauseAnalysisParameterType;
    }

    public String getCustomerCaseRootCauseAnalysisParameterType() {
        return customerCaseRootCauseAnalysisParameterType;
    }

    public void setCustomerCaseRootCauseAnalysisSelectedOption(String customerCaseRootCauseAnalysisSelectedOption) {
        this.customerCaseRootCauseAnalysisSelectedOption = customerCaseRootCauseAnalysisSelectedOption;
    }

    public String getCustomerCaseRootCauseAnalysisSelectedOption() {
        return customerCaseRootCauseAnalysisSelectedOption;
    }

    public void setCustomerCaseRootCauseAnalysisRequest(String customerCaseRootCauseAnalysisRequest) {
        this.customerCaseRootCauseAnalysisRequest = customerCaseRootCauseAnalysisRequest;
    }

    public String getCustomerCaseRootCauseAnalysisRequest() {
        return customerCaseRootCauseAnalysisRequest;
    }

    public void setCustomerCaseRootCauseAnalysisSchedule(String customerCaseRootCauseAnalysisSchedule) {
        this.customerCaseRootCauseAnalysisSchedule = customerCaseRootCauseAnalysisSchedule;
    }

    public String getCustomerCaseRootCauseAnalysisSchedule() {
        return customerCaseRootCauseAnalysisSchedule;
    }

    public void setCustomerCaseRootCauseAnalysisStatus(String customerCaseRootCauseAnalysisStatus) {
        this.customerCaseRootCauseAnalysisStatus = customerCaseRootCauseAnalysisStatus;
    }

    public String getCustomerCaseRootCauseAnalysisStatus() {
        return customerCaseRootCauseAnalysisStatus;
    }

    public void setCustomerCaseRootCauseAnalysisUsageLog(String customerCaseRootCauseAnalysisUsageLog) {
        this.customerCaseRootCauseAnalysisUsageLog = customerCaseRootCauseAnalysisUsageLog;
    }

    public String getCustomerCaseRootCauseAnalysisUsageLog() {
        return customerCaseRootCauseAnalysisUsageLog;
    }

    public void setCustomerCaseRootCauseAnalysisRequesterReference(org.museframework.bian.classes.Object customerCaseRootCauseAnalysisRequesterReference) {
        this.customerCaseRootCauseAnalysisRequesterReference = customerCaseRootCauseAnalysisRequesterReference;
    }

    public org.museframework.bian.classes.Object getCustomerCaseRootCauseAnalysisRequesterReference() {
        return customerCaseRootCauseAnalysisRequesterReference;
    }
}