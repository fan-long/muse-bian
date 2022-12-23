/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.customerportfolio.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PerformanceAnalysis {
    /*Defines the type of analysis/algorithm used to evaluate and compare the customer segment performance to prevailing market measures*/
    @MetaField
    private String customerSegmentPerformanceAnalysisType;

    /*Record of a task to perform a selected type of performance analysis on a customer segment*/
    @MetaField
    private String customerSegmentPerformanceAnalysisTask;

    /*The specific details of the performance analysis (can be a default/standard analysis or a specialist/ad-hoc request)*/
    @MetaField
    private String customerSegmentPerformanceRequestSpecification;

    /*Reference to the performance analysis model used*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerSegmentPerformanceModelReference;

    /*The data file, report of customer related transaction details used in the analysis*/
    @MetaField
    private String customerSegmentPerformanceProductandServiceActivityReport;

    /*The content of selected financial market research report or market transaction database in any suitable form used for comparisons when appropriate*/
    @MetaField
    private String customerSegmentPerformanceFinancialMarketResearchReport;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField
    private String customerSegmentPerformanceWorkProducts;

    /*The output from executing the selected performance analysis*/
    @MetaField
    private String customerSegmentPerformanceRequestResult;

    public void setCustomerSegmentPerformanceAnalysisType(String customerSegmentPerformanceAnalysisType) {
        this.customerSegmentPerformanceAnalysisType = customerSegmentPerformanceAnalysisType;
    }

    public String getCustomerSegmentPerformanceAnalysisType() {
        return customerSegmentPerformanceAnalysisType;
    }

    public void setCustomerSegmentPerformanceAnalysisTask(String customerSegmentPerformanceAnalysisTask) {
        this.customerSegmentPerformanceAnalysisTask = customerSegmentPerformanceAnalysisTask;
    }

    public String getCustomerSegmentPerformanceAnalysisTask() {
        return customerSegmentPerformanceAnalysisTask;
    }

    public void setCustomerSegmentPerformanceRequestSpecification(String customerSegmentPerformanceRequestSpecification) {
        this.customerSegmentPerformanceRequestSpecification = customerSegmentPerformanceRequestSpecification;
    }

    public String getCustomerSegmentPerformanceRequestSpecification() {
        return customerSegmentPerformanceRequestSpecification;
    }

    public void setCustomerSegmentPerformanceModelReference(org.museframework.bian.classes.Object customerSegmentPerformanceModelReference) {
        this.customerSegmentPerformanceModelReference = customerSegmentPerformanceModelReference;
    }

    public org.museframework.bian.classes.Object getCustomerSegmentPerformanceModelReference() {
        return customerSegmentPerformanceModelReference;
    }

    public void setCustomerSegmentPerformanceProductandServiceActivityReport(String customerSegmentPerformanceProductandServiceActivityReport) {
        this.customerSegmentPerformanceProductandServiceActivityReport = customerSegmentPerformanceProductandServiceActivityReport;
    }

    public String getCustomerSegmentPerformanceProductandServiceActivityReport() {
        return customerSegmentPerformanceProductandServiceActivityReport;
    }

    public void setCustomerSegmentPerformanceFinancialMarketResearchReport(String customerSegmentPerformanceFinancialMarketResearchReport) {
        this.customerSegmentPerformanceFinancialMarketResearchReport = customerSegmentPerformanceFinancialMarketResearchReport;
    }

    public String getCustomerSegmentPerformanceFinancialMarketResearchReport() {
        return customerSegmentPerformanceFinancialMarketResearchReport;
    }

    public void setCustomerSegmentPerformanceWorkProducts(String customerSegmentPerformanceWorkProducts) {
        this.customerSegmentPerformanceWorkProducts = customerSegmentPerformanceWorkProducts;
    }

    public String getCustomerSegmentPerformanceWorkProducts() {
        return customerSegmentPerformanceWorkProducts;
    }

    public void setCustomerSegmentPerformanceRequestResult(String customerSegmentPerformanceRequestResult) {
        this.customerSegmentPerformanceRequestResult = customerSegmentPerformanceRequestResult;
    }

    public String getCustomerSegmentPerformanceRequestResult() {
        return customerSegmentPerformanceRequestResult;
    }
}