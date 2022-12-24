/*Analyze the performance or behavior of some on-going activity or entity  within Customer Portfolio. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.customerportfolio.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CustomerSegmentAnalysis
@MetaDto
public class CustomerSegmentAnalysis {
    /*The descriptive name of the bank defined customer segment*/
    @MetaField
    private String customerSegmentType;

    /*Detailed properties and characteristics that define the customer segment*/
    @MetaField
    private String customerSegmentTypeDefinition;

    /*Definition of the performance goals for defined customer segments as defined by senior management functions (target/anticipated and actual as assessed).*/
    @MetaField
    private String customerSegmentPerformanceGoals;

    /*The schedule for performing customer segment analysis for the enterprise or division*/
    @MetaField
    private String customerSegmentAnalysisSchedule;

    /*A consolidated report containing the results of performance analyses applied to the Customer Segment*/
    @MetaField
    private String customerSegmentAnalysisReport;

    /*Defines a type of performance analysis performed (e.g. scheduled review, specialized analysis, sensitivity assessment/projection)*/
    @MetaField
    private String customerSegmentAnalysisType;

    /*The consolidated report of the performance evaluation and comparisons from the analysis*/
    @MetaField
    private String customerSegmentAnalysisResult;

    /*The date/time the performance report was completed*/
    @MetaField
    private String customerSegmentAnalysisReportingDate;

    /*Reference to associated performance analysis reporting documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    public void setCustomerSegmentType(String customerSegmentType) {
        this.customerSegmentType = customerSegmentType;
    }

    public String getCustomerSegmentType() {
        return customerSegmentType;
    }

    public void setCustomerSegmentTypeDefinition(String customerSegmentTypeDefinition) {
        this.customerSegmentTypeDefinition = customerSegmentTypeDefinition;
    }

    public String getCustomerSegmentTypeDefinition() {
        return customerSegmentTypeDefinition;
    }

    public void setCustomerSegmentPerformanceGoals(String customerSegmentPerformanceGoals) {
        this.customerSegmentPerformanceGoals = customerSegmentPerformanceGoals;
    }

    public String getCustomerSegmentPerformanceGoals() {
        return customerSegmentPerformanceGoals;
    }

    public void setCustomerSegmentAnalysisSchedule(String customerSegmentAnalysisSchedule) {
        this.customerSegmentAnalysisSchedule = customerSegmentAnalysisSchedule;
    }

    public String getCustomerSegmentAnalysisSchedule() {
        return customerSegmentAnalysisSchedule;
    }

    public void setCustomerSegmentAnalysisReport(String customerSegmentAnalysisReport) {
        this.customerSegmentAnalysisReport = customerSegmentAnalysisReport;
    }

    public String getCustomerSegmentAnalysisReport() {
        return customerSegmentAnalysisReport;
    }

    public void setCustomerSegmentAnalysisType(String customerSegmentAnalysisType) {
        this.customerSegmentAnalysisType = customerSegmentAnalysisType;
    }

    public String getCustomerSegmentAnalysisType() {
        return customerSegmentAnalysisType;
    }

    public void setCustomerSegmentAnalysisResult(String customerSegmentAnalysisResult) {
        this.customerSegmentAnalysisResult = customerSegmentAnalysisResult;
    }

    public String getCustomerSegmentAnalysisResult() {
        return customerSegmentAnalysisResult;
    }

    public void setCustomerSegmentAnalysisReportingDate(String customerSegmentAnalysisReportingDate) {
        this.customerSegmentAnalysisReportingDate = customerSegmentAnalysisReportingDate;
    }

    public String getCustomerSegmentAnalysisReportingDate() {
        return customerSegmentAnalysisReportingDate;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }
}