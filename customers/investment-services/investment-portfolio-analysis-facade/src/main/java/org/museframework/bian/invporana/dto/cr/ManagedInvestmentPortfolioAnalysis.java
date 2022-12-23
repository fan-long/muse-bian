/*Analyze the performance or behavior of some on-going activity or entity  within Investment Portfolio Analysis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.invporana.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ManagedInvestmentPortfolioAnalysis {
    /*Reference to the investment portfolio product instance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the account primary party/owner*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The employee/business unit with the relationship management responsibilities for the customer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Reference to the investment portfolio record of all holdings*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object investmentPortfolioInstanceReference;

    /*The schedule for performing investment portfolio analysis for the account*/
    @MetaField
    private String investmentPortfolioAnalysisSchedule;

    /*Reference to the underlying investment account*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object investmentAccountArrangementInstanceReference;

    /*A consolidated report containing the results of performance analyses applied to the investment portfolio*/
    @MetaField
    private String investmentPortfolioAnalysisReport;

    /*Defines a type of performance analysis performed (e.g. standard regular scheduled review, specialist review, customer requested review)*/
    @MetaField
    private String investmentPortfolioAnalysisType;

    /*The consolidated report of the performance evaluation and comparisons from the analysis*/
    @MetaField
    private String investmentPortfolioAnalysisResult;

    /*The date/time the performance report was completed*/
    @MetaField
    private String investmentPortfolioAnalysisReportingDate;

    /*Reference to associated performance analysis reporting documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setInvestmentPortfolioInstanceReference(org.museframework.bian.classes.Object investmentPortfolioInstanceReference) {
        this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
    }

    public org.museframework.bian.classes.Object getInvestmentPortfolioInstanceReference() {
        return investmentPortfolioInstanceReference;
    }

    public void setInvestmentPortfolioAnalysisSchedule(String investmentPortfolioAnalysisSchedule) {
        this.investmentPortfolioAnalysisSchedule = investmentPortfolioAnalysisSchedule;
    }

    public String getInvestmentPortfolioAnalysisSchedule() {
        return investmentPortfolioAnalysisSchedule;
    }

    public void setInvestmentAccountArrangementInstanceReference(org.museframework.bian.classes.Object investmentAccountArrangementInstanceReference) {
        this.investmentAccountArrangementInstanceReference = investmentAccountArrangementInstanceReference;
    }

    public org.museframework.bian.classes.Object getInvestmentAccountArrangementInstanceReference() {
        return investmentAccountArrangementInstanceReference;
    }

    public void setInvestmentPortfolioAnalysisReport(String investmentPortfolioAnalysisReport) {
        this.investmentPortfolioAnalysisReport = investmentPortfolioAnalysisReport;
    }

    public String getInvestmentPortfolioAnalysisReport() {
        return investmentPortfolioAnalysisReport;
    }

    public void setInvestmentPortfolioAnalysisType(String investmentPortfolioAnalysisType) {
        this.investmentPortfolioAnalysisType = investmentPortfolioAnalysisType;
    }

    public String getInvestmentPortfolioAnalysisType() {
        return investmentPortfolioAnalysisType;
    }

    public void setInvestmentPortfolioAnalysisResult(String investmentPortfolioAnalysisResult) {
        this.investmentPortfolioAnalysisResult = investmentPortfolioAnalysisResult;
    }

    public String getInvestmentPortfolioAnalysisResult() {
        return investmentPortfolioAnalysisResult;
    }

    public void setInvestmentPortfolioAnalysisReportingDate(String investmentPortfolioAnalysisReportingDate) {
        this.investmentPortfolioAnalysisReportingDate = investmentPortfolioAnalysisReportingDate;
    }

    public String getInvestmentPortfolioAnalysisReportingDate() {
        return investmentPortfolioAnalysisReportingDate;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }
}