/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.concenope.dto.bq;

public class PeakLoad {
    /*Tracked activity and performance statistics used to manage the contact center resource assignments and menu configuration*/
    private String contactCenterServiceStatistics;

    /*The type of activity that is tracked and analyze (e.g. wait time, average handle time, dropped call ratio, resolution rate)*/
    private String contactCenterServiceStatisticType;

    /*The task undertaken to address a detected peak load condition*/
    private String peakLoadResponseTask;

    /*The type of response (e.g. staff reassignment)*/
    private String peakLoadResponseTaskType;

    /*Description of the action taken and impact to service performance*/
    private String peakLoadResponseDescription;

    public void setContactCenterServiceStatistics(String contactCenterServiceStatistics) {
        this.contactCenterServiceStatistics = contactCenterServiceStatistics;
    }

    public String getContactCenterServiceStatistics() {
        return contactCenterServiceStatistics;
    }

    public void setContactCenterServiceStatisticType(String contactCenterServiceStatisticType) {
        this.contactCenterServiceStatisticType = contactCenterServiceStatisticType;
    }

    public String getContactCenterServiceStatisticType() {
        return contactCenterServiceStatisticType;
    }

    public void setPeakLoadResponseTask(String peakLoadResponseTask) {
        this.peakLoadResponseTask = peakLoadResponseTask;
    }

    public String getPeakLoadResponseTask() {
        return peakLoadResponseTask;
    }

    public void setPeakLoadResponseTaskType(String peakLoadResponseTaskType) {
        this.peakLoadResponseTaskType = peakLoadResponseTaskType;
    }

    public String getPeakLoadResponseTaskType() {
        return peakLoadResponseTaskType;
    }

    public void setPeakLoadResponseDescription(String peakLoadResponseDescription) {
        this.peakLoadResponseDescription = peakLoadResponseDescription;
    }

    public String getPeakLoadResponseDescription() {
        return peakLoadResponseDescription;
    }
}