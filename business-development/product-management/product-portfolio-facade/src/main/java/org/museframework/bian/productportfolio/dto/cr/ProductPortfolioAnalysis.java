/*Analyze the performance or behavior of some on-going activity or entity  within Product Portfolio. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.productportfolio.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductPortfolioAnalysis extends org.museframework.bian.classes.ProductPortfolioAnalysis {
    /*Definition of the product portfolio*/
    @MetaField
    private String productPortfolioMake_up;

    /*The product type within the portfolio analysis*/
    @MetaField
    private String productType;

    /*Specific properties and characteristics of the product that provide context for the performance analysis*/
    @MetaField
    private String productTypeDefinition;

    /*Definition of the performance goals for products as defined by senior management functions (target/anticipated and actual as assessed).*/
    @MetaField
    private String productPortfolioPerformanceGoals;

    /*The schedule for performing product portfolio analysis for the enterprise or division*/
    @MetaField
    private String productPortfolioAnalysisSchedule;

    /*A consolidated report containing the results of performance analyses applied to the products making up the overall portfolio*/
    @MetaField
    private String productPortfolioAnalysisReport;

    /*Defines a type of performance analysis performed to products in the portfolio (e.g. scheduled review, specialized analysis, sensitivity assessment/projection)*/
    @MetaField
    private String productAnalysisType;

    /*The consolidated report of the performance evaluation and comparisons from the analysis*/
    @MetaField
    private String productAnalysisResult;

    /*The date/time the performance report was completed*/
    @MetaField
    private String productAnalysisReportingDate;

    /*Reference to associated performance analysis reporting documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    public void setProductPortfolioMake_up(String productPortfolioMake_up) {
        this.productPortfolioMake_up = productPortfolioMake_up;
    }

    public String getProductPortfolioMake_up() {
        return productPortfolioMake_up;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductTypeDefinition(String productTypeDefinition) {
        this.productTypeDefinition = productTypeDefinition;
    }

    public String getProductTypeDefinition() {
        return productTypeDefinition;
    }

    public void setProductPortfolioPerformanceGoals(String productPortfolioPerformanceGoals) {
        this.productPortfolioPerformanceGoals = productPortfolioPerformanceGoals;
    }

    public String getProductPortfolioPerformanceGoals() {
        return productPortfolioPerformanceGoals;
    }

    public void setProductPortfolioAnalysisSchedule(String productPortfolioAnalysisSchedule) {
        this.productPortfolioAnalysisSchedule = productPortfolioAnalysisSchedule;
    }

    public String getProductPortfolioAnalysisSchedule() {
        return productPortfolioAnalysisSchedule;
    }

    public void setProductPortfolioAnalysisReport(String productPortfolioAnalysisReport) {
        this.productPortfolioAnalysisReport = productPortfolioAnalysisReport;
    }

    public String getProductPortfolioAnalysisReport() {
        return productPortfolioAnalysisReport;
    }

    public void setProductAnalysisType(String productAnalysisType) {
        this.productAnalysisType = productAnalysisType;
    }

    public String getProductAnalysisType() {
        return productAnalysisType;
    }

    public void setProductAnalysisResult(String productAnalysisResult) {
        this.productAnalysisResult = productAnalysisResult;
    }

    public String getProductAnalysisResult() {
        return productAnalysisResult;
    }

    public void setProductAnalysisReportingDate(String productAnalysisReportingDate) {
        this.productAnalysisReportingDate = productAnalysisReportingDate;
    }

    public String getProductAnalysisReportingDate() {
        return productAnalysisReportingDate;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }
}