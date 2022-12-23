/*Operate equipment and/or a largely automated facility within Correspondence. */
package org.museframework.bian.correspondence.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorrespondenceOperatingSession {
    /*Service activity statistics that are maintained during the session*/
    @MetaField
    private String correspondenceServiceSessionStatistics;

    /*Session reports that can be accessed during the session (e.g. real-time status, session statistics)*/
    @MetaField
    private String correspondenceServiceSessionReportType;

    /*The session activity report*/
    @MetaField
    private String correspondenceServiceSessionReport;

    /*Key dates and times for the session*/
    @MetaField
    private String correspondenceServiceSessionDate;

    public void setCorrespondenceServiceSessionStatistics(String correspondenceServiceSessionStatistics) {
        this.correspondenceServiceSessionStatistics = correspondenceServiceSessionStatistics;
    }

    public String getCorrespondenceServiceSessionStatistics() {
        return correspondenceServiceSessionStatistics;
    }

    public void setCorrespondenceServiceSessionReportType(String correspondenceServiceSessionReportType) {
        this.correspondenceServiceSessionReportType = correspondenceServiceSessionReportType;
    }

    public String getCorrespondenceServiceSessionReportType() {
        return correspondenceServiceSessionReportType;
    }

    public void setCorrespondenceServiceSessionReport(String correspondenceServiceSessionReport) {
        this.correspondenceServiceSessionReport = correspondenceServiceSessionReport;
    }

    public String getCorrespondenceServiceSessionReport() {
        return correspondenceServiceSessionReport;
    }

    public void setCorrespondenceServiceSessionDate(String correspondenceServiceSessionDate) {
        this.correspondenceServiceSessionDate = correspondenceServiceSessionDate;
    }

    public String getCorrespondenceServiceSessionDate() {
        return correspondenceServiceSessionDate;
    }
}