/*The product features/services available with a financical facility*/
package org.museframework.bian.custaxhan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Reporting {
    /*Reference to the customer tax report - sent to the customer or tax authority directly*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerTaxReportInstanceReference;

    /*The type of tax report, includes products/services covered and the tax jurisdiction/authority reference as necessary*/
    @MetaField(0)
    private String customerTaxReportType;

    /*The reporting period, detailing from-to dates covered by the tax report*/
    @MetaField(0)
    private String customerTaxReportPeriod;

    /*The customer's consolidated product/service tax report*/
    @MetaField(0)
    private String customerTaxReportReport;

    /*Work documentation, forms and schedules produced and referenced during the reporting task*/
    @MetaField(0)
    private String customerTaxHandlingReportingWorkProducts;

    public void setCustomerTaxReportInstanceReference(org.museframework.bian.classes.Object customerTaxReportInstanceReference) {
        this.customerTaxReportInstanceReference = customerTaxReportInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerTaxReportInstanceReference() {
        return customerTaxReportInstanceReference;
    }

    public void setCustomerTaxReportType(String customerTaxReportType) {
        this.customerTaxReportType = customerTaxReportType;
    }

    public String getCustomerTaxReportType() {
        return customerTaxReportType;
    }

    public void setCustomerTaxReportPeriod(String customerTaxReportPeriod) {
        this.customerTaxReportPeriod = customerTaxReportPeriod;
    }

    public String getCustomerTaxReportPeriod() {
        return customerTaxReportPeriod;
    }

    public void setCustomerTaxReportReport(String customerTaxReportReport) {
        this.customerTaxReportReport = customerTaxReportReport;
    }

    public String getCustomerTaxReportReport() {
        return customerTaxReportReport;
    }

    public void setCustomerTaxHandlingReportingWorkProducts(String customerTaxHandlingReportingWorkProducts) {
        this.customerTaxHandlingReportingWorkProducts = customerTaxHandlingReportingWorkProducts;
    }

    public String getCustomerTaxHandlingReportingWorkProducts() {
        return customerTaxHandlingReportingWorkProducts;
    }
}