/*Analyze the performance or behavior of some on-going activity or entity  within Servicing Activity Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.seractana.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ServicingRootCauseAnalysis
@MetaDto
public class ServicingRootCauseAnalysis {
    /*The type of servicing activity for which the analysis is performed (e.g. self service, contact center assisted,  ATM access)*/
    @MetaField
    private String servicingActivityType;

    /*The period covered by the analysis (from to date time)*/
    @MetaField
    private String servicingActivityAnalysisPeriod;

    /*The type of root cause analysis - defines the scope and type of root cause issue that is being detected (e.g. service dialogue, click-stream, product processing issues, servicing representative performance)*/
    @MetaField
    private String servicingActivityAnalysisType;

    /*The result of the servicing activity analysis - typically the consolidated view from applying multiple underlying root cause algorithms to highlight patterns that indicate potential root cause issues*/
    @MetaField
    private String servicingActivityAnalysisResult;

    /*An analysis of the root causes for the detected service anomalies*/
    @MetaField
    private String servicingActivityAnalysisDetermination;

    /*Proposed changes to procedures/organization etc that can mitigate the detected servicing issues*/
    @MetaField
    private String servicingActivityAnalysisRecommendation;

    /*The raw data used in the analysis (retrieved from Servicing Activity History)*/
    @MetaField
    private String servicingActivityHistoryReport;

    public void setServicingActivityType(String servicingActivityType) {
        this.servicingActivityType = servicingActivityType;
    }

    public String getServicingActivityType() {
        return servicingActivityType;
    }

    public void setServicingActivityAnalysisPeriod(String servicingActivityAnalysisPeriod) {
        this.servicingActivityAnalysisPeriod = servicingActivityAnalysisPeriod;
    }

    public String getServicingActivityAnalysisPeriod() {
        return servicingActivityAnalysisPeriod;
    }

    public void setServicingActivityAnalysisType(String servicingActivityAnalysisType) {
        this.servicingActivityAnalysisType = servicingActivityAnalysisType;
    }

    public String getServicingActivityAnalysisType() {
        return servicingActivityAnalysisType;
    }

    public void setServicingActivityAnalysisResult(String servicingActivityAnalysisResult) {
        this.servicingActivityAnalysisResult = servicingActivityAnalysisResult;
    }

    public String getServicingActivityAnalysisResult() {
        return servicingActivityAnalysisResult;
    }

    public void setServicingActivityAnalysisDetermination(String servicingActivityAnalysisDetermination) {
        this.servicingActivityAnalysisDetermination = servicingActivityAnalysisDetermination;
    }

    public String getServicingActivityAnalysisDetermination() {
        return servicingActivityAnalysisDetermination;
    }

    public void setServicingActivityAnalysisRecommendation(String servicingActivityAnalysisRecommendation) {
        this.servicingActivityAnalysisRecommendation = servicingActivityAnalysisRecommendation;
    }

    public String getServicingActivityAnalysisRecommendation() {
        return servicingActivityAnalysisRecommendation;
    }

    public void setServicingActivityHistoryReport(String servicingActivityHistoryReport) {
        this.servicingActivityHistoryReport = servicingActivityHistoryReport;
    }

    public String getServicingActivityHistoryReport() {
        return servicingActivityHistoryReport;
    }
}