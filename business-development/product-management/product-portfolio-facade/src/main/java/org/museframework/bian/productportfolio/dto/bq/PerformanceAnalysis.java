/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.productportfolio.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PerformanceAnalysis {
    /*Defines the type of analysis/algorithm used to evaluate and compare the product performance to prevailing market measures*/
    @MetaField
    private String productPerformanceAnalysisType;

    /*Record of a task to perform a selected type of performance analysis on a product within the portfolio*/
    @MetaField
    private String productPerformanceAnalysisTask;

    /*The specific details of the performance analysis (can be a default/standard scheduled analysis or a specialist/ad-hoc request)*/
    @MetaField
    private String productPerformanceRequestSpecification;

    /*Reference to the performance analysis model used*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productPerformanceModelReference;

    /*The data file, report of product related transaction details used in the analysis*/
    @MetaField
    private String productPerformanceProductandServiceActivityReport;

    /*The content of selected financial market research report or market transaction database in any suitable form used for comparisons when appropriate*/
    @MetaField
    private String productPerformanceFinancialMarketResearchReport;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField
    private String productPerformanceWorkProducts;

    /*The output from executing the selected product performance analysis*/
    @MetaField
    private String productPerformanceRequestResult;

    public void setProductPerformanceAnalysisType(String productPerformanceAnalysisType) {
        this.productPerformanceAnalysisType = productPerformanceAnalysisType;
    }

    public String getProductPerformanceAnalysisType() {
        return productPerformanceAnalysisType;
    }

    public void setProductPerformanceAnalysisTask(String productPerformanceAnalysisTask) {
        this.productPerformanceAnalysisTask = productPerformanceAnalysisTask;
    }

    public String getProductPerformanceAnalysisTask() {
        return productPerformanceAnalysisTask;
    }

    public void setProductPerformanceRequestSpecification(String productPerformanceRequestSpecification) {
        this.productPerformanceRequestSpecification = productPerformanceRequestSpecification;
    }

    public String getProductPerformanceRequestSpecification() {
        return productPerformanceRequestSpecification;
    }

    public void setProductPerformanceModelReference(org.museframework.bian.classes.Object productPerformanceModelReference) {
        this.productPerformanceModelReference = productPerformanceModelReference;
    }

    public org.museframework.bian.classes.Object getProductPerformanceModelReference() {
        return productPerformanceModelReference;
    }

    public void setProductPerformanceProductandServiceActivityReport(String productPerformanceProductandServiceActivityReport) {
        this.productPerformanceProductandServiceActivityReport = productPerformanceProductandServiceActivityReport;
    }

    public String getProductPerformanceProductandServiceActivityReport() {
        return productPerformanceProductandServiceActivityReport;
    }

    public void setProductPerformanceFinancialMarketResearchReport(String productPerformanceFinancialMarketResearchReport) {
        this.productPerformanceFinancialMarketResearchReport = productPerformanceFinancialMarketResearchReport;
    }

    public String getProductPerformanceFinancialMarketResearchReport() {
        return productPerformanceFinancialMarketResearchReport;
    }

    public void setProductPerformanceWorkProducts(String productPerformanceWorkProducts) {
        this.productPerformanceWorkProducts = productPerformanceWorkProducts;
    }

    public String getProductPerformanceWorkProducts() {
        return productPerformanceWorkProducts;
    }

    public void setProductPerformanceRequestResult(String productPerformanceRequestResult) {
        this.productPerformanceRequestResult = productPerformanceRequestResult;
    }

    public String getProductPerformanceRequestResult() {
        return productPerformanceRequestResult;
    }
}