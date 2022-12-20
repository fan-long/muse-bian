/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.achoperations.dto.bq;

public class Warehousing {
    /*The schedule for handling the warehoused transaction batch*/
    private String scheduleReleaseDateTime;

    public void setScheduleReleaseDateTime(String scheduleReleaseDateTime) {
        this.scheduleReleaseDateTime = scheduleReleaseDateTime;
    }

    public String getScheduleReleaseDateTime() {
        return scheduleReleaseDateTime;
    }
}