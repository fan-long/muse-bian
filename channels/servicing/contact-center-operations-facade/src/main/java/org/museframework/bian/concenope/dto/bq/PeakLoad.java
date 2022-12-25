/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.concenope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PeakLoad {
    /*Tracked activity and performance statistics used to manage the contact center resource assignments and menu configuration*/
    @MetaField(0)
    private String contactCenterServiceStatistics;

    /*The type of activity that is tracked and analyze (e.g. wait time, average handle time, dropped call ratio, resolution rate)*/
    @MetaField(0)
    private String contactCenterServiceStatisticType;

    /*The task undertaken to address a detected peak load condition*/
    @MetaField(0)
    private String peakLoadResponseTask;

    /*The type of response (e.g. staff reassignment)*/
    @MetaField(0)
    private String peakLoadResponseTaskType;

    /*Description of the action taken and impact to service performance*/
    @MetaField(0)
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