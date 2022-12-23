/*The product features/services available with a financical facility*/
package org.museframework.bian.custaxhan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Consolidation {
    /*Reference to the one of more products and services in use for which tax related activity is to be obtained*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The types of product fulfillment reports available - in this case transaction details used for tax obligations and reporting*/
    @MetaField
    private String productArrangementInstanceReportType;

    /*The product/service activity report - transactional activity used for taxation and reporting*/
    @MetaField
    private String productArrangementInstanceReport;

    /*Defines content/transaction types to be included in the report extract*/
    @MetaField
    private String reportOptionsSelectionCriteria;

    /*The from-to dates covered by the report for tax reporting*/
    @MetaField
    private String reportPeriod;

    /*Defines presentation format*/
    @MetaField
    private String reportFormatTemplate;

    /*The requested product/service activity report used in the taxation consolidation task*/
    @MetaField
    private String report;

    /*Work documentation, forms and schedules produced and referenced during the consolidation*/
    @MetaField
    private String customerTaxHandlingConsolidationWorkProducts;

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

    public void setCustomerTaxHandlingConsolidationWorkProducts(String customerTaxHandlingConsolidationWorkProducts) {
        this.customerTaxHandlingConsolidationWorkProducts = customerTaxHandlingConsolidationWorkProducts;
    }

    public String getCustomerTaxHandlingConsolidationWorkProducts() {
        return customerTaxHandlingConsolidationWorkProducts;
    }
}