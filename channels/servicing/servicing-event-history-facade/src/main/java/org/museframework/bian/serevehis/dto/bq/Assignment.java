/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.serevehis.dto.bq;

public class Assignment {
    /*Key dates and times associated with the assignment (e.g. start, end, break duration, available/idle time)*/
    private String dateTimeLocation;

    /*Log of servicing activity at that position during the session (e.g. contacts, sales, issues, breaks)*/
    private String servicingPositionActivityReport;

    /*Accumulated statistics during the session (e.g. average contact time, wait time, service utilization, facility usage)*/
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