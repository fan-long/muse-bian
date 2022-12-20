/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.regulatoryreporting.dto.bq;

public class Authoring {
    /*Details the production information/measurements required for reporting - includes reporting format*/
    private String regulatoryReportTypeComplianceReportingRequirements;

    /*The time period covered by a report*/
    private String reportingPeriod;

    /*Refers to the company group or subsidiary covered by the regulatory report*/
    private org.museframework.bian.classes.Object reportingBusinessLegalEntityReference;

    /*Refers to the responsible reporting business units for the report*/
    private org.museframework.bian.classes.Object reportingBusinessUnitReference;

    /*Refers to the regulatory report*/
    private org.museframework.bian.classes.Object regulatoryReportReference;

    /*The regulatory report in any suitable format and media*/
    private String regulatoryReport;

    /*The document reference for the record of the report*/
    private org.museframework.bian.classes.Object regulatoryReportDocumentReference;

    public void setRegulatoryReportTypeComplianceReportingRequirements(String regulatoryReportTypeComplianceReportingRequirements) {
        this.regulatoryReportTypeComplianceReportingRequirements = regulatoryReportTypeComplianceReportingRequirements;
    }

    public String getRegulatoryReportTypeComplianceReportingRequirements() {
        return regulatoryReportTypeComplianceReportingRequirements;
    }

    public void setReportingPeriod(String reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    public String getReportingPeriod() {
        return reportingPeriod;
    }

    public void setReportingBusinessLegalEntityReference(org.museframework.bian.classes.Object reportingBusinessLegalEntityReference) {
        this.reportingBusinessLegalEntityReference = reportingBusinessLegalEntityReference;
    }

    public org.museframework.bian.classes.Object getReportingBusinessLegalEntityReference() {
        return reportingBusinessLegalEntityReference;
    }

    public void setReportingBusinessUnitReference(org.museframework.bian.classes.Object reportingBusinessUnitReference) {
        this.reportingBusinessUnitReference = reportingBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getReportingBusinessUnitReference() {
        return reportingBusinessUnitReference;
    }

    public void setRegulatoryReportReference(org.museframework.bian.classes.Object regulatoryReportReference) {
        this.regulatoryReportReference = regulatoryReportReference;
    }

    public org.museframework.bian.classes.Object getRegulatoryReportReference() {
        return regulatoryReportReference;
    }

    public void setRegulatoryReport(String regulatoryReport) {
        this.regulatoryReport = regulatoryReport;
    }

    public String getRegulatoryReport() {
        return regulatoryReport;
    }

    public void setRegulatoryReportDocumentReference(org.museframework.bian.classes.Object regulatoryReportDocumentReference) {
        this.regulatoryReportDocumentReference = regulatoryReportDocumentReference;
    }

    public org.museframework.bian.classes.Object getRegulatoryReportDocumentReference() {
        return regulatoryReportDocumentReference;
    }
}