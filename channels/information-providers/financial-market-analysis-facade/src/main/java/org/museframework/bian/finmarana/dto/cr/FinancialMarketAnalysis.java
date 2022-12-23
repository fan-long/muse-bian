/*Analyze the performance or behavior of some on-going activity or entity  within Financial Market Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.finmarana.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialMarketAnalysis extends org.museframework.bian.classes.FinancialMarketAnalysis {
    /*A Classification value that distinguishes between Analysis according to the type of business services and/or type of concern defined within Financial Market Analysis . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc.*/
    @MetaField
    private String financialMarketAnalysisParameterType;

    /*A selected optional business service as subject matter of analysis*/
    @MetaField
    private String financialMarketAnalysisSelectedOption;

    /*Request to perform Financial Market Analysis*/
    @MetaField
    private String financialMarketAnalysisRequest;

    /*Timetable to perform Financial Market Analysis*/
    @MetaField
    private String financialMarketAnalysisSchedule;

    /*The status of Financial Market Analysis*/
    @MetaField
    private String financialMarketAnalysisStatus;

    /*Reference to the log of (usage) ativities/events of Financial Market Analysis*/
    @MetaField
    private String financialMarketAnalysisUsageLog;

    /*Reference to the party who has requested Financial Market Analysis*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object financialMarketAnalysisRequesterReference;

    public void setFinancialMarketAnalysisParameterType(String financialMarketAnalysisParameterType) {
        this.financialMarketAnalysisParameterType = financialMarketAnalysisParameterType;
    }

    public String getFinancialMarketAnalysisParameterType() {
        return financialMarketAnalysisParameterType;
    }

    public void setFinancialMarketAnalysisSelectedOption(String financialMarketAnalysisSelectedOption) {
        this.financialMarketAnalysisSelectedOption = financialMarketAnalysisSelectedOption;
    }

    public String getFinancialMarketAnalysisSelectedOption() {
        return financialMarketAnalysisSelectedOption;
    }

    public void setFinancialMarketAnalysisRequest(String financialMarketAnalysisRequest) {
        this.financialMarketAnalysisRequest = financialMarketAnalysisRequest;
    }

    public String getFinancialMarketAnalysisRequest() {
        return financialMarketAnalysisRequest;
    }

    public void setFinancialMarketAnalysisSchedule(String financialMarketAnalysisSchedule) {
        this.financialMarketAnalysisSchedule = financialMarketAnalysisSchedule;
    }

    public String getFinancialMarketAnalysisSchedule() {
        return financialMarketAnalysisSchedule;
    }

    public void setFinancialMarketAnalysisStatus(String financialMarketAnalysisStatus) {
        this.financialMarketAnalysisStatus = financialMarketAnalysisStatus;
    }

    public String getFinancialMarketAnalysisStatus() {
        return financialMarketAnalysisStatus;
    }

    public void setFinancialMarketAnalysisUsageLog(String financialMarketAnalysisUsageLog) {
        this.financialMarketAnalysisUsageLog = financialMarketAnalysisUsageLog;
    }

    public String getFinancialMarketAnalysisUsageLog() {
        return financialMarketAnalysisUsageLog;
    }

    public void setFinancialMarketAnalysisRequesterReference(org.museframework.bian.classes.Object financialMarketAnalysisRequesterReference) {
        this.financialMarketAnalysisRequesterReference = financialMarketAnalysisRequesterReference;
    }

    public org.museframework.bian.classes.Object getFinancialMarketAnalysisRequesterReference() {
        return financialMarketAnalysisRequesterReference;
    }
}