/*Operate equipment and/or a largely automated facility within Point of Service. */
package org.museframework.bian.poiofser.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PointofServiceOperatingSession {
    /*Defines how the servicing position is set-up in terms of supporting functions and application connections*/
    @MetaField
    private String servicingPositionConfigurationSet_up;

    /*Reference to the servicing position, used to route customer contacts*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingPositionReference;

    /*Defines the type of position (e.g. teller, relationship manager, servicing agent)*/
    @MetaField
    private String servicingPositionType;

    /*The physical address/location of the position, branch reference etc.*/
    @MetaField
    private String servicingPositionLocation;

    /*The type of function supported at the POS  (e.g. customer servicing, FX, teller services, commissions)*/
    @MetaField
    private String servicingPositionFacilityType;

    /*Reference to the facilities and applications available/supporting the POS  (e.g. customer servicing, FX, teller services, commissions)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingPositionFacilityReference;

    /*The times the position will be available/staffed within this session. Allows for booking time in advance*/
    @MetaField
    private String servicingPositionSchedule;

    /*Log of the activities during the session*/
    @MetaField
    private String servicingPositionActivityReport;

    /*Service activity statistics that are maintained during the session  (e.g. average contact time, wait time, service utilization, facility usage)*/
    @MetaField
    private String servicingPositionOperatingSessionStatistics;

    /*Session reports that can be accessed during the session (e.g. real-time status, session statistics)*/
    @MetaField
    private String servicingPositionOperatingSessionReportType;

    /*The session activity report*/
    @MetaField
    private String servicingPositionOperatingSessionReport;

    public void setServicingPositionConfigurationSet_up(String servicingPositionConfigurationSet_up) {
        this.servicingPositionConfigurationSet_up = servicingPositionConfigurationSet_up;
    }

    public String getServicingPositionConfigurationSet_up() {
        return servicingPositionConfigurationSet_up;
    }

    public void setServicingPositionReference(org.museframework.bian.classes.Object servicingPositionReference) {
        this.servicingPositionReference = servicingPositionReference;
    }

    public org.museframework.bian.classes.Object getServicingPositionReference() {
        return servicingPositionReference;
    }

    public void setServicingPositionType(String servicingPositionType) {
        this.servicingPositionType = servicingPositionType;
    }

    public String getServicingPositionType() {
        return servicingPositionType;
    }

    public void setServicingPositionLocation(String servicingPositionLocation) {
        this.servicingPositionLocation = servicingPositionLocation;
    }

    public String getServicingPositionLocation() {
        return servicingPositionLocation;
    }

    public void setServicingPositionFacilityType(String servicingPositionFacilityType) {
        this.servicingPositionFacilityType = servicingPositionFacilityType;
    }

    public String getServicingPositionFacilityType() {
        return servicingPositionFacilityType;
    }

    public void setServicingPositionFacilityReference(org.museframework.bian.classes.Object servicingPositionFacilityReference) {
        this.servicingPositionFacilityReference = servicingPositionFacilityReference;
    }

    public org.museframework.bian.classes.Object getServicingPositionFacilityReference() {
        return servicingPositionFacilityReference;
    }

    public void setServicingPositionSchedule(String servicingPositionSchedule) {
        this.servicingPositionSchedule = servicingPositionSchedule;
    }

    public String getServicingPositionSchedule() {
        return servicingPositionSchedule;
    }

    public void setServicingPositionActivityReport(String servicingPositionActivityReport) {
        this.servicingPositionActivityReport = servicingPositionActivityReport;
    }

    public String getServicingPositionActivityReport() {
        return servicingPositionActivityReport;
    }

    public void setServicingPositionOperatingSessionStatistics(String servicingPositionOperatingSessionStatistics) {
        this.servicingPositionOperatingSessionStatistics = servicingPositionOperatingSessionStatistics;
    }

    public String getServicingPositionOperatingSessionStatistics() {
        return servicingPositionOperatingSessionStatistics;
    }

    public void setServicingPositionOperatingSessionReportType(String servicingPositionOperatingSessionReportType) {
        this.servicingPositionOperatingSessionReportType = servicingPositionOperatingSessionReportType;
    }

    public String getServicingPositionOperatingSessionReportType() {
        return servicingPositionOperatingSessionReportType;
    }

    public void setServicingPositionOperatingSessionReport(String servicingPositionOperatingSessionReport) {
        this.servicingPositionOperatingSessionReport = servicingPositionOperatingSessionReport;
    }

    public String getServicingPositionOperatingSessionReport() {
        return servicingPositionOperatingSessionReport;
    }
}