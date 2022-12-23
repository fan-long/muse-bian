/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.cuscrerat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InternalReporting {
    /*Reference to the internal bank product and service activity report that is used for the credit assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceActivityReportReference;

    /*The schedule for the upload of the data file/report*/
    @MetaField
    private String productandServiceActivityReportSchedule;

    /*The report data file/report of customer production activity*/
    @MetaField
    private String productandServiceActivityReport;

    public void setProductandServiceActivityReportReference(org.museframework.bian.classes.Object productandServiceActivityReportReference) {
        this.productandServiceActivityReportReference = productandServiceActivityReportReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceActivityReportReference() {
        return productandServiceActivityReportReference;
    }

    public void setProductandServiceActivityReportSchedule(String productandServiceActivityReportSchedule) {
        this.productandServiceActivityReportSchedule = productandServiceActivityReportSchedule;
    }

    public String getProductandServiceActivityReportSchedule() {
        return productandServiceActivityReportSchedule;
    }

    public void setProductandServiceActivityReport(String productandServiceActivityReport) {
        this.productandServiceActivityReport = productandServiceActivityReport;
    }

    public String getProductandServiceActivityReport() {
        return productandServiceActivityReport;
    }
}