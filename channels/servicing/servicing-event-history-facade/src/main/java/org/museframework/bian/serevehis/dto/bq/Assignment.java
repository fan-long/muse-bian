/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.serevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Assignment {
    /*Key dates and times associated with the assignment (e.g. start, end, break duration, available/idle time)*/
    @MetaField
    private String dateTimeLocation;

    /*Log of servicing activity at that position during the session (e.g. contacts, sales, issues, breaks)*/
    @MetaField
    private String servicingPositionActivityReport;

    /*Accumulated statistics during the session (e.g. average contact time, wait time, service utilization, facility usage)*/
    @MetaField
    private String servicingPositionActivityStatistics;

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }

    public void setServicingPositionActivityReport(String servicingPositionActivityReport) {
        this.servicingPositionActivityReport = servicingPositionActivityReport;
    }

    public String getServicingPositionActivityReport() {
        return servicingPositionActivityReport;
    }

    public void setServicingPositionActivityStatistics(String servicingPositionActivityStatistics) {
        this.servicingPositionActivityStatistics = servicingPositionActivityStatistics;
    }

    public String getServicingPositionActivityStatistics() {
        return servicingPositionActivityStatistics;
    }
}