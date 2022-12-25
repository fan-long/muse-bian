/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.customerposition.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Cashflow {
    /*Reference to the one of more products and services in use for which transaction activity is to be obtained*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The types of product fulfillment reports available - in this case transaction details used for different measures or position analyses*/
    @MetaField(0)
    private String productArrangementInstanceReportType;

    /*The product/service activity report - transactional activity used for financial analysis*/
    @MetaField(0)
    private String productArrangementInstanceReport;

    /*Defines content/transaction types to be included in the report extract*/
    @MetaField(0)
    private String reportOptionsSelectionCriteria;

    /*The from-to dates covered by the report for analysis*/
    @MetaField(0)
    private String reportPeriod;

    /*Defines presentation format*/
    @MetaField(0)
    private String reportFormatTemplate;

    /*The requested product/service activity report used in the position measurements*/
    @MetaField(0)
    private String report;

    /*The customer cashflow analysis - past, current position and projected cash flows as derived from all active product/service activity reports*/
    @MetaField(0)
    private String customerCashflowPositionAnalysisRecord;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProductArrangementInstanceReportType(String productArrangementInstanceReportType) {
        this.productArrangementInstanceReportType = productArrangementInstanceReportType;
    }

    public String getProductArrangementInstanceReportType() {
        return productArrangementInstanceReportType;
    }

    public void setProductArrangementInstanceReport(String productArrangementInstanceReport) {
        this.productArrangementInstanceReport = productArrangementInstanceReport;
    }

    public String getProductArrangementInstanceReport() {
        return productArrangementInstanceReport;
    }

    public void setReportOptionsSelectionCriteria(String reportOptionsSelectionCriteria) {
        this.reportOptionsSelectionCriteria = reportOptionsSelectionCriteria;
    }

    public String getReportOptionsSelectionCriteria() {
        return reportOptionsSelectionCriteria;
    }

    public void setReportPeriod(String reportPeriod) {
        this.reportPeriod = reportPeriod;
    }

    public String getReportPeriod() {
        return reportPeriod;
    }

    public void setReportFormatTemplate(String reportFormatTemplate) {
        this.reportFormatTemplate = reportFormatTemplate;
    }

    public String getReportFormatTemplate() {
        return reportFormatTemplate;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public void setCustomerCashflowPositionAnalysisRecord(String customerCashflowPositionAnalysisRecord) {
        this.customerCashflowPositionAnalysisRecord = customerCashflowPositionAnalysisRecord;
    }

    public String getCustomerCashflowPositionAnalysisRecord() {
        return customerCashflowPositionAnalysisRecord;
    }
}