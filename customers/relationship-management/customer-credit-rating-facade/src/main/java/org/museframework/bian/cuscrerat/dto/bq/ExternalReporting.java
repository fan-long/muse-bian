/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.cuscrerat.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ExternalReporting {
    /*The schedule for the upload of the data file/report from the external agency (can be ad-hoc)*/
    @MetaField
    private String ratingAgencyReportSchedule;

    /*Defines the type of credit assessment report provided  (e.g. reference check, credit score, long/short form credit report)*/
    @MetaField
    private String ratingAgencyCreditReportType;

    /*Reference to the report provided by the agency*/
    @MetaField
    private String referencetotheratingagencycreditreport;

    /*The customer's credit report from the agency*/
    @MetaField
    private String ratingAgencyCreditReport;

    /*The date time the credit report was downloaded (content will define refresh history)*/
    @MetaField
    private String ratingAgencyCreditReportDate;

    public void setRatingAgencyReportSchedule(String ratingAgencyReportSchedule) {
        this.ratingAgencyReportSchedule = ratingAgencyReportSchedule;
    }

    public String getRatingAgencyReportSchedule() {
        return ratingAgencyReportSchedule;
    }

    public void setRatingAgencyCreditReportType(String ratingAgencyCreditReportType) {
        this.ratingAgencyCreditReportType = ratingAgencyCreditReportType;
    }

    public String getRatingAgencyCreditReportType() {
        return ratingAgencyCreditReportType;
    }

    public void setReferencetotheratingagencycreditreport(String referencetotheratingagencycreditreport) {
        this.referencetotheratingagencycreditreport = referencetotheratingagencycreditreport;
    }

    public String getReferencetotheratingagencycreditreport() {
        return referencetotheratingagencycreditreport;
    }

    public void setRatingAgencyCreditReport(String ratingAgencyCreditReport) {
        this.ratingAgencyCreditReport = ratingAgencyCreditReport;
    }

    public String getRatingAgencyCreditReport() {
        return ratingAgencyCreditReport;
    }

    public void setRatingAgencyCreditReportDate(String ratingAgencyCreditReportDate) {
        this.ratingAgencyCreditReportDate = ratingAgencyCreditReportDate;
    }

    public String getRatingAgencyCreditReportDate() {
        return ratingAgencyCreditReportDate;
    }
}